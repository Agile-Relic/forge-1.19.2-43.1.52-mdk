package net.agilerelic.idontknowyet.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Tutorial_Tab = new CreativeModeTab("tutorial") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.shiny.get());
        }

    };

}
