package org.mgqclub.mgbasemod.worldgen;

import java.util.Random;

import org.mgqclub.mgbasemod.MGBaseMod;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class OreGenerator {

	public void GenerateOres (OreGenEvent.Pre event) {
			WorldGenerator oreCopperGen = new WorldGenMinable(MGBaseMod.BLOCKS.block_copper_ore.getDefaultState(), 10);
			if(TerrainGen.generateOre(event.getWorld(), event.getRand(), oreCopperGen, event.getPos(), OreGenEvent.GenerateMinable.EventType.CUSTOM) ) {
					genStandardOre(event.getWorld(), event.getPos(), 20, oreCopperGen, 0, 64, event.getRand());
			};
			
			WorldGenerator oreSilverGen = new WorldGenMinable(MGBaseMod.BLOCKS.block_copper_ore.getDefaultState(), 10);
			if(TerrainGen.generateOre(event.getWorld(), event.getRand(), oreSilverGen, event.getPos(), OreGenEvent.GenerateMinable.EventType.CUSTOM) ) {
					genStandardOre(event.getWorld(), event.getPos(), 20, oreSilverGen, 0, 32, event.getRand());
			};
			
			
	}
	
	protected void genStandardOre(World world, BlockPos pos, int size, WorldGenerator generator, int minY, int maxY, Random rnd) {
		int l;
		
		if (maxY < minY) {
			l = minY;
			minY = maxY;
			maxY = l;
		} else if (maxY == minY) {
			if (minY < 255) {
				++maxY;
			} else {
				--minY;
			}
		}
		
		for (l = 0; l < size; ++l) {
			BlockPos blockpos = pos.add(rnd.nextInt(16), rnd.nextInt(maxY - minY) + minY, rnd.nextInt(16));
			generator.generate(world, rnd, blockpos);
		}
	}
}
