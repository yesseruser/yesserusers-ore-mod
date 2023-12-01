package cz.yesseruser.yesserusersoremod.item;

import cz.yesseruser.yesserusersoremod.YesserusersOreMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, YesserusersOreMod.MODID);

    public static final RegistryObject<Item> RUBY =
            ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    public  static final RegistryObject<Item> SAPPHIRE =
            ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
