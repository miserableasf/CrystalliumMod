package com.miserableasf.crystallium.ModItems.SpecialItems;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class UltimateKatana extends SwordItem {
    public UltimateKatana(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200));
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (world != null && !world.isClient()) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60, 0));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60, 0));
            spawnLightningOnCrosshair((ServerPlayerEntity) user);
            user.getItemCooldownManager().set(this, 100);
        }
        return new TypedActionResult<>(ActionResult.SUCCESS, stack);
    }

    public void spawnLightningOnCrosshair(ServerPlayerEntity player) {
        World world = player.getEntityWorld();
        Vec3d playerPos = player.getPos();
        Vec3d lookVec = player.getRotationVec(1.0F);

        double reach = 100.0;
        Vec3d targetPos = playerPos.add(lookVec.multiply(reach));

        HitResult hitResult = player.raycast(reach, 1.0F, false);

        if (hitResult.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHit = (BlockHitResult) hitResult;
            targetPos = blockHit.getPos();
            if (blockHit.getSide() != Direction.UP) {
                targetPos = targetPos.add(0, 1, 0);
            }
        }

        LightningEntity lightningEntity = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
        lightningEntity.refreshPositionAfterTeleport(targetPos);
        world.spawnEntity(lightningEntity);
    }
}
