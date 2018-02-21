package org.mgqclub.mgbasemod;

import org.apache.logging.log4j.Logger;
import org.mgqclub.mgbasemod.block.RegisterBlocks;
import org.mgqclub.mgbasemod.client.RegisterBlockModels;
import org.mgqclub.mgbasemod.client.RegisterItemModels;
import org.mgqclub.mgbasemod.item.RegisterItems;
import org.mgqclub.mgbasemod.proxy.CommonProxy;
import org.mgqclub.mgbasemod.worldgen.OreGenerator;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
@EventBusSubscriber
public class MGBaseMod {
    private static Logger logger;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY,serverSide=Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @ObjectHolder(Reference.MODID)
    public static class ITEMS {
    	public static final Item item_copper_ingot = null;
    	public static final Item item_silver_ingot = null;
    	public static final Item item_lead_ingot = null;
    	public static final Item item_tin_ingot = null;

    	public static final Item block_copper_ore = null;
    	public static final Item block_silver_ore = null;
    	public static final Item block_lead_ore = null;
    	public static final Item block_tin_ore = null;
    }

    @ObjectHolder(Reference.MODID)
    public static class BLOCKS {
    	public static final Block block_copper_ore = null;
    	public static final Block block_silver_ore = null;
    	public static final Block block_lead_ore = null;
    	public static final Block block_tin_ore = null;
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
    	MinecraftForge.ORE_GEN_BUS.register(this);

    	RegisterOreDictionary.registerOres();

    	RegisterRecipes.registerRecipes(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
    	RegisterItems.registerItems(event);
    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
    	RegisterBlocks.registerBlocks(event);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    	RegisterItemModels.registerItemModels(event);
    	RegisterBlockModels.registerBlockModels();
    }

    @SubscribeEvent
    public void generateOrePre(OreGenEvent.Pre event) {
    	OreGenerator generator = new OreGenerator();
    	generator.GenerateOres(event);
    }

}
