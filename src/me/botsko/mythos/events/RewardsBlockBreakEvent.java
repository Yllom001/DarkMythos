package me.botsko.mythos.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.botsko.mythos.Rewards;
import me.botsko.mythos.awards.AwardChoice;
import me.botsko.mythos.spells.SpellBase;


public class RewardsBlockBreakEvent implements Listener {
	
	private Rewards plugin;
	private AwardChoice ac;
	
	/**
	 * 
	 * @param plugin
	 */
	public RewardsBlockBreakEvent( Rewards plugin ){
		this.plugin = plugin;
		this.ac = new AwardChoice();
	}

	
	/**
	 * Award the player when blocks break if the chosen spell supports it.
	 * @param event
	 */
	@EventHandler(priority = EventPriority.NORMAL)
    public void onBlockBreak(final BlockBreakEvent event){

		SpellBase award = ac.chooseRandomAward();
		if(award != null){
			
			// Get the block break award
			if( award.getBlockBreakAward(event) ){
			
				// Message the player
				Player player = event.getPlayer();
				player.sendMessage( plugin.playerMsg( award.getAwardMessage() ));
				
			}
		}
	}
}
