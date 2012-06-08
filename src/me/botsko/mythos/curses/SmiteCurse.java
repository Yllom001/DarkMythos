package me.botsko.mythos.curses;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class SmiteCurse extends CurseBase {
	
	
	/**
	 * Block the action happened to
	 */
	protected Block block;

	
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
	public String getMessage(){
		return "Spell book held a powerful curse... you have set yourself on fire!";
	}
	
	
	/**
	 * 
	 * @param player
	 */
	public void applyCurse(Player player){
        player.setFireTicks(10000);
		subtractFromHand( player );
		player.setHealth(0);
	}
}