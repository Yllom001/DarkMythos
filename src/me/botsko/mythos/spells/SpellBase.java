package me.botsko.mythos.spells;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class SpellBase {
	
	
	/**
	 * Block the action happened to
	 */
	protected Block block;
	
	// Ideas:
	
	// turn ore into ingots
	// fell tree
	// turn block to gold, diamond, etc
	// smite
	// erase mobs
	// drain water
	// fill health/hunger
	// god mode
	// capture entity as egg
	
	// some are very rarely cursed
	// cause bad effects on player
	
	// spell of the blue carnation
	
	// prevent stacking: InventoryClickEvents

	/**
	 * 
	 * @return
	 */
	public short getSpellId(){
		return 0;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getAwardMessage(){
		return "";
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getSpellUseMessage(){
		return "";
	}


	/**
	 * 
	 * @param event
	 */
	public boolean getBlockBreakAward(BlockBreakEvent event){
		return false;
	}
	
	
	/**
	 * 
	 * @param event
	 * @return
	 */
	public boolean useSpellPlayerInteract(PlayerInteractEvent event, Player player){
		return false;
	}
	
	
	/**
	 * Causes lightning on award discovery
	 * @param block
	 */
	protected void awardThunder(){
		Location loc = block.getLocation();
		loc.setY(350D);
		block.getWorld().strikeLightning(loc);
	}
}