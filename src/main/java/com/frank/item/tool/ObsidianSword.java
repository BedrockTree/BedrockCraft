package com.frank.item.tool;

import com.frank.Main;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword {
    public ObsidianSword() {
        super(MaterialRegistryHandler.OBSIDIAN_TOOL_MATERIAL);
        this.setRegistryName("obsidian_sword");
        this.setUnlocalizedName(Main.MOD_ID + ".ObsidianSword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
