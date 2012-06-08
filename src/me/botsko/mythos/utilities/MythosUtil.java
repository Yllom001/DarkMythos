package me.botsko.mythos.utilities;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MythosUtil {

	
	/**
	 * Causes lightning on award discovery
	 * @param block
	 */
	public static void awardThunder( Block block ){
		Location loc = block.getLocation();
		loc.setY(350D);
		block.getWorld().strikeLightning(loc);
	}
	
	
	/**
	 * 
	 * @param player
	 */
	public static void subtractFromHand(Player player){
		
		ItemStack in_hand = player.getInventory().getItemInHand();
		if(in_hand.getAmount() == 1){
			player.getInventory().remove(in_hand);
		} else {
			in_hand.setAmount( in_hand.getAmount() - 1 );
		}
	}
	
}
