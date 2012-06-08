package me.botsko.mythos;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import me.botsko.mythos.events.MythosBlockBreakEvent;
import me.botsko.mythos.events.MythosPlayerInteractEntityEvent;
import me.botsko.mythos.events.MythosPlayerInteractEvent;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Mythos extends JavaPlugin {

	
	Logger log = Logger.getLogger("Minecraft");
	protected FileConfiguration config;
	public java.sql.Connection conn;
	
	
	/**
     * Connects to the MySQL database
     */
	public void dbc(){
    	
        java.util.Properties conProperties = new java.util.Properties();
        conProperties.put("user", this.getConfig().getString("mysql.username") );
        conProperties.put("password", this.getConfig().getString("mysql.password") );
        conProperties.put("autoReconnect", "true");
        conProperties.put("maxReconnects", "3");
        String uri = "jdbc:mysql://"+this.getConfig().getString("mysql.hostname")+":"+this.getConfig().getString("mysql.port")+"/"+this.getConfig().getString("mysql.database");
        
        try {
        	conn = DriverManager.getConnection(uri, conProperties);
        } catch (SQLException e) {
            log.throwing("me.botsko.darkmythos", "dbc()", e);
        }
    }
	
	
    /**
     * Enables the plugin and activates our player listeners
     */
	public void onEnable(){
		
		this.log("Initializing plugin.");
		
		// Load configuration, or install if new
		handleConfig();
		
		// Setup database if not already
//		try {
//			setUpDb();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Load economy via Vault
//		RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
//        if (rsp != null) {
//        	econ = rsp.getProvider();
//        }
		
		// Assign event listeners
		getServer().getPluginManager().registerEvents(new MythosBlockBreakEvent( this ), this);
//		getServer().getPluginManager().registerEvents(new RewardsPlayerPickupItemEvent( this ), this);
		getServer().getPluginManager().registerEvents(new MythosPlayerInteractEvent( this ), this);
		getServer().getPluginManager().registerEvents(new MythosPlayerInteractEntityEvent( this ), this);
		
		// Assign handlers for in-game commands
//		getCommand("buy").setExecutor( (CommandExecutor) new BuyCommandExecutor(this) );

		
	}
	

	
	/**
	 * 
	 */
	public void handleConfig(){
		
		config = getConfig();
		
		// database configs
		this.getConfig().set("mysql.hostname", 	this.getConfig().getString("mysql.hostname", "127.0.0.1"));
		this.getConfig().set("mysql.port", 		this.getConfig().getString("mysql.port", "3306"));
		this.getConfig().set("mysql.database", 	this.getConfig().getString("mysql.database", "minecraft"));
		this.getConfig().set("mysql.username", 	this.getConfig().getString("mysql.username", "root"));
		this.getConfig().set("mysql.password", 	this.getConfig().getString("mysql.password", ""));
		
		// other configs
		this.getConfig().set("debug", this.getConfig().get("debug", false) );
	
		saveConfig();
		
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
	public void onDisable(){
		this.log("Closing plugin.");
	}	
}
