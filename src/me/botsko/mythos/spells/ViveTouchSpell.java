package me.botsko.mythos.spells;

import me.botsko.mythos.utilities.MythosUtil;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ViveTouchSpell extends SpellBase implements Spell {

	
	/**
	 * 
	 * @return
	 */
	@Override
	public short getSpellId(){
		return 9;
	}
	
	
	/**
	 * Returns the weighting of the award
	 */
	@Override
	public int getWeight(){
		return 1;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String getAwardMessage(){
		return "You have discovered a rare magical book: Shrine of Viveleroi!";
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String getSpellUseMessage(){
		return "Used spell Shrine of Viveleroi! Spell book consumed.";
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
	 * Mikes experiment for making each section more efficient.
	 * @param l
	 * @param range_sart
	 * @param range_end
	 * @param color
	 */
	protected void drawRange( Location l, double z, int range_start, int range_end, Byte colors[] ){
		int i = 0;
		for( int range = range_start; range <= range_end; range++){
			l.setZ( z+range );
			l.getBlock().setTypeIdAndData(35, colors[i], true);
			i++;
		}
	}
	
	
	/**
	 * 
	 * @param event
	 * @return
	 */
	@Override
	public boolean useSpellPlayerInteract(PlayerInteractEvent event, Player player){
	Location l = player.getLocation();
	int x = l.getBlockX();
	int y = l.getBlockY();
	int z = l.getBlockZ();
	Byte white = 0;
	Byte orange = 1;
	Byte magenta = 2;
	Byte lightblue = 3;
	Byte yellow = 4;
	Byte green = 5;
	Byte purple = 10;
	Byte darkblue = 11;
	Byte darkgreen = 13;
	
	
	Byte colors[];
	
	// Bottom front
	colors = new Byte[]{white, white, white, white, white, white, white, white};
	drawRange(l, z, -4, 3, colors);
	
	colors = new Byte[]{white, darkgreen, darkgreen, white, white, darkgreen, darkgreen, white};
	l.setY( y+1 );
	drawRange(l, z, -4, 3, colors);
	
	l.setY( y+2 );
	drawRange(l, z, -4, 3, colors);
	
	colors = new Byte[]{darkgreen, darkgreen, darkgreen, white, white, darkgreen, darkgreen, darkgreen};
	l.setY( y+3 );
	drawRange(l, z, -4, 3, colors);
	
	colors = new Byte[]{white, darkgreen, darkgreen, darkgreen, darkgreen, darkgreen, darkgreen, white};
	l.setY( y+4 );
	drawRange(l, z, -4, 3, colors);
	
	colors = new Byte[]{white, darkgreen, darkgreen, white, white, darkgreen, darkgreen, white};
	l.setY( y+5 );
	drawRange(l, z, -4, 3, colors);
	
	colors = new Byte[]{green, green, green, white, white, green, green, green};
	l.setY( y+6 );
	drawRange(l, z, -4, 3, colors);




{
	Location loc = new Location(player.getWorld(), (x), (y + 7), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 7), (z + 2));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y+ 7), (z + 1));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 7, (z));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 7, (z - 1));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 7), (z - 2));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 7), (z - 3));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 7, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x), (y + 8), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 8), (z + 2));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 8), (z + 1));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 8, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 8, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 8), (z - 2));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 8), (z - 3));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 8, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}



{
	Location loc = new Location(player.getWorld(), (x), (y + 9), (z + 3));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 9), (z + 2));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 9), (z + 1));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 9, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 9, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 9), (z - 2));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 9), (z - 3));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 9, (z - 4));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}



{
	Location loc = new Location(player.getWorld(), (x), (y + 10), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 10), (z + 2));
	loc.getBlock().setTypeIdAndData(35, purple, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 10), (z + 1));
	loc.getBlock().setTypeIdAndData(35, purple, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 10, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 10, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 10), (z - 2));
	loc.getBlock().setTypeIdAndData(35, purple, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 10), (z - 3));
	loc.getBlock().setTypeIdAndData(35, purple, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 10, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}



{
	Location loc = new Location(player.getWorld(), (x), (y + 11), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 11), (z + 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 11), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 11, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 11, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 11), (z - 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 11), (z - 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 11, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
} 



