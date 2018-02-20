package org.mgqclub.mgbasemod.item;

import org.mgqclub.mgbasemod.MGBaseMod;
import org.mgqclub.mgbasemod.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;

public class RegisterItems {

	public static void registerItems(RegistryEvent.Register<Item> event) {
		registerNormalItems(event);
		registerNormalItemBlocks(event);
	}
	
	private static void registerNormalItems(RegistryEvent.Register<Item> event) {
		registerNormalItem(event, "item_copper_ingot");
		registerNormalItem(event, "item_silver_ingot");
	}
	
	private static void registerNormalItemBlocks(RegistryEvent.Register<Item> event) {
		registerNormalItemBlock(event, MGBaseMod.BLOCKS.block_copper_ore, "block_copper_ore");
		registerNormalItemBlock(event,MGBaseMod.BLOCKS.block_silver_ore, "block_silver_ore");
	}
	
	private static void registerNormalItem(RegistryEvent.Register<Item> event, String name) {
		event.getRegistry().register(
				new Item()
				.setRegistryName(name)
				.setCreativeTab(CreativeTabs.MATERIALS)
				.setUnlocalizedName(name)
				);
	}
	
	private static void registerNormalItemBlock(RegistryEvent.Register<Item>event, Block block, String name) {
		event.getRegistry().register(
				new ItemBlock(block).setRegistryName(Reference.MODID, name)
				);
	}
}
