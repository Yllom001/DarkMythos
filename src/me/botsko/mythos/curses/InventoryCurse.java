package me.botsko.mythos.curses;

import java.util.Random;

import me.botsko.mythos.utilities.MythosUtil;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class InventoryCurse extends CurseBase {
	
	static Random r = new Random();
	
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
		return 10;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String getMessage(){
		return "Spell book held a strong curse... you had an item stolen!";
	}
	
	
	/**
	 * 
	 * @param player
	 */
	@Override
	public void applyCurse(Player player){
		removeRandomItem( player );
	}


	/**
	 * 
	 * @param player
	 * @return
	 */
	private void removeRandomItem(Player player) {
        ItemStack i = null;
        while(i == null){
			i = player.getInventory().getItem( r.nextInt(36) );
			if(i != null && i != player.getInventory().getItemInHand()){
				MythosUtil.removeItem(player, i);
			}
        }
        subtractFromHand( player );
	}
}