{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z + 6));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z + 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z + 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 12, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 12, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z - 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 12), (z - 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 12, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 12, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 12, (z - 6));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 12, (z - 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 12, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
} 

{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z + 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z + 5));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 13, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 13, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 13), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 13, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 13, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 13, (z - 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 13, (z - 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 13, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}

{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z + 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z + 5));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 14, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 14, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 14), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 14, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 14, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 14, (z - 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 14, (z - 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 14, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}

{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z + 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z + 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z + 5));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 15, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 15, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z - 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 15), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 15, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 15, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 15, (z - 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 15, (z - 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 15, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}

{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z + 6));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z + 5));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z + 2));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z + 1));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 16, (z));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 16, (z - 1));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z - 2));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 16), (z - 3));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 16, (z - 4));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 16, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 16, (z - 6));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 16, (z - 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 16, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z + 6));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z + 5));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z + 2));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z + 1));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 17, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 17, (z - 1));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z - 2));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 17), (z - 3));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 17, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 17, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 17, (z - 6));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 17, (z - 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 17, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}

{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z + 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z + 6));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z + 5));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z + 3));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z + 2));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z + 1));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 18, (z));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 18, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z - 2));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 18), (z - 3));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 18, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 18, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 18, (z - 6));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 18, (z - 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 18, (z - 8));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}


{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z + 6));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z + 5));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z + 2));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z + 1));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 19, (z));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 19, (z - 1));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z - 2));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 19), (z - 3));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 19, (z - 4));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 19, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 19, (z - 6));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 19, (z - 7));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 19, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z + 6));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z + 5));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z + 2));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 20, (z));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 20, (z - 1));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z - 2));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 20), (z - 3));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 20, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 20, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 20, (z - 6));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 20, (z - 7));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 20, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z + 7));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z + 6));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z + 5));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 21, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 21, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 21), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 21, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 21, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 21, (z - 6));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 21, (z - 7));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 21, (z - 8));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}


{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 6));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 5));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 6));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 7));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 6));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z - 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), (y + 22), (z - 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 6));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 22, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}

//HEAD
{
	Location loc = new Location(player.getWorld(), (x + 1), (y + 23), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), (y + 23), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), (y + 23), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 23, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 23, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), (y + 23), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), (y + 23), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 23, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z + 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 23, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 23, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z - 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 23, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 24), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 24), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 24), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 24, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 24, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 24), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 24), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 24, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 25), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 25), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 25), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 25, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 25, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 25), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 25), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 26), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 26), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 26), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 26, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 26, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 26), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 26), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 27), (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 27), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 27), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 27, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 27, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 27), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 27), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 28), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 28), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 28), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 28, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 28, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 28), (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 28), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 29), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 29), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 29), (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 29, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 29, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 29), (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 29), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 30), (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 30), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 30), (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 30, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 30, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 30), (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 30), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 31), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 31), (z + 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 31), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 31, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 31), (z - 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 31), (z - 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}








{
Location loc = new Location(player.getWorld(), (x - 3), y, (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y, (z + 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y, (z + 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y, (z - 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y, (z - 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}




{
Location loc = new Location(player.getWorld(), (x - 3), (y + 1), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 1), (z + 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 1), (z + 1));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 1, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 1, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 1), (z - 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 1), (z - 3));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 1, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}



{
Location loc = new Location(player.getWorld(), (x - 3), (y + 2), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 2), (z + 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 2), (z + 1));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 2, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y +2, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 2), (z - 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 2), (z - 3));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 2, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 3), (z + 3));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 3), (z + 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 3), (z + 1));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 3, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y +3, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 3), (z - 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 3), (z - 3));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 3, (z - 4));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 4), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 4), (z + 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 4), (z + 1));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 4, (z));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 4, (z - 1));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 4), (z - 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 4), (z - 3));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 4, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}



{
Location loc = new Location(player.getWorld(), (x - 3), (y + 5), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 5), (z + 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 5), (z + 1));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 5, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 5, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 5), (z - 2));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 5), (z - 3));
loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 5, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}



