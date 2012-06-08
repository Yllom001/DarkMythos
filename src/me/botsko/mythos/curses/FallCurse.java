package me.botsko.mythos.curses;

import org.bukkit.Location;
import org.bukkit.Material;
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
		int x = l.getBlockX();
		int y = l.getBlockY();
		int z = l.getBlockZ();
		{
			Location loc = new Location(player.getWorld(), x, y - 1, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 2, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 3, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 4, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 5, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 6, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 7, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 8, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 9, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 10, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 11, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 12, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}		{
			Location loc = new Location(player.getWorld(), x, y - 13, z);
			 player.getWorld().getBlockAt(loc).setType(Material.AIR);
			 player.sendBlockChange(loc, Material.AIR, (byte) 0);
		}
		subtractFromHand( player );
	}
}