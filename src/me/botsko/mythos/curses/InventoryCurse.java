package me.botsko.mythos.curses;

import java.util.Random;

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
		return 1;
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
		removeRandomItem(player);
		subtractFromHand( player );
		
	}


	private static ItemStack removeRandomItem(Player player) {
		ItemStack i;
        int index = r.nextInt(36);
        i = player.getInventory().getItem(index);
        if (i == null){
        	return removeRandomItem(player);
        } else {
        i.setAmount(0);
        return null;
        }
		
	}
}