{
Location loc = new Location(player.getWorld(), (x - 3), (y + 6), (z + 3));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y +6), (z + 2));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 6), (z + 1));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 6, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y +6, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 6), (z - 2));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 6), (z - 3));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 6, (z - 4));
loc.getBlock().setTypeIdAndData(35, green, true);
}



{
Location loc = new Location(player.getWorld(), (x - 3), (y + 7), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 7), (z + 2));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y+ 7), (z + 1));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 7, (z));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 7, (z - 1));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 7), (z - 2));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 7), (z - 3));
loc.getBlock().setTypeIdAndData(35, green, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 7, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 8), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 8), (z + 2));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 8), (z + 1));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 8, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 8, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 8), (z - 2));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 8), (z - 3));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 8, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}



{
Location loc = new Location(player.getWorld(), (x - 3), (y + 9), (z + 3));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 9), (z + 2));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 9), (z + 1));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 9, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 9, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 9), (z - 2));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 9), (z - 3));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 9, (z - 4));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}



{
Location loc = new Location(player.getWorld(), (x - 3), (y + 10), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 10), (z + 2));
loc.getBlock().setTypeIdAndData(35, purple, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 10), (z + 1));
loc.getBlock().setTypeIdAndData(35, purple, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 10, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 10, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 10), (z - 2));
loc.getBlock().setTypeIdAndData(35, purple, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 10), (z - 3));
loc.getBlock().setTypeIdAndData(35, purple, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 10, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}



{
Location loc = new Location(player.getWorld(), (x - 3), (y + 11), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 11), (z + 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 11), (z + 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 11, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 11, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 11), (z - 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 11), (z - 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 11, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
} 



{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z + 6));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z + 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z + 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z + 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 12, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 12, (z - 1));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z - 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 12), (z - 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 12, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 12, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 12, (z - 6));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 12, (z - 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 12, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
} 

{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z + 6));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z + 5));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z + 2));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z + 1));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 13, (z));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 13, (z - 1));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z - 2));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 13), (z - 3));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 13, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 13, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 13, (z - 6));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 13, (z - 7));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 13, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}

{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z + 6));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z + 5));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z + 2));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z + 1));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 14, (z));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 14, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z - 2));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 14), (z - 3));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 14, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 14, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 14, (z - 6));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 14, (z - 7));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 14, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}

{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z + 7));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z + 6));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z + 5));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z + 3));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z + 2));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z + 1));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 15, (z));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 15, (z - 1));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z - 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 15), (z - 3));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 15, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 15, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 15, (z - 6));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 15, (z - 7));
loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 15, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}

{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z + 6));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z + 5));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z + 2));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z + 1));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 16, (z));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 16, (z - 1));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z - 2));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 16), (z - 3));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 16, (z - 4));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 16, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 16, (z - 6));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 16, (z - 7));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 16, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z + 6));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z + 5));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z + 2));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z + 1));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 17, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 17, (z - 1));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z - 2));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 17), (z - 3));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 17, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 17, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 17, (z - 6));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 17, (z - 7));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 17, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}

{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z + 7));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z + 6));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z + 5));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z + 3));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z + 2));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z + 1));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 18, (z));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 18, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z - 2));
loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 18), (z - 3));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 18, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 18, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 18, (z - 6));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 18, (z - 7));
loc.getBlock().setTypeIdAndData(35, orange, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 18, (z - 8));
loc.getBlock().setTypeIdAndData(35, orange, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z + 6));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z + 5));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z + 2));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z + 1));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 19, (z));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 19, (z - 1));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z - 2));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 19), (z - 3));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 19, (z - 4));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 19, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 19, (z - 6));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 19, (z - 7));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 19, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z + 6));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z + 5));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z + 2));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z + 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 20, (z));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 20, (z - 1));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z - 2));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 20), (z - 3));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 20, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 20, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 20, (z - 6));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 20, (z - 7));
loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 20, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z + 7));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z + 6));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z + 5));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z + 3));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z + 2));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z + 1));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 21, (z));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 21, (z - 1));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z - 2));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 21), (z - 3));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 21, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 21, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 21, (z - 6));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 21, (z - 7));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 21, (z - 8));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 6));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 5));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 2));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 1));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 1));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z - 2));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z - 3));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 6));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 7));
loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}


