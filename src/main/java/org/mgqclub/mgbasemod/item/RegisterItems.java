package org.mgqclub.mgbasemod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class RegisterItems {

	public static void registerItems(RegistryEvent.Register<Item> event) {
		registerNormalItems(event);
	}
	
	private static void registerNormalItems(RegistryEvent.Register<Item> event) {
		registerNormalItem(event, "item_copper_ingot");
	}
	
	private static void registerNormalItem(RegistryEvent.Register<Item> event, String name) {
		event.getRegistry().register(
				new Item()
				.setRegistryName(name)
				.setCreativeTab(CreativeTabs.MATERIALS)
				.setUnlocalizedName(name)
				);
	}
}
