package me.botsko.mythos.spells;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class SpellChoice {
	
	/**
	 * Holds the spells we offer
	 */
	List<SpellBase> spells = new ArrayList<SpellBase>();
	
	
	/**
	 * Add spells to the list.
	 * @todo I'd like them to self-register eventually
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
		if(getRandomNumber() == 2){
			return chooseOnWeight(spells);
		}
		return null;
	}
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public SpellBase chooseSpell(int spell_id){
		Iterator<SpellBase> iterator = spells.iterator();
		while (iterator.hasNext()) {
			SpellBase spell = iterator.next();
			if(spell.getSpellId() == spell_id){
				return spell;
			}
		}
		return null;
	}
	
	
	/**
	 * Gets a random number
	 * @return
	 */
	protected int getRandomNumber(){
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(10); // @todo configure?
	}
	
	
	/**
	 * 
	 * @param items
	 * @return
	 */
	protected SpellBase chooseOnWeight(List<SpellBase> items) {
        double completeWeight = 0.0;
        for (SpellBase item : items)
            completeWeight += item.getWeight();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (SpellBase item : items) {
            countWeight += item.getWeight();
            if (countWeight >= r)
                return item;
        }
        return null;
    }
}