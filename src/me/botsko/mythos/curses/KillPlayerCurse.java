package me.botsko.mythos.curses;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class KillPlayerCurse extends CurseBase {
	
	
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
		return "Spell book held the ultimate curse... you have sacrificed your life!";
	}
	
	
	/**
	 * 
	 * @param player
	 */
	public void applyCurse(Player player){
		subtractFromHand( player );
		player.setHealth( 0 );
	}
}