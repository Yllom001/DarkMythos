package me.botsko.mythos.spells;

import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class BotanicalMaturitySpell extends SpellBase implements Spell {

	
	/**
	 * 
	 * @return
	 */
	public short getSpellId(){
		return 1;
	}
	
	
	/**
	 * Returns the weighting of the award
	 */
	public int getWeight(){
		return 60;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getAwardMessage(){
		return "You have discovered a magical spell: Botanical Maturity";
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getSpellUseMessage(){
		return "Used spell Botanical Maturity! Spell book consumed.";
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
		if(currBlock.getType() == Material.SAPLING){
			
			// Determine the tree type
			TreeType t;
			switch(currBlock.getData()){
				case 1:
					t = TreeType.REDWOOD;
					break;
				case 2:
					t = TreeType.BIRCH;
					break;
				case 3:
					t = TreeType.JUNGLE;
					break;
				default:
					t = TreeType.TREE;
			}
			
			currBlock.setType(Material.AIR);
			currBlock.getWorld().generateTree(currBlock.getLocation(), t);
			subtractFromHand( player );
			return true;

		}
		return false;
	}
}