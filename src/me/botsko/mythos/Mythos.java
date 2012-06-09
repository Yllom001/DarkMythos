package me.botsko.mythos;

import java.util.logging.Logger;

import me.botsko.mythos.events.MythosBlockBreakEvent;
import me.botsko.mythos.events.MythosPlayerInteractEntityEvent;
import me.botsko.mythos.events.MythosPlayerInteractEvent;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Mythos extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");
	FileConfiguration config;
	
	
    /**
     * Enables the plugin and activates our player listeners
     */
	@Override
	public void onEnable(){
		
		this.log("Initializing plugin.");
		
		// Load configuration, or install if new
		config = MythosConfig.init( this );
		
		// Assign event listeners
		getServer().getPluginManager().registerEvents(new MythosBlockBreakEvent( this ), this);
//		getServer().getPluginManager().registerEvents(new MythosPlayerPickupItemEvent( this ), this);
		getServer().getPluginManager().registerEvents(new MythosPlayerInteractEvent( this ), this);
		getServer().getPluginManager().registerEvents(new MythosPlayerInteractEntityEvent( this ), this);
		
	}
	
	
	/**
	 * 
	 * @param msg
	 * @return
	 */
	public String playerMsg(String msg){
		return ChatColor.GOLD + "[Mythos]: " + ChatColor.WHITE + msg;
	}
	
	
	/**
	 * 
	 * @param msg
	 * @return
	 */
	public String playerError(String msg){
		return ChatColor.GOLD + "[Mythos]: " + ChatColor.RED + msg;
	}
	
	
	/**
	 * 
	 * @param message
	 */
	public void log(String message){
		log.info("[Mythos]: " + message);
	}
	
	
	/**
	 * 
	 * @param message
	 */
	public void debug(String message){
		if(this.getConfig().getBoolean("debug")){
			log.info("[Mythos]: " + message);
		}
	}
	
	
	/**
	 * Shutdown
	 */
	@Override
	public void onDisable(){
		this.log("Closing plugin.");
	}	
}
