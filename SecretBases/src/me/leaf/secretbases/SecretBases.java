package me.leaf.secretbases;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SecretBases extends JavaPlugin {
    
	Logger logger = Logger.getLogger("Minecraft");
	   
	   public void onEnable(){
	     logger.info("SecretBases is enabled");
	   }
      public boolean onCommand(CommandSender sender, Command cmd, 
    		  String label, String[] args){
    	  if(sender instanceof Player){
    		  Player p = (Player) sender;
    		  if((label.equalsIgnoreCase("make"))&&(args.length == 0)){
    			  @SuppressWarnings("deprecation")
				Block target = (Block) p.getTargetBlock(null,40);
    			  if(target != null);
    			  for(int x = 0;x < 16; x++){
    				  for(int z = 0;z < 16; z++){
    					  for(int y = 0;y < 16; y++){
    						  int tx =  target.getX();
    						  int ty =  target.getY();
    						  int tz =  target.getZ();
    						  Location blockLoc = new Location((target).getWorld(), tx + x, ty + y, tz + z);
    						  blockLoc.getBlock().setType(Material.WOOD);
    					  }
    				  }
    			  }
    		  }
    	  }
          return false;
      }