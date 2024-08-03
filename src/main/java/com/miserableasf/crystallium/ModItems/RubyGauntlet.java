package com.miserableasf.crystallium.ModItems;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class RubyGauntlet extends Item {
    public RubyGauntlet() {
        super(new Item.Settings().maxCount(1).rarity(Rarity.RARE));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        ItemStack stackSecond = user.getStackInHand(Hand.OFF_HAND);

        if (world != null && !world.isClient()) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60, 1));

            if (hasRubyGauntletInOffHand(user)) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 80, 2));
            }
        }

        return new TypedActionResult<>(ActionResult.SUCCESS, stack);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60));

        if (attacker instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) attacker;

            if (hasRubyGauntletInOffHand(player)) {
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 120));
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 1));
            }
        }

        return super.postHit(stack, target, attacker);
    }

    private boolean hasRubyGauntletInOffHand(PlayerEntity player) {
        ItemStack offHandStack = player.getStackInHand(Hand.OFF_HAND);
        return offHandStack.getItem() instanceof RubyGauntlet;
    }
}
