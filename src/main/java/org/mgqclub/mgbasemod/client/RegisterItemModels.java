package org.mgqclub.mgbasemod.client;

import org.mgqclub.mgbasemod.MGBaseMod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;

public class RegisterItemModels {

	public static void registerItemModels(ModelRegistryEvent event) {
		registerNormalItemModels(event);
	}
	
	private static void registerNormalItemModels(ModelRegistryEvent event) {
		registerNormalItemModel(event,MGBaseMod.ITEMS.item_copper_ingot);
		registerNormalItemModel(event,MGBaseMod.ITEMS.item_silver_ingot);
	}
	
	private static void registerNormalItemModel(ModelRegistryEvent event, Item item) {
		ModelLoader.setCustomModelResourceLocation(item,0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
