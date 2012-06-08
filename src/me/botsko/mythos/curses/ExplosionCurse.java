package me.botsko.mythos.curses;

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
		return "Spell book was cursed by Artago, God of Explosions!";
	}

	
	/**
	 * 
	 * @param player
	 */
	public void applyCurse(Player player){
		player.getWorld().createExplosion(player.getLocation(), 4F);
		player.setHealth(0);
		subtractFromHand( player );
	}
}