package me.botsko.mythos.spells;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class CreatureThiefSpell extends SpellBase implements Spell {

	
	/**
	 * 
	 * @return
	 */
	public short getSpellId(){
		return 7;
	}
	
	
	/**
	 * Returns the weighting of the award
	 */
	public int getWeight(){
		return 10;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getAwardMessage(){
		return "You have discovered a magical spell: Creature Thief";
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getSpellUseMessage(){
		return "Used spell Creature Thief! Spell book consumed.";
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
			awardThunder();

			return true;
			
		}
		return false;
	}
	
	
	/**
	 * 
	 * @param event
	 * @return
	 */
	public boolean useSpellPlayerEntityInteract(PlayerInteractEntityEvent event, Player player){
		
		Entity e = event.getRightClicked();
		
		if(e != null){
		
			// Determine egg
			ItemStack egg = new ItemStack( 383, 1 );
			egg.setDurability( e.getType().getTypeId() );
			player.getInventory().addItem(egg);
			
			// Remove mob
			e.remove();
			
			// Give egg to player
			player.updateInventory();
			subtractFromHand( player );
	
			return true;
		}
		return false;
	}
}