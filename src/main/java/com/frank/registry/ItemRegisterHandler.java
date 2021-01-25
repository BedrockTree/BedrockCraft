package com.frank.registry;

import com.frank.item.BedrockIngot;
import com.frank.item.ObsidianIngot;
import com.frank.item.armor.BedrockArmor;
import com.frank.item.armor.ObsidianArmor;
import com.frank.item.tool.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegisterHandler {
    /*MISC*/
    public static final BedrockIngot BEDROCK_INGOT = new BedrockIngot();
    public static final ObsidianIngot OBSIDIAN_INGOT = new ObsidianIngot();
    /*TOOL*/
    public static final BedrockPickaxe BEDROCK_PICKAXE = new BedrockPickaxe();
    public static final BedrockAxe BEDROCK_AXE = new BedrockAxe();
    public static final BedrockShovel BEDROCK_SHOVEL = new BedrockShovel();
    public static final BedrockHoe BEDROCK_HOE = new BedrockHoe();
    public static final ObsidianPickaxe OBSIDIAN_PICKAXE = new ObsidianPickaxe();
    public static final ObsidianAxe OBSIDIAN_AXE = new ObsidianAxe();
    public static final ObsidianShovel OBSIDIAN_SHOVEL = new ObsidianShovel();
    public static final ObsidianHoe OBSIDIAN_HOE = new ObsidianHoe();
    /*COMBAT*/

    //Sword
    public static final BedrockSword BEDROCK_SWORD = new BedrockSword();
    public static final ObsidianSword OBSIDIAN_SWORD = new ObsidianSword();
    //Armor
    public static final BedrockArmor BEDROCK_BOOTS = new BedrockArmor(EntityEquipmentSlot.FEET);
    public static final BedrockArmor BEDROCK_LEGGINGS = new BedrockArmor(EntityEquipmentSlot.LEGS);
    public static final BedrockArmor BEDROCK_CHESTPLATE = new BedrockArmor(EntityEquipmentSlot.CHEST);
    public static final BedrockArmor BEDROCK_HELMET = new BedrockArmor(EntityEquipmentSlot.HEAD);
    public static final ObsidianArmor OBSIDIAN_BOOTS = new ObsidianArmor(EntityEquipmentSlot.FEET);
    public static final ObsidianArmor OBSIDIAN_LEGGINGS = new ObsidianArmor(EntityEquipmentSlot.LEGS);
    public static final ObsidianArmor OBSIDIAN_CHESTPLATE = new ObsidianArmor(EntityEquipmentSlot.CHEST);
    public static final ObsidianArmor OBSIDIAN_HELMET = new ObsidianArmor(EntityEquipmentSlot.HEAD);

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        /*MISC*/
        registry.register(BEDROCK_INGOT);
        registry.register(OBSIDIAN_INGOT);
        /*TOOL*/
        registry.register(BEDROCK_PICKAXE);
        registry.register(BEDROCK_AXE);
        registry.register(BEDROCK_SHOVEL);
        registry.register(BEDROCK_HOE);
        registry.register(OBSIDIAN_PICKAXE);
        registry.register(OBSIDIAN_AXE);
        registry.register(OBSIDIAN_SHOVEL);
        registry.register(OBSIDIAN_HOE);
        /*COMBAT*/
        //Sword
        registry.register(BEDROCK_SWORD);
        registry.register(OBSIDIAN_SWORD);
        //Armor
        registry.register(BEDROCK_BOOTS);
        registry.register(BEDROCK_LEGGINGS);
        registry.register(BEDROCK_CHESTPLATE);
        registry.register(BEDROCK_HELMET);
        registry.register(OBSIDIAN_BOOTS);
        registry.register(OBSIDIAN_LEGGINGS);
        registry.register(OBSIDIAN_CHESTPLATE);
        registry.register(OBSIDIAN_HELMET);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        /*MISC*/
        registerModel(BEDROCK_INGOT);
        registerModel(OBSIDIAN_INGOT);
        /*TOOL*/
        registerModel(BEDROCK_PICKAXE);
        registerModel(BEDROCK_AXE);
        registerModel(BEDROCK_SHOVEL);
        registerModel(BEDROCK_HOE);
        registerModel(OBSIDIAN_PICKAXE);
        registerModel(OBSIDIAN_AXE);
        registerModel(OBSIDIAN_SHOVEL);
        registerModel(OBSIDIAN_HOE);
        /*COMBAT*/
        //Sword
        registerModel(BEDROCK_SWORD);
        registerModel(OBSIDIAN_SWORD);
        //Armor
        registerModel(BEDROCK_BOOTS);
        registerModel(BEDROCK_LEGGINGS);
        registerModel(BEDROCK_CHESTPLATE);
        registerModel(BEDROCK_HELMET);
        registerModel(OBSIDIAN_BOOTS);
        registerModel(OBSIDIAN_LEGGINGS);
        registerModel(OBSIDIAN_CHESTPLATE);
        registerModel(OBSIDIAN_HELMET);


    }

    private static ItemBlock withRegistryName(ItemBlock item) {
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item) {
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
    }

}
