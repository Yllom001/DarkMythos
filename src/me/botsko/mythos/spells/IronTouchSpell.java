package me.botsko.mythos.spells;

import me.botsko.mythos.utilities.MythosUtil;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class IronTouchSpell extends SpellBase implements Spell {

	
	/**
	 * 
	 * @return
	 */
	public short getSpellId(){
		return 2;
	}
	
	
	/**
	 * Returns the weighting of the award
	 */
	public int getWeight(){
		return 30;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getAwardMessage(){
		return "You have discovered a magical spell: Iron Touch";
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getSpellUseMessage(){
		return "Used spell Iron Touch! Spell book consumed.";
	}
	
	
	/**
	 * 
	 */
	public boolean getBlockBreakAward(BlockBreakEvent event){
		
		block = event.getBlock();
		if( block.getType() == Material.GRASS || block.getType() == Material.DIRT ){
			
			// Set item
			ItemStack i = new ItemStack(Material.BOOK, 1);
			i.setDurability( getSpellId() );
			
			// Drop the item
			block.getWorld().dropItemNaturally(block.getLocation(), i);
			
			// Boom!
			MythosUtil.awardThunder( block );

			return true;
			
		}
		return false;
	}
	
	/**
	 * 
	 * @param event
	 * @return
	 */
	public boolean useSpellPlayerInteract(PlayerInteractEvent event, Player player){
		Block currBlock = event.getClickedBlock();
		currBlock.setType(Material.IRON_BLOCK);
		MythosUtil.subtractFromHand( player );
		return true;
	}
}