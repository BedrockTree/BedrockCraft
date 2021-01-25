package com.frank;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MOD_ID,version = Main.VERSION,name = Main.NAME,acceptedMinecraftVersions = Main.ACCEPT_MINECRAFT_VERSION)
public class Main {
        public static final String  MOD_ID = "bedrockcraft";
        public static final String VERSION = "1.0.0";
        public static final String NAME = "Bedrock Craft";
        public static final String ACCEPT_MINECRAFT_VERSION = "1.12.2";
        private static Logger logger;

        @EventHandler
        public static void PreInit(FMLPreInitializationEvent event){
                logger = event.getModLog();
                logger.warn("PreInit");
        }
        @EventHandler
        public static void Init(FMLInitializationEvent event){
                logger.warn("Init");
        }
        @EventHandler
        public static void PostInit(FMLPostInitializationEvent event){
                logger.warn("PostInit");
        }
}
