package com.miserableasf.crystallium.ModItems.SpecialItems;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class TopazSpear extends SwordItem {
    public TopazSpear(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }
//    TODO: in future make it throwable like a trident!(ye)

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100));
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100));
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        if (!world.isClient && world != null) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1));
            user.getItemCooldownManager().set(this, 200);
        }
        return super.use(world, user, hand);
    }
}
