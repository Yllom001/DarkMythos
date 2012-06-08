package me.botsko.mythos.spells;

import me.botsko.mythos.MythosWeighted;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SpellBase implements MythosWeighted {
	
	
	/**
	 * Block the action happened to
	 */
	protected Block block;


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
	public int getWeight(){
		return 1;
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
	 * 
	 * @param event
	 * @return
	 */
	public boolean useSpellPlayerEntityInteract(PlayerInteractEntityEvent event, Player player){
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
	
	
	/**
	 * 
	 * @param player
	 */
	protected void subtractFromHand(Player player){
		
		ItemStack in_hand = player.getInventory().getItemInHand();
		if(in_hand.getAmount() == 1){
			player.getInventory().remove(in_hand);
		} else {
			in_hand.setAmount( in_hand.getAmount() - 1 );
		}
	}
}