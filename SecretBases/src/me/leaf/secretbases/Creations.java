package com.leaf.azewilous.secretbases;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Creations extends JavaPlugin {
    
	Logger logger = Logger.getLogger("Minecraft");
	   
	   public void onEnable(){
	     logger.info("SecretBases is enabled");
	   }
      @SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, 
    		  String label, String[] args){
    	  if(sender instanceof Player){
    		  Player p = (Player) sender;
    		  if((label.equalsIgnoreCase("icemaker"))&&(args.length == 0)){
    			  Block target = (Block) p.getTargetBlock(null,20);
    			  if(target != null);
    			  for(int x = 0;x < 6; x++){
    				  for(int z = 0;z < 6; z++){
    					  for(int y = 0;y < 6; y++){
    						  int lx =  target.getX();
    						  int ly =  target.getY();
    						  int lz =  target.getZ();
    						  Location blockLoc = new Location((target).getWorld(), lx + x, ly + y, lz + z);
    						  blockLoc.getBlock().setType(Material.PACKED_ICE);
    					  }
    				    }
    			  }
    		  }else{
    			  if((label.equalsIgnoreCase("leafmaker"))&&(args.length == 0)){
    				  Block target = (Block) p.getTargetBlock(null,20);
    	    			  if(target != null);
    	    			  for(int x = 0;x < 6; x++){
    	    				  for(int z = 0;z < 6; z++){
    	    					  for(int y = 0;y < 6; y++){
    	    						  int tx =  target.getX();
    	    						  int ty =  target.getY();
    	    						  int tz =  target.getZ();
    	    						  Location blockLoc = new Location((target).getWorld(), tx + x, ty + y, tz + z);
    	    						  blockLoc.getBlock().setType(Material.LEAVES);
    	    					  }
    	    				    }
    	    			  }  
    			  }else{
    				  if((label.equalsIgnoreCase("endmaker"))&&(args.length == 0)){
    					Block target = (Block) p.getTargetBlock(null, 10);
    					if(target !=null);
    					for(int x = 0;x < 6; x++){
    						for(int y = 0; y > 6; x++){
    							for(int z = 0; y > 6; x++){
    								int lx = target.getX();
    								int ly = target.getY();
    								int lz = target.getZ();
    								Location blockLoc = new Location((target).getWorld(), lx + x, ly + y,lz + z);
    								blockLoc.getBlock().setType(Material.ENDER_PORTAL);
    							}
    						}
    					}
    				}else{
    				   if((label.equalsIgnoreCase("house")) &&(args.length == 0)){
    					 Block target = (Block) p.getTargetBlock(null, 19);
    					 if(target !=null);
    					 for(int x = 0;x < 13; x++){
    						 for(int y = 0; y < 9; y++){
    							 for(int z = 0; z < 16; z++){
    								 int lx = target.getX();
    								 int ly = target.getY();
    								 int lz = target.getZ();
    								 Location blockLoc = new Location((target).getWorld(), lx + x, ly + y, lz + z );
    								 blockLoc.getBlock().setType(Material.BRICK);
    							 }
    						 }
    					 }
    					  }else{
    						  if((label.equalsIgnoreCase("shoot arrow")) &&(args.length == 1)){
    							  Arrow arrow = Bukkit.getServer().getWorld("Main").spawn(new Location(Bukkit.getServer().getWorld("Main"), 0, 0,
    						                        0), Arrow.class);
    						  }
    					  }
    				  }
    			  }
    		  }
    		  }
          return false;
      }
}