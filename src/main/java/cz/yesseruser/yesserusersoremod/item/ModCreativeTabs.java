package cz.yesseruser.yesserusersoremod.item;

import cz.yesseruser.yesserusersoremod.YesserusersOreMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YesserusersOreMod.MODID);

    public static final RegistryObject<CreativeModeTab> GEM_TAB =
            CREATIVE_MODE_TABS.register(
                    "gem_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                            .title(Component.translatable("creativetab.gem_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.RUBY.get());
                                pOutput.accept(ModItems.SAPPHIRE.get());
                            })
                            .build()
            );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
