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
		return "Spell book held the ultimate curse... you have sacrificed your life!";
	}
	
	
	/**
	 * 
	 * @param player
	 */
	@Override
	public void applyCurse(Player player){
		subtractFromHand( player );
		player.setHealth( 0 );
	}
}