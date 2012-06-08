package me.botsko.mythos.artifacts;

import me.botsko.mythos.MythosWeighted;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class ArtifactBase implements MythosWeighted {
	
	
	/**
	 * Block the action happened to
	 */
	protected Block block;

	
	/**
	 * 
	 * @return
	 */
	@Override
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
	 * @param event
	 */
	public boolean getBlockBreakAward(BlockBreakEvent event){
		return false;
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