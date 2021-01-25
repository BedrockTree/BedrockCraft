package com.frank.item.tool;

import com.frank.Main;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class BedrockHoe extends ItemHoe {
    public BedrockHoe() {
        super(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        this.setUnlocalizedName(Main.MOD_ID + ".BedrockHoe");
        this.setRegistryName("bedrock_hoe");
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
