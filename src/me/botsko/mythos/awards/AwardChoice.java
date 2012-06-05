package me.botsko.mythos.awards;

import java.util.Random;

import me.botsko.mythos.spells.BotanicalMaturitySpell;
import me.botsko.mythos.spells.SpellBase;

public class AwardChoice {
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public SpellBase chooseRandomAward(){
		return chooseAward( getRandomNumber() );
	}
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public SpellBase chooseAward(int spell_id){
		if(spell_id == 1){
	        return new BotanicalMaturitySpell();
		}
		return null;
	}
	
	
	/**
	 * Gets a random number
	 * @return
	 */
	public int getRandomNumber(){
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(5);
	}
}