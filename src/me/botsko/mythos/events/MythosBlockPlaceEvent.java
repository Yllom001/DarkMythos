package me.botsko.mythos.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import me.botsko.mythos.Mythos;


public class MythosBlockPlaceEvent implements Listener {
	
//	private Rewards plugin;
	
	/**
	 * 
	 * @param plugin
	 */
	public MythosBlockPlaceEvent( Mythos plugin ){
//		this.plugin = plugin;
	}

	
	
	@EventHandler(priority = EventPriority.NORMAL)
    public void onBlockPlace(final BlockPlaceEvent event){
		
		Block block = event.getBlock();
		if( block.getType() == Material.SAPLING ){
			
//			block.
			
		}
	}
}
