package com.frank.item;

import com.frank.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianIngot extends Item {
    public ObsidianIngot() {
        this.setRegistryName("obsidian_ingot");
        this.setUnlocalizedName(Main.MOD_ID + ".ObsidianIngot");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}

