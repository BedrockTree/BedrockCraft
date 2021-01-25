package com.frank.item.tool;

import com.frank.Main;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class BedrockSword extends ItemSword {
    public BedrockSword() {
        super(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        this.setUnlocalizedName(Main.MOD_ID + ".BedrockSword");
        this.setRegistryName("bedrock_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
