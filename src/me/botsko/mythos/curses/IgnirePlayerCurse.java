package me.botsko.mythos.curses;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class IgnirePlayerCurse extends CurseBase {
	
	
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
		return "Spell book held a powerful curse... you have set yourself on fire!";
	}
	
	
	/**
	 * 
	 * @param player
	 */
	@Override
	public void applyCurse(Player player){
        player.setFireTicks(10000);
		subtractFromHand( player );
		player.setHealth(0);
	}
}