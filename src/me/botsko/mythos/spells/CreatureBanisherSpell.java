package me.botsko.mythos.spells;

import me.botsko.mythos.utilities.MythosUtil;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class CreatureBanisherSpell extends SpellBase implements Spell {

	
	/**
	 * 
	 * @return
	 */
	@Override
	public short getSpellId(){
		return 8;
	}
	
	
	/**
	 * Returns the weighting of the award
	 */
	@Override
	public int getWeight(){
		return 55;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String getAwardMessage(){
		return "You have discovered a magical spell: Creature Banisher";
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String getSpellUseMessage(){
		return "Used spell Creature Banisher! Spell book consumed.";
	}
	
	
	/**
	 * 
	 */
	@Override
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
	@Override
	public boolean useSpellPlayerEntityInteract(PlayerInteractEntityEvent event, Player player){
		
		Entity e = event.getRightClicked();
		
		if(e != null){

			// Remove mob
			e.remove();
			
			MythosUtil.subtractFromHand( player );
	
			return true;
		}
		return false;
	}
}