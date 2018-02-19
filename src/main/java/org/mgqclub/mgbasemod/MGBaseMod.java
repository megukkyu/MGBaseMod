package org.mgqclub.mgbasemod;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

import org.apache.logging.log4j.Logger;
import org.mgqclub.mgbasemod.client.RegisterItemModels;
import org.mgqclub.mgbasemod.item.RegisterItems;
import org.mgqclub.mgbasemod.proxy.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
@EventBusSubscriber
public class MGBaseMod {
    private static Logger logger;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY,serverSide=Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    @ObjectHolder(Reference.MODID)
    public static class ITEMS {
    	public static final Item item_copper_ingot = null;
    }
    
    @ObjectHolder(Reference.MODID)
    public static class BLOCKS {
    	
    }
    
    public Logger getLogger() {
    	return logger;
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
    
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
    	RegisterItems.registerItems(event);
    }
    
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    	RegisterItemModels.registerItemModels(event);
    }
    
}
