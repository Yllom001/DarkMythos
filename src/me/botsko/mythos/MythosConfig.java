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
		config.addDefault("mythos.curse_chance_range", 10);
		config.addDefault("mythos.spell_chance_range", 500);
		config.addDefault("mythos.artifact_chance_range", 1000);
		
		// Copy defaults
		config.options().copyDefaults(true);
		
		// save the defaults/config
		plugin.saveConfig();
		
		return config;
		
	}
}