{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 6));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z + 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 1));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z - 2));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), (y + 22), (z - 3));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 4));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 5));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 6));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 7));
loc.getBlock().setTypeIdAndData(35, white, true);
}{
Location loc = new Location(player.getWorld(), (x - 3), y + 22, (z - 8));
loc.getBlock().setTypeIdAndData(35, white, true);
}









{
	Location loc = new Location(player.getWorld(), (x - 1), y, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 1, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 2, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 3, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 4, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 5, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 6, (z + 3));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 7, (z + 3));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 8, (z + 3));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 9, (z + 3));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 10, (z + 3));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 11, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 2), y, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 1, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 2, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 3, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 4, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 5, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 6, (z + 3));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 7, (z + 3));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 8, (z + 3));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 9, (z + 3));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 10, (z + 3));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 11, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}



{
	Location loc = new Location(player.getWorld(), (x - 1), y, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 1, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 2, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 3, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 4, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 5, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 6, (z - 4));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 7, (z - 4));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 8, (z - 4));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 9, (z - 4));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 10, (z - 4));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 11, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 2), y, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 1, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 2, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 3, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 4, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 5, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkgreen, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 6, (z - 4));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 7, (z - 4));
	loc.getBlock().setTypeIdAndData(35, green, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 8, (z - 4));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 9, (z - 4));
	loc.getBlock().setTypeIdAndData(35, yellow, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 10, (z - 4));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 11, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}






//RIGHT HAND

{
	Location loc = new Location(player.getWorld(), (x - 2), y + 12, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 12, (z - 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 12, (z - 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 12, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 1), y + 12, (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 12, (z + 5));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 12, (z + 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 12, (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}
//LEFT HAND
{
	Location loc = new Location(player.getWorld(), (x - 2), y + 12, (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 12, (z + 5));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 12, (z + 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 12, (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 1), y + 12, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 12, (z - 6));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 12, (z - 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 12, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}

//RIGHT ARM
{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 13, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 13, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 14, (z - 8));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 14, (z - 8));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 15, (z - 8));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 15, (z - 8));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 16, (z - 8));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 16, (z - 8));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 17, (z - 8));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 17, (z - 8));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 18, (z - 8));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 18, (z - 8));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 19, (z - 8));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 19, (z - 8));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 20, (z - 8));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 20, (z - 8));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 21, (z - 8));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 21, (z - 8));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 22, (z - 8));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 22, (z - 8));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 23, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 23, (z - 8));
	loc.getBlock().setTypeIdAndData(35, white, true);
}
//LEFT ARM
{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 13, (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 13, (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 14, (z + 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 14, (z + 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 15, (z + 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 15, (z + 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 16, (z + 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 16, (z + 7));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 17, (z + 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 17, (z + 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 18, (z + 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 18, (z + 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 19, (z + 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 19, (z + 7));
	loc.getBlock().setTypeIdAndData(35, orange, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 20, (z + 7));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 20, (z + 7));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 21, (z + 7));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 21, (z + 7));
	loc.getBlock().setTypeIdAndData(35, magenta, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 22, (z + 7));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 22, (z + 7));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 1 + 23, (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 1 + 23, (z + 7));
	loc.getBlock().setTypeIdAndData(35, white, true);
}
//right shoulder
{
	Location loc = new Location(player.getWorld(), (x - 2), y + 22, (z - 7));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 22, (z - 7));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 22, (z - 6));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 22, (z - 6));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 22, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 22, (z - 5));
	loc.getBlock().setTypeIdAndData(35, white, true);
}
//left shoulder
{
	Location loc = new Location(player.getWorld(), (x - 2), y + 22, (z + 6));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 22, (z + 6));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 22, (z + 5));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 22, (z + 5));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 22, (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 22, (z + 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}

//HEAD MORE
{
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 25, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 25, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 25, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 25, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 25, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 25, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 25, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 26, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 26, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 26, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 26, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 26, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 26, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 26, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 27, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 27, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 27, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 27, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 27, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 27, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 27, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 28, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 28, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 28, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 28, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 28, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 28, (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 28, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 29, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 29, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 29, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 29, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 29, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 29, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 29, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 30, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 30, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 30, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 30, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 30, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 30, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 30, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 32, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 32, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 32, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 32, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 32, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 32, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 32, (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
	}{
		Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 33, (z +3));
		loc.getBlock().setTypeIdAndData(35, white, true);
	}{
		Location loc = new Location(player.getWorld(), (x + 0), y - 2 + 33, (z +3));
		loc.getBlock().setTypeIdAndData(35, white, true);
	}{
		Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 33, (z +3));
		loc.getBlock().setTypeIdAndData(35, white, true);
	}{
		Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 33, (z +3));
		loc.getBlock().setTypeIdAndData(35, white, true);
	}{
		Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 33, (z +3));
		loc.getBlock().setTypeIdAndData(35, white, true);
	}{
		Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 33, (z +3));
		loc.getBlock().setTypeIdAndData(35, white, true);
	}{
		Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 33, (z +3));
		loc.getBlock().setTypeIdAndData(35, white, true);
	}
