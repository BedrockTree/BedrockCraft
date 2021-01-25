package com.frank.item.tool;

import com.frank.Main;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BedrockPickaxe extends ItemPickaxe {
    public BedrockPickaxe() {
        super(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        this.setUnlocalizedName(Main.MOD_ID + ".BedrockPickaxe");
        this.setRegistryName("bedrock_pickaxe");
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
