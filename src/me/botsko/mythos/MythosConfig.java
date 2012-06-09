package me.botsko.mythos;

import org.bukkit.configuration.file.FileConfiguration;

public class MythosConfig {
	
	
	/**
	 * 
	 * @param plugin
	 */
	public static FileConfiguration init( Mythos plugin ){
		
		FileConfiguration config= plugin.getConfig();
		
		// set defaults
		config.addDefault("mythos.debug", false);
		
		// Copy defaults
		config.options().copyDefaults(true);
		
		// save the defaults/config
		plugin.saveConfig();
		
		return config;
		
	}
}
