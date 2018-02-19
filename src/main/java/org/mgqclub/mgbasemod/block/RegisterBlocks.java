package org.mgqclub.mgbasemod.block;

import org.mgqclub.mgbasemod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;

public class RegisterBlocks {

	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		registerNormalBlocks(event);
	}
	
	private static void registerNormalBlocks(RegistryEvent.Register<Block> event) {
		registerNormalBlock(event, "block_copper_ore", Material.ROCK, 3F, 155F);
	}
	
	private static void registerNormalBlock(RegistryEvent.Register<Block> event,String name, Material material, float hardness, float resistance) {
		event.getRegistry().register(
				new Block(material)
				.setRegistryName(Reference.MODID, name)
				.setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
				.setUnlocalizedName(name)
				.setHardness(hardness)
				.setResistance(resistance)
				);
	}
	
}
