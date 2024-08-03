package com.miserableasf.crystallium.ModItems;

import com.miserableasf.crystallium.Crystallium;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class CrystalliumItems {
    public static final Item SAPPHIRE = register("sapphire", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY = register("ruby", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ = register("topaz", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item OBSIDIAN_CRYSTAL = register("obsidian_crystal", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    public static final Item ULTIMATE_PIECE = register("ultimate_piece", new Item(new Item.Settings().rarity(Rarity.RARE)));
//TODO: achievements

    public static final Item SAPPHIRE_APPLE = register("sapphire_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 3000, 0), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item RUBY_APPLE = register("ruby_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1500, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item TOPAZ_APPLE = register("topaz_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 300, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300, 0), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item OBSIDIAN_APPLE = register("obsidian_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1500, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 2), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item LAPIS_APPLE = register("lapis_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 3000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3000, 0), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item DIAMOND_APPLE = register("diamond_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item NETHERITE_APPLE = register("netherite_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 600, 0), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item COPPER_APPLE = register("copper_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item IRON_APPLE = register("iron_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 150, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item COAL_APPLE = register("coal_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item EMERALD_APPLE = register("emerald_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 300, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 0), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item ULTIMATE_APPLE = register("ultimate_apple", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0), 1f)
            .build()).rarity(Rarity.EPIC)));

    public static final Item SAPPHIRE_CARROT = register("sapphire_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item RUBY_CARROT = register("ruby_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 600, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item TOPAZ_CARROT = register("topaz_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item OBSIDIAN_CARROT = register("obsidian_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item LAPIS_CARROT = register("lapis_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item DIAMOND_CARROT = register("diamond_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item NETHERITE_CARROT = register("netherite_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item COPPER_CARROT = register("copper_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item IRON_CARROT = register("iron_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1f)
            .build()).rarity(Rarity.COMMON)));

    public static final Item COAL_CARROT = register("coal_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300, 0), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item EMERALD_CARROT = register("emerald_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1f)
            .build()).rarity(Rarity.UNCOMMON)));

    public static final Item ULTIMATE_CARROT = register("ultimate_carrot", new Item(new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1200, 0), 1f)
            .build()).rarity(Rarity.EPIC)));

    public static final Item RUBY_GAUNTLET = register("ruby_gauntlet", new RubyGauntlet());

//    public static final SwordItem SAPPHIRE_KNIFE = register("sapphire_knife", new Item(() -> new SwordItem(
////TODO: tool material yee
//    )));
//todo: sapphire knife, topaz spear, obsidian mace, ultimate katana
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Crystallium.id(name), item);
    }

    public static void load() {

    }
}