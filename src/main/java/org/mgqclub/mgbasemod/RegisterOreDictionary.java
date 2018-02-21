package org.mgqclub.mgbasemod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterOreDictionary {

	public static void registerOres() {
		OreDictionary.registerOre("oreCopper",new ItemStack(MGBaseMod.BLOCKS.block_copper_ore));
		OreDictionary.registerOre("ingotCopper", new ItemStack(MGBaseMod.ITEMS.item_copper_ingot));
		OreDictionary.registerOre("oreSilver",new ItemStack(MGBaseMod.BLOCKS.block_silver_ore));
		OreDictionary.registerOre("ingotSilver", new ItemStack(MGBaseMod.ITEMS.item_silver_ingot));
		OreDictionary.registerOre("oreLead",new ItemStack(MGBaseMod.BLOCKS.block_lead_ore));
		OreDictionary.registerOre("ingotLead", new ItemStack(MGBaseMod.ITEMS.item_lead_ingot));
		OreDictionary.registerOre("oreTin",new ItemStack(MGBaseMod.BLOCKS.block_tin_ore));
		OreDictionary.registerOre("ingotTin", new ItemStack(MGBaseMod.ITEMS.item_tin_ingot));
	}
}
