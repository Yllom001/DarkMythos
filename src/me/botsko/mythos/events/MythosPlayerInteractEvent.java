package me.botsko.mythos.events;

import me.botsko.mythos.Mythos;
import me.botsko.mythos.curses.CurseBase;
import me.botsko.mythos.curses.CurseChoice;
import me.botsko.mythos.spells.SpellBase;
import me.botsko.mythos.spells.SpellChoice;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MythosPlayerInteractEvent implements Listener {
	
	private Mythos plugin;
	private SpellChoice sc;
	private CurseChoice cc;
	
	/**
	 * 
	 * @param plugin
	 */
	public MythosPlayerInteractEvent( Mythos plugin ){
		this.plugin = plugin;
		this.sc = new SpellChoice( plugin );
		this.cc = new CurseChoice( plugin );
	}
	
	
	@EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerInteractEvent(final PlayerInteractEvent event){
		
		Player player = event.getPlayer();
		
		// Ensure they're right-clicking
		if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			
			// Ensure they're using a book
			if(player.getItemInHand().getType() == Material.BOOK){
				
				// Use the durability to find the award id
				SpellBase award = sc.chooseSpell( player.getItemInHand().getDurability() );
				if(award != null){
					
					// If the item is cursed, apply the curse and skip using it
					CurseBase curse = cc.chooseRandomCurse();
					if(curse == null){
					
						// Get the block break award
						if( award.useSpellPlayerInteract(event, player) ){
						
							// Message the player
							player.sendMessage( plugin.playerMsg( award.getSpellUseMessage() ));
							
						}
					} else {
						
						curse.applyCurse(player);
						
						// Tell them about the curse
						player.sendMessage( plugin.playerMsg( curse.getMessage() ));
						
					}
				}
			}
		}
	}
}
