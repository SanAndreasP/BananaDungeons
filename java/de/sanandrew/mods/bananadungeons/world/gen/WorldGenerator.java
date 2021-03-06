/*******************************************************************************************************************
 * Authors:   SanAndreasP
 * Copyright: SanAndreasP
 * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 *                http://creativecommons.org/licenses/by-nc-sa/4.0/
 *******************************************************************************************************************/
package de.sanandrew.mods.bananadungeons.world.gen;

import cpw.mods.fml.common.IWorldGenerator;
import de.sanandrew.mods.bananadungeons.world.gen.feature.WorldGenBarn;
import de.sanandrew.mods.bananadungeons.world.gen.feature.WorldGenGraveyard;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderFlat;
import net.minecraft.world.gen.ChunkProviderGenerate;

import java.util.Random;

public class WorldGenerator
        implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if( chunkGenerator instanceof ChunkProviderGenerate || chunkGenerator instanceof ChunkProviderFlat ) {
            if( random.nextInt(270) == 0 ) {
                WorldGenGraveyard.generate(world, random, chunkX, chunkZ);
            }

            if( random.nextInt(16) == 0 ) {
                WorldGenBarn.generate(world, random, chunkX, chunkZ);
            }
        }
    }
}
