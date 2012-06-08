package me.botsko.mythos.curses;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class HealthDamageCurse extends CurseBase {
	
	
	/**
	 * Block the action happened to
	 */
	protected Block block;

	
	/**
	 * 
	 * @return
	 */
	public int getWeight(){
		return 60;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getMessage(){
		return "Spell book was cursed... you have sacrificed health!";
	}

	
	/**
	 * 
	 * @param player
	 */
	public void applyCurse(Player player){
		player.setHealth( player.getHealth() - 15 );
		subtractFromHand( player );
	}
}