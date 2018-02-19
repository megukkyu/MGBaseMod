package org.mgqclub.mgbasemod.item;

import org.mgqclub.mgbasemod.MGBaseMod;
import org.mgqclub.mgbasemod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class RegisterItems {

	public static void registerItems(RegistryEvent.Register<Item> event) {
		registerNormalItems(event);
	}
	
	private static void registerNormalItems(RegistryEvent.Register<Item> event) {
		registerNormalItem(event, MGBaseMod.ITEMS.item_copper_ingot, "item_copper_ingot");
	}
	
	private static void registerNormalItem(RegistryEvent.Register<Item> event, Item item, String name) {
		item.setRegistryName(Reference.MODID, name);
		item.setCreativeTab(CreativeTabs.MATERIALS);
		item.setUnlocalizedName(name);
		event.getRegistry().register(item);
	}
}
