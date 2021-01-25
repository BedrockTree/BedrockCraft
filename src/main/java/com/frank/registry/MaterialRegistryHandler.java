package com.frank.registry;

import com.frank.Main;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialRegistryHandler {

    public static final Item.ToolMaterial BEDROCK_TOOL_MATERIAL = EnumHelper.addToolMaterial("BEDROCK", 3, 5000, 25f, 5f, 7);
    public static final ItemArmor.ArmorMaterial BEDROCK_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("BEDROCK_ARMOR", Main.MOD_ID + ":bedrock", 500, new int[]{6, 8, 9, 7}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 8);
    public static final Item.ToolMaterial OBSIDIAN_TOOL_MATERIAL = EnumHelper.addToolMaterial("OBSIDIAN", 3, 3000, 22.5f, 4f, 7);
    public static final ItemArmor.ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("OBSIDIAN_ARMOR", Main.MOD_ID + ":obsidian", 450, new int[]{5, 7, 8, 6}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10);

}



