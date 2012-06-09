package me.botsko.mythos.events;

import me.botsko.mythos.Mythos;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class MythosPlayerPickupItemEvent implements Listener {
	
//	private Mythos plugin;
//	private CurseChoice cc;
	
	/**
	 * 
	 * @param plugin
	 */
	public MythosPlayerPickupItemEvent( Mythos plugin ){
//		this.plugin = plugin;
//		this.cc = new CurseChoice();
	}

	
	
	@EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerPickupItemEvent(final PlayerPickupItemEvent event){
		
		// I want to curse artifacts but I need to think of a way to tell if it's cursed.
		// This would essentially check every item pickup for a curse, which isn't what
		// I want
		
//		// If the item is cursed, apply the curse and skip using it
//		CurseBase curse = cc.chooseRandomCurse();
//		if(curse != null){
//			
//			Player player = event.getPlayer();
//			
//			// Apply the curse
//			curse.applyCurse(player);
//			
//			// Delete the item
//			ItemStack i = event.getItem().getItemStack();
//			i.setAmount(0);
//			
//			// Tell them about the curse
//			player.sendMessage( plugin.playerMsg( curse.getMessage() ));
//			
//		}
	}
}
