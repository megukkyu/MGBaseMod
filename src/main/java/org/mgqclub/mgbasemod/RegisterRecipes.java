package org.mgqclub.mgbasemod;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
public class RegisterRecipes {

	public static void registerRecipes(FMLInitializationEvent event) {
		
		registerSmeltingRecipes(event);
	}
	
	private static void registerSmeltingRecipes(FMLInitializationEvent event) {
		FurnaceRecipes.instance().addSmeltingRecipeForBlock(MGBaseMod.BLOCKS.block_copper_ore, new ItemStack(MGBaseMod.ITEMS.item_copper_ingot), 0.6F);
		FurnaceRecipes.instance().addSmeltingRecipeForBlock(MGBaseMod.BLOCKS.block_silver_ore, new ItemStack(MGBaseMod.ITEMS.item_silver_ingot), 0.6F);
		
	}
}
