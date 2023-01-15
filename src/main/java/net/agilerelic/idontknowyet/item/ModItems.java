package net.agilerelic.idontknowyet.item;

import net.agilerelic.idontknowyet.idontknowyet;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, idontknowyet.MOD_ID);

    public static final RegistryObject<Item> shiny = ITEMS.register("shiny",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Tutorial_Tab)));
    public static final RegistryObject<Item> raw_shiny = ITEMS.register("raw_shiny",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Tutorial_Tab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
