package net.miserableasf.crystallium.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.miserableasf.crystallium.CrystalliumMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrystalliumMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> OBSIDIAN_CRYSTAL = ITEMS.register("obsidian_crystal", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ULTIMATE_PIECE = ITEMS.register("ultimate_piece", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
//TODO: achievements

    public static final RegistryObject<Item> SAPPHIRE_APPLE = ITEMS.register("sapphire_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
            .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3000, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 3000, 0), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> RUBY_APPLE = ITEMS.register("ruby_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 1500, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 1), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> TOPAZ_APPLE = ITEMS.register("topaz_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 300, 0), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> OBSIDIAN_APPLE = ITEMS.register("obsidian_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1500, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 2), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> LAPIZ_APPLE = ITEMS.register("lapiz_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.LUCK, 3000, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3000, 0), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> COPPER_APPLE = ITEMS.register("copper_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 1), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 150, 1), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> COAl_APPLE = ITEMS.register("coal_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 300, 1), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 300, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 0), 1f)
                    .build()).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ULTIMATE_APPLE = ITEMS.register("ultimate_apple", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 2), 1f)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 600, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0), 1f)
                    .build()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> SAPPHIRE_CARROT = ITEMS.register("sapphire_carrot", () -> new Item(new Item.Properties()
            .rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(6)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> RUBY_CARROT = ITEMS.register("ruby_carrot", () -> new Item(new Item.Properties()
            .rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(6)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> TOPAZ_CARROT = ITEMS.register("topaz_carrot", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(8)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> OBSIDIAN_CARROT = ITEMS.register("obsidian_carrot", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(8)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> LAPIZ_CARROT = ITEMS.register("lapiz_carrot", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.LUCK, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(6)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> NETHERRITE_CARROT = ITEMS.register("netherrite_carrot", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3000, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 3000, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> COPPER_CARROT = ITEMS.register("copper_carrot", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 1f)
                    .build())));
    public static final RegistryObject<Item> IRON_CARROT = ITEMS.register("iron_carrot", () -> new Item(new Item.Properties().rarity(Rarity.COMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> COAL_CARROT = ITEMS.register("coal_carrot", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 300, 0), 1f)
                    .build())));
    public static final RegistryObject<Item> EMERALD_CARROT = ITEMS.register("emerald_carrot", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1f)
                    .build())));
    public static final RegistryObject<Item> ULTIMATE_CARROT = ITEMS.register("ultimate_carrot", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 1200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1200, 0), 1f)
                    .build())));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}