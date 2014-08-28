package me.leaf.secretbases;

import java.util.logging.Logger;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class SecretBases extends JavaPlugin {
    
	Logger logger = Logger.getLogger("Minecraft");
	   
	   public void onEnable(){
	     logger.info("SecretBases is enabled");
	   }
	
	   public ChunkGenerator getDefaultWorldGenerator(String worldName, String id){
		   return new FlatLandGenerator(this);
	   }
}
