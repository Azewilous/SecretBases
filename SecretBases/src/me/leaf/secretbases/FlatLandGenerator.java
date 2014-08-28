package me.leaf.secretbases;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

public class FlatLandGenerator extends ChunkGenerator {
	
	SecretBases plugin;
	
	public FlatLandGenerator(SecretBases instance){
		plugin = instance;
	}

	public Location getFixedSpawnLocation(World world, Random random){
		return new Location(world,0,0,0);
	}
	
	public List<BlockPopulator> getDefaultPopulators(World world){
	   return new ArrayList<BlockPopulator>();	
	}
	
    @SuppressWarnings("deprecation")
	public byte[][] generatorBlockSections(World world, Random random, 
    		int chunkX, int ChunkY, BiomeGrid biomeGrid){
    	byte[][] result = new byte[256 / 16][];
    	int x,y,z;
    	
    	for(x=0; x < 16; x++ ){
    		for (z = 0; z < 16; z++){
    		    setBlock(result, x, 0, z, (byte) Material.BEDROCK.getId());   	
    		}
    	}
    	
    	for(x=0; x < 16; x++ ){
    		for (z = 0; z < 16; z++){
    			for(y = 1;y<=2;y++){
    		    setBlock(result, x, 0, z, (byte) Material.DIRT.getId());   	
    			}
    	     }
    	for(x=0; x < 16; x++ ){
        	for (z = 0; z < 16; z++){
        		 setBlock(result, x, 3, z, (byte) Material.GOLD_BLOCK.getId());   	
        		}
        	}
    	}
    	
    	return result;
    }
    @SuppressWarnings("deprecation")
	public short[][] generatorExtBlockSections(World world, Random random, 
    		int chunkX, int ChunkY, BiomeGrid biomeGrid){
    	short[][] result = new short[256 / 16][];
    	int x,y,z;
    	
    	for(x=0; x < 16; x++ ){
    		for (z = 0; z < 16; z++){
    		    setBlock(result, x, 0, z, (short) Material.BEDROCK.getId());   	
    		}
    	}
    	
    	for(x=0; x < 16; x++ ){
    		for (z = 0; z < 16; z++){
    			for(y = 1;y<=2;y++){
    		    setBlock(result, x, 0, z, (short) Material.DIRT.getId());   	
    			}
    	     }
    	for(x=0; x < 16; x++ ){
        	for (z = 0; z < 16; z++){
        		 setBlock(result, x, 3, z, (short) Material.GOLD_BLOCK.getId());   	
        		}
        	}
    	}
    	
    	return result;
    }
    private void setBlock(byte[][] result, int x, int y, int z, byte blockId) {
    	if (result[y >> 4] == null){
    		result[y >> 4] = new byte[4096];
    	}
        result[y >> 4][((y&0xF)<<8) | (z >> 4) | x] = blockId;
    }
    private void setBlock(short[][] result, int x, int y, int z, short blockId) {
    	if (result[y >> 4] == null){
    		result[y >> 4] = new short[4096];
    	}
        result[y >> 4][((y&0xF)<<8) | (z >> 4) | x] = blockId;
    }
}
