package com.frank.item.armor;

import com.frank.Main;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ObsidianArmor extends ItemArmor {
    public ObsidianArmor(EntityEquipmentSlot equipmentSlot){
        super(MaterialRegistryHandler.OBSIDIAN_ARMOR_MATERIAL,0,equipmentSlot);
        this.setUnlocalizedName(Main.MOD_ID+".BedrockCraft."+equipmentSlot.getName());
        this.setRegistryName("obsidian_armor_"+equipmentSlot.getName());
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
