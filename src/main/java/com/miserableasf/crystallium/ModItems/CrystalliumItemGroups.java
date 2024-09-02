package com.miserableasf.crystallium.ModItems;

import com.miserableasf.crystallium.Crystallium;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class CrystalliumItemGroups {
    private static final Text CRYSTALLIUM_TITLE = Text.translatable("itemGroup." + Crystallium.MOD_ID + ".crystallium_tab");
    private static final Text CRYSTALLIUM_FOOD_TITLE = Text.translatable("itemGroup." + Crystallium.MOD_ID + ".crystallium_food_tab");
    private static final Text CRYSTALLIUM_WEAPONS_TITLE = Text.translatable("itemGroup." + Crystallium.MOD_ID + ".crystallium_weapons_tab");

    public static final ItemGroup CRYSTALLIUM_TAB = register("crystallium_tab", FabricItemGroup.builder()
            .displayName(CRYSTALLIUM_TITLE)
            .icon(CrystalliumItems.SAPPHIRE::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(new ItemStack(CrystalliumItems.SAPPHIRE));
                entries.add(new ItemStack(CrystalliumItems.TOPAZ));
                entries.add(new ItemStack(CrystalliumItems.RUBY));
                entries.add(new ItemStack(CrystalliumItems.OBSIDIAN_CRYSTAL));
                entries.add(new ItemStack(CrystalliumItems.ULTIMATE_PIECE));
            })
            .build());

    public static final ItemGroup CRYSTALLIUM_WEAPONS_TAB = register("crystallium_weapons_tab", FabricItemGroup.builder()
            .displayName(CRYSTALLIUM_WEAPONS_TITLE)
            .icon(CrystalliumItems.RUBY_GAUNTLET::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(new ItemStack(CrystalliumItems.RUBY_GAUNTLET));
                entries.add(new ItemStack(CrystalliumItems.TOPAZ_SPEAR));
                entries.add(new ItemStack(CrystalliumItems.OBSIDIAN_MACE));
                entries.add(new ItemStack(CrystalliumItems.ULTIMATE_KATANA));
            })
            .build());
//TODO: weapons
    public static final ItemGroup CRYSTALLIUM_FOOD_TAB = register("crystallium_food_tab", FabricItemGroup.builder()
            .displayName(CRYSTALLIUM_FOOD_TITLE)
            .icon(CrystalliumItems.NETHERITE_APPLE::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(new ItemStack(CrystalliumItems.SAPPHIRE_APPLE));
                entries.add(new ItemStack(CrystalliumItems.TOPAZ_APPLE));
                entries.add(new ItemStack(CrystalliumItems.RUBY_APPLE));
                entries.add(new ItemStack(CrystalliumItems.OBSIDIAN_APPLE));
                entries.add(new ItemStack(CrystalliumItems.LAPIS_APPLE));
                entries.add(new ItemStack(CrystalliumItems.DIAMOND_APPLE));
                entries.add(new ItemStack(CrystalliumItems.NETHERITE_APPLE));
                entries.add(new ItemStack(CrystalliumItems.COAL_APPLE));
                entries.add(new ItemStack(CrystalliumItems.IRON_APPLE));
                entries.add(new ItemStack(CrystalliumItems.COPPER_APPLE));
                entries.add(new ItemStack(CrystalliumItems.EMERALD_APPLE));
                entries.add(new ItemStack(CrystalliumItems.ULTIMATE_APPLE));
                entries.add(new ItemStack(CrystalliumItems.SAPPHIRE_CARROT));
                entries.add(new ItemStack(CrystalliumItems.TOPAZ_CARROT));
                entries.add(new ItemStack(CrystalliumItems.RUBY_CARROT));
                entries.add(new ItemStack(CrystalliumItems.OBSIDIAN_CARROT));
                entries.add(new ItemStack(CrystalliumItems.LAPIS_CARROT));
                entries.add(new ItemStack(CrystalliumItems.DIAMOND_CARROT));
                entries.add(new ItemStack(CrystalliumItems.NETHERITE_CARROT));
                entries.add(new ItemStack(CrystalliumItems.COAL_CARROT));
                entries.add(new ItemStack(CrystalliumItems.COPPER_CARROT));
                entries.add(new ItemStack(CrystalliumItems.IRON_CARROT));
                entries.add(new ItemStack(CrystalliumItems.EMERALD_CARROT));
                entries.add(new ItemStack(CrystalliumItems.ULTIMATE_CARROT));
            })
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, Crystallium.id(name), itemGroup);
    }

    public static void load() {}
}
