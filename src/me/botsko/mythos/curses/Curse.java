package me.botsko.mythos.curses;

public interface Curse {

	/**
	 * 
	 * @return
	 */
	public int getWeight();
	
	
	/**
	 * 
	 * @return
	 */
	public String getMessage();
	
	
	/**
	 * 
	 */
	public void applyCurse();
	
}