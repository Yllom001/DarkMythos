package me.botsko.mythos.events;

import me.botsko.mythos.Mythos;
import me.botsko.mythos.awards.AwardChoice;
import me.botsko.mythos.spells.SpellBase;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class RewardsPlayerInteractEntityEvent implements Listener {
	
	private Mythos plugin;
	private AwardChoice ac;
	
	/**
	 * 
	 * @param plugin
	 */
	public RewardsPlayerInteractEntityEvent( Mythos plugin ){
		this.plugin = plugin;
		this.ac = new AwardChoice();
	}
	
	
	@EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerInteractEntityEvent(final PlayerInteractEntityEvent event){
		
		Player player = event.getPlayer();
		
		// Ensure they're right-clicking
		if (event.getRightClicked() != null) {
			
			// Ensure they're using a book
			if(player.getItemInHand().getType() == Material.BOOK){
				
				// Use the durability to find the award id
				SpellBase award = ac.chooseAward( player.getItemInHand().getDurability() );
				if(award != null){
					
					// Get the block break award
					if( award.useSpellPlayerEntityInteract(event, player) ){
					
						// Message the player
						player.sendMessage( plugin.playerMsg( award.getSpellUseMessage() ));
						
					}
				}
			}
		}
	}
}
