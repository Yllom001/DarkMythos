package me.botsko.mythos.spells;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import me.botsko.mythos.MythosWeighted;
import me.botsko.mythos.utilities.WeightedRandom;


public class SpellChoice {
	
	/**
	 * Holds the spells we offer
	 */
	List<MythosWeighted> spells = new ArrayList<MythosWeighted>();
	
	
	/**
	 * Add spells to the list.
	 * @todo I'd like them to self-register eventually
	 * 
	 */
	public SpellChoice(){
		spells.add(new BotanicalMaturitySpell());
		spells.add(new IronTouchSpell());
		spells.add(new GoldenTouchSpell());
		spells.add(new DiamondTouchSpell());
		spells.add(new FeatherTouchSpell());
		spells.add(new CreatureThiefSpell());
		spells.add(new PickSummonerSpell());
		spells.add(new CreatureBanisherSpell());
	}
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public SpellBase chooseRandomSpell(){
		// We only want to choose a weighted award
		// very rarely, so it's odds are checked first
		if(WeightedRandom.getRandomNumber() == 2){
			return (SpellBase) WeightedRandom.chooseOnWeight(spells);
		}
		return null;
	}
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public SpellBase chooseSpell(int spell_id){
		Iterator<MythosWeighted> iterator = spells.iterator();
		while (iterator.hasNext()) {
			SpellBase spell = (SpellBase) iterator.next();
			if(spell.getSpellId() == spell_id){
				return spell;
			}
		}
		return null;
	}
}