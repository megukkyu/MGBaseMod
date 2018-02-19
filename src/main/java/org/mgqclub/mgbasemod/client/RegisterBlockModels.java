package org.mgqclub.mgbasemod.client;

import org.mgqclub.mgbasemod.MGBaseMod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class RegisterBlockModels {

	public static void registerBlockModels() {
		registerNormalBlockModels();
	}
	
	private static void registerNormalBlockModels() {
		regsiterNormalBlockModel(Item.getItemFromBlock(MGBaseMod.BLOCKS.block_copper_ore));
	}
	
	private static void regsiterNormalBlockModel(Item block) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
