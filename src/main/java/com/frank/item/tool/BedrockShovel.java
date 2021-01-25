package com.frank.item.tool;

import com.frank.Main;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class BedrockShovel extends ItemSpade {
    public BedrockShovel() {
        super(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        this.setUnlocalizedName(Main.MOD_ID + ".BedrockShovel");
        this.setRegistryName("bedrock_shovel");
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
