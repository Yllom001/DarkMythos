package me.botsko.mythos.events;

import me.botsko.mythos.Rewards;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class RewardsPlayerPickupItemEvent implements Listener {
	
	private Rewards plugin;
	
	/**
	 * 
	 * @param plugin
	 */
	public RewardsPlayerPickupItemEvent( Rewards plugin ){
		this.plugin = plugin;
	}

	
	
	@EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerPickupItemEvent(final PlayerPickupItemEvent event){
		
		ItemStack i = event.getItem().getItemStack();
		plugin.log("Dura: " + i.getDurability());
		
	}
}
