package me.botsko.mythos.events;

import me.botsko.mythos.Mythos;
import me.botsko.mythos.awards.AwardChoice;
import me.botsko.mythos.spells.SpellBase;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RewardsPlayerInteract implements Listener {
	
	private Mythos plugin;
	private AwardChoice ac;
	
	/**
	 * 
	 * @param plugin
	 */
	public RewardsPlayerInteract( Mythos plugin ){
		this.plugin = plugin;
		this.ac = new AwardChoice();
	}
	
	
	@EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerInteractEvent(final PlayerInteractEvent event){
		
		Player player = event.getPlayer();
		
		// Ensure they're right-clicking
		if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			
			// Ensure they're using a book
			if(player.getItemInHand().getType() == Material.BOOK){
				
				// Use the durability to find the award id
				SpellBase award = ac.chooseAward( player.getItemInHand().getDurability() );
				if(award != null){
					
					// Get the block break award
					if( award.useSpellPlayerInteract(event, player) ){
					
						// Message the player
						player.sendMessage( plugin.playerMsg( award.getSpellUseMessage() ));
						
					}
				}
			}
		}
	}
}
