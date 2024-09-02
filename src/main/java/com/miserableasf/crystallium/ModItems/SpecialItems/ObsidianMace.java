package com.miserableasf.crystallium.ModItems.SpecialItems;

import com.miserableasf.crystallium.ModItems.CrystalliumItems;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class ObsidianMace extends SwordItem {
    public ObsidianMace(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    public static ToolComponent createToolComponent() {
        return new ToolComponent(List.of(), 1f, 2);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof ServerPlayerEntity serverPlayerEntity) {
            if (shouldDealAdditionalDamage(serverPlayerEntity)) {
                ServerWorld serverWorld = (ServerWorld)attacker.getWorld();
                if (serverPlayerEntity.shouldIgnoreFallDamageFromCurrentExplosion() && serverPlayerEntity.currentExplosionImpactPos != null) {
                    if (serverPlayerEntity.currentExplosionImpactPos.y > serverPlayerEntity.getPos().y) {
                        serverPlayerEntity.currentExplosionImpactPos = serverPlayerEntity.getPos();
                    }
                } else {
                    serverPlayerEntity.currentExplosionImpactPos = serverPlayerEntity.getPos();
                }

                serverPlayerEntity.setIgnoreFallDamageFromCurrentExplosion(true);
                serverPlayerEntity.setVelocity(serverPlayerEntity.getVelocity().withAxis(Direction.Axis.Y, 0.009999999776482582));
                serverPlayerEntity.networkHandler.sendPacket(new EntityVelocityUpdateS2CPacket(serverPlayerEntity));
                if (target.isOnGround()) {
                    serverPlayerEntity.setSpawnExtraParticlesOnFall(true);
                    SoundEvent soundEvent = serverPlayerEntity.fallDistance > 5.0F ? SoundEvents.ITEM_MACE_SMASH_GROUND_HEAVY : SoundEvents.ITEM_MACE_SMASH_GROUND;
                    serverWorld.playSound(null, serverPlayerEntity.getX(), serverPlayerEntity.getY(), serverPlayerEntity.getZ(), soundEvent, serverPlayerEntity.getSoundCategory(), 1.0F, 1.0F);
                } else {
                    serverWorld.playSound(null, serverPlayerEntity.getX(), serverPlayerEntity.getY(), serverPlayerEntity.getZ(), SoundEvents.ITEM_MACE_SMASH_AIR, serverPlayerEntity.getSoundCategory(), 1.0F, 1.0F);
                }
            }
        }

        return true;
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, EquipmentSlot.MAINHAND);
        if (shouldDealAdditionalDamage(attacker)) {
            attacker.onLanding();
        }
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isOf(CrystalliumItems.OBSIDIAN_CRYSTAL);
    }

    @Override
    public float getBonusAttackDamage(Entity target, float baseAttackDamage, DamageSource damageSource) {
        Entity attacker = damageSource.getSource();
        if (attacker instanceof LivingEntity livingEntity) {
            if (!shouldDealAdditionalDamage(livingEntity)) {
                return 0.0F;
            } else {
                float f = 3.0F;
                float g = 8.0F;
                float h = livingEntity.fallDistance;
                float i;
                if (h <= 3.0F) {
                    i = 4.0F * h;
                } else if (h <= 8.0F) {
                    i = 12.0F + 2.0F * (h - 3.0F);
                } else {
                    i = 22.0F + h - 8.0F;
                }

                World world = livingEntity.getWorld();
                if (world instanceof ServerWorld serverWorld) {
                    return i + EnchantmentHelper.getSmashDamagePerFallenBlock(serverWorld, livingEntity.getWeaponStack(), target, damageSource, 0.0F) * h;
                } else {
                    return i;
                }
            }
        } else {
            return 0.0F;
        }
    }

    private static void knockbackNearbyEntities(World world, PlayerEntity player, Entity attacked) {
        world.syncWorldEvent(2013, attacked.getSteppingPos(), 750);
        world.getEntitiesByClass(LivingEntity.class, attacked.getBoundingBox().expand(3.5), getKnockbackPredicate(player, attacked)).forEach((entity) -> {
            Vec3d vec3d = entity.getPos().subtract(attacked.getPos());
            double d = getKnockback(player, entity, vec3d);
            Vec3d vec3d2 = vec3d.normalize().multiply(d);
            if (d > 0.0) {
                entity.addVelocity(vec3d2.x, 0.699999988079071, vec3d2.z);
                if (entity instanceof ServerPlayerEntity serverPlayerEntity) {
                    serverPlayerEntity.networkHandler.sendPacket(new EntityVelocityUpdateS2CPacket(serverPlayerEntity));
                }
            }

        });
    }

//    what the actual fuck???
    private static Predicate<LivingEntity> getKnockbackPredicate(PlayerEntity player, Entity attacked) {
        return (entity) -> {
            boolean bool;
            boolean playerBool;
            boolean attackedEntity;
            boolean notInTeam;
            result_first: {
                playerBool = !entity.isSpectator();
                attackedEntity = entity != player && entity != attacked;
                notInTeam = !player.isTeammate(entity);
                if (entity instanceof TameableEntity tameableEntity) {
                    if (tameableEntity.isTamed() && player.getUuid().equals(tameableEntity.getOwnerUuid())) {
                        bool = true;
                        break result_first;
                    }
                }

                bool = false;
            }

            boolean not_bool;
            result_second: {
                not_bool = !bool;
                if (entity instanceof ArmorStandEntity armorStandEntity) {
                    if (armorStandEntity.isMarker()) {
                        bool = false;
                        break result_second;
                    }
                }

                bool = true;
            }

            boolean b = bool;
            boolean compare_range = attacked.squaredDistanceTo(entity) <= Math.pow(3.5, 2.0);
            return playerBool && attackedEntity && notInTeam && not_bool && b && compare_range;
        };
    }

    private static double getKnockback(PlayerEntity player, LivingEntity attacked, Vec3d distance) {
        return (3.5 - distance.length()) * 0.699999988079071 * (double)(player.fallDistance > 5.0F ? 2 : 1) * (1.0 - attacked.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
    }

    public static boolean shouldDealAdditionalDamage(LivingEntity attacker) {
        return attacker.fallDistance > 1.5F && !attacker.isFallFlying();
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (world != null && !world.isClient()) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60, 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60, 1));
            user.getItemCooldownManager().set(this, 300);
        }
        return new TypedActionResult<>(ActionResult.SUCCESS, stack);
    }
}
