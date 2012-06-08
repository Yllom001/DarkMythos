package me.botsko.mythos.curses;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PoisonPlayerCurse extends CurseBase {
	
	
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
		player.addPotionEffect( new PotionEffect(PotionEffectType.POISON, 200, 1) );
		subtractFromHand( player );
	}
}