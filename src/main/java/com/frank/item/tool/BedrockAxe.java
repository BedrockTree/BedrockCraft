package com.frank.item.tool;

import com.frank.Main;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class BedrockAxe extends ItemAxe {
    public BedrockAxe() {
        super(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL, 14,2.5f);
        this.setUnlocalizedName(Main.MOD_ID + ".BedrockAxe");
        this.setRegistryName("bedrock_axe");
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
