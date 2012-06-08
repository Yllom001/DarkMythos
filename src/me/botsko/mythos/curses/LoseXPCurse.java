package me.botsko.mythos.curses;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class LoseXPCurse extends CurseBase {
	
	
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
		return "Spell book was cursed... you have sacrificed XP!";
	}

	
	/**
	 * 
	 * @param player
	 */
	@Override
	public void applyCurse(Player player){
		player.setLevel(0);
		player.setTotalExperience(0);
		subtractFromHand( player );
	}
}