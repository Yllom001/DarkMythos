package me.botsko.mythos.spells;

public interface Spell {

	/**
	 * 
	 * @return
	 */
	public short getSpellId();
	
	/**
	 * 
	 * @return
	 */
	public int getWeight();
	
	/**
	 * 
	 * @return
	 */
	public String getAwardMessage();
	
	
	/**
	 * 
	 * @return
	 */
	public String getSpellUseMessage();
	
	
	
}