//RIGHT HEAD

{
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
} {
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 32, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x), y - 2 + 32, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 32, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 32, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 32, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 32, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 32, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y - 2 + 33, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 0), y - 2 + 33, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y - 2 + 33, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y - 2 + 33, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y - 2 + 33, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y - 2 + 33, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y - 2 + 33, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}
//TOP HEAD AROUND BACK
{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z + 0));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
} {
	Location loc = new Location(player.getWorld(), (x - 4), y + 31, (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y + 31, (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y + 31, (z + 0));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y + 31, (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y + 31, (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 4), y + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
} {
	Location loc = new Location(player.getWorld(), (x - 3), y + 31, (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y + 31, (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y + 31, (z + 0));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y + 31, (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y + 31, (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 3), y + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
} {
	Location loc = new Location(player.getWorld(), (x - 2), y + 31, (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 31, (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 31, (z + 0));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 31, (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 31, (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 2), y + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
} {
	Location loc = new Location(player.getWorld(), (x - 1), y + 31, (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 31, (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 31, (z + 0));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x -1), y + 31, (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 31, (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 1), y + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
} {
	Location loc = new Location(player.getWorld(), (x - 0), y + 31, (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x ), y + 31, (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x ), y + 31, (z + 0));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 31, (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x ), y + 31, (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x), y + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
} {
	Location loc = new Location(player.getWorld(), (x+1), y + 31, (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 31, (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 31, (z + 0));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 31, (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 31, (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 1), y + 31, (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z + 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 23, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 23, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), (y + 23), (z - 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x + 2), y + 23, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 24), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 24), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 24), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 24, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 24, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 24), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 24), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 24, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 25), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 25), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 25), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 25, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 25, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 25), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 25), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 25, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 26), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 26), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 26), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 26, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 26, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 26), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 26), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 26, (z - 4));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 27), (z + 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 27), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 27), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 27, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 27, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 27), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 27), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 27, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 28), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 28), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 28), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 28, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 28, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 28), (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 28), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 28, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 29), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 29), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 29), (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 29, (z));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 29, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 29), (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 29), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 29, (z - 4));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 30), (z + 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 30), (z + 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 30), (z + 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 30, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 30, (z - 1));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 30), (z - 2));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 30), (z - 3));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 30, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}


{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 31), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 31), (z + 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 31), (z + 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z));
	loc.getBlock().setTypeIdAndData(35, darkblue, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z - 1));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 31), (z - 2));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), (y + 31), (z - 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x - 5), y + 31, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x -4), (y + 23), (z + 3));
	loc.getBlock().setTypeIdAndData(35, white, true);
}{
	Location loc = new Location(player.getWorld(), (x -4), (y + 23), (z + 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x -4), (y + 23), (z + 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x -4), y + 23, (z));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x -4), y + 23, (z - 1));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x -4), (y + 23), (z - 2));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x -4), (y + 23), (z - 3));
	loc.getBlock().setTypeIdAndData(35, lightblue, true);
}{
	Location loc = new Location(player.getWorld(), (x -4), y + 23, (z - 4));
	loc.getBlock().setTypeIdAndData(35, white, true);
}

MythosUtil.subtractFromHand( player );
return true;
}
}
