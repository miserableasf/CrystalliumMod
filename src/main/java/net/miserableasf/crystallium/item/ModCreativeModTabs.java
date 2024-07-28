package net.miserableasf.crystallium.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.miserableasf.crystallium.CrystalliumMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrystalliumMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRYSTALLIUM_TAB = CREATIVE_MODE_TAB.register("crystallium_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OBSIDIAN_CRYSTAL.get()))
            .title(Component.translatable("creativetab.crystallium_tab"))
            .displayItems(((pParameters, pOutput) -> {
                pOutput.accept(ModItems.SAPPHIRE.get());
                pOutput.accept(ModItems.TOPAZ.get());
                pOutput.accept(ModItems.RUBY.get());
                pOutput.accept(ModItems.OBSIDIAN_CRYSTAL.get());

                pOutput.accept(ModItems.ULTIMATE_PIECE.get());
            }))
            .build());

    public static final RegistryObject<CreativeModeTab> CRYSTRALLIUM_FOOD_TAB = CREATIVE_MODE_TAB.register("crystallium_food_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_APPLE.get()))
            .title(Component.translatable("creativetab.crystallium_food_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.SAPPHIRE_APPLE.get());
                pOutput.accept(ModItems.TOPAZ_APPLE.get());
                pOutput.accept(ModItems.RUBY_APPLE.get());
                pOutput.accept(ModItems.OBSIDIAN_APPLE.get());
                pOutput.accept(ModItems.LAPIZ_APPLE.get());
                pOutput.accept(ModItems.DIAMOND_APPLE.get());
                pOutput.accept(ModItems.NETHERITE_APPLE.get());
                pOutput.accept(ModItems.COAl_APPLE.get());
                pOutput.accept(ModItems.IRON_APPLE.get());
                pOutput.accept(ModItems.COPPER_APPLE.get());
                pOutput.accept(ModItems.EMERALD_APPLE.get());
                pOutput.accept(ModItems.ULTIMATE_APPLE.get());

                pOutput.accept(ModItems.SAPPHIRE_CARROT.get());
                pOutput.accept(ModItems.TOPAZ_CARROT.get());
                pOutput.accept(ModItems.RUBY_CARROT.get());
                pOutput.accept(ModItems.OBSIDIAN_CARROT.get());
                pOutput.accept(ModItems.LAPIZ_CARROT.get());
                pOutput.accept(ModItems.DIAMOND_CARROT.get());
                pOutput.accept(ModItems.NETHERRITE_CARROT.get());
                pOutput.accept(ModItems.COAL_CARROT.get());
                pOutput.accept(ModItems.COPPER_CARROT.get());
                pOutput.accept(ModItems.IRON_CARROT.get());
                pOutput.accept(ModItems.EMERALD_CARROT.get());
                pOutput.accept(ModItems.ULTIMATE_CARROT.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
