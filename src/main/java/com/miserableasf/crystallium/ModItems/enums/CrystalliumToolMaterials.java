package com.miserableasf.crystallium.ModItems.enums;

import com.miserableasf.crystallium.ModItems.CrystalliumItems;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum CrystalliumToolMaterials implements ToolMaterial {
    SAPPHIRE(
            1500,
            1f,
            2f,
            15,
            Ingredient.ofItems(CrystalliumItems.SAPPHIRE),
            BlockTags.INCORRECT_FOR_STONE_TOOL
    ),
    TOPAZ(
            3000,
            1f,
            2f,
            15,
            Ingredient.ofItems(CrystalliumItems.RUBY),
            BlockTags.INCORRECT_FOR_STONE_TOOL
    ),
    OBSIDIAN(
            2000,
            1f,
            2f,
            15,
            Ingredient.ofItems(CrystalliumItems.OBSIDIAN_CRYSTAL),
            BlockTags.INCORRECT_FOR_STONE_TOOL
    ),
    ULTIMATE(
      0,
      1f,
      4f,
      15,
      Ingredient.ofItems(CrystalliumItems.ULTIMATE_PIECE),
      BlockTags.INCORRECT_FOR_STONE_TOOL
    );


    private final int durability;
    private final float miningSpeedMultiplier, attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;
    private final TagKey<Block> inverseTag;

    CrystalliumToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Ingredient repairIngredient, TagKey<Block> inverseTag) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
        this.inverseTag = inverseTag;
    }


    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
