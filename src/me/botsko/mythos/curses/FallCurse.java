package me.botsko.mythos.curses;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class FallCurse extends CurseBase {
	
	
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
		return "Spell book was cursed... you have destroyed the ground beneath you!";
	}

	
	
	/**
	 * 
	 * @param player
	 */
	public void applyCurse(Player player){
		Location l = player.getLocation();
		l.setY( player.getWorld().getMaxHeight() );
		player.teleport( l );
		subtractFromHand( player );
	}
}