package com.frank.item.tool;

import com.frank.Main;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ObsidianPickaxe extends ItemPickaxe {
    public ObsidianPickaxe() {
        super(MaterialRegistryHandler.OBSIDIAN_TOOL_MATERIAL);
        this.setRegistryName("obsidian_pickaxe");
        this.setUnlocalizedName(Main.MOD_ID + ".ObsidianPickaxe");
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}

