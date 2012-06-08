package me.botsko.mythos.curses;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class ExplosionCurse extends CurseBase {
	
	
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
		return "Spell book held a rare curse... you have created an explosion!";
	}

	
	
	/**
	 * 
	 * @param player
	 */
	public void applyCurse(Player player){
		float explosionPower = 4F;
		Location l = player.getLocation();
		player.getWorld().createExplosion(l, explosionPower);
		player.setHealth( 0 );
		subtractFromHand( player );
	}
}