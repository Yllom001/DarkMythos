package me.botsko.mythos.curses;

import me.botsko.mythos.MythosWeighted;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CurseBase implements MythosWeighted {

	
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
	public String getMessage(){
		return "";
	}


	/**
	 * 
	 * @param player
	 */
	public void applyCurse(Player player){
		// does nothing by default
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