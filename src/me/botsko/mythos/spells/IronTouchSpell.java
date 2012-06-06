package me.botsko.mythos.spells;

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
	public boolean useSpellPlayerInteract(PlayerInteractEvent event, Player player){
		
		Block currBlock = event.getClickedBlock();
//		if(currBlock.getType() == Material.SAPLING){
			currBlock.setType(Material.IRON_BLOCK);
			ItemStack I = player.getInventory().getItemInHand();
			int A = I.getAmount();
			int giveBack = A - 1;
			player.getInventory().getItemInHand().setAmount(giveBack);
			return true;
//		}
//		return false;
	}
}