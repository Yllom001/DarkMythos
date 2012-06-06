package me.botsko.mythos.awards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import me.botsko.mythos.spells.BotanicalMaturitySpell;
import me.botsko.mythos.spells.CreatureBanisherSpell;
import me.botsko.mythos.spells.CreatureThiefSpell;
import me.botsko.mythos.spells.DiamondTouchSpell;
import me.botsko.mythos.spells.FeatherTouchSpell;
import me.botsko.mythos.spells.GoldenTouchSpell;
import me.botsko.mythos.spells.IronTouchSpell;
import me.botsko.mythos.spells.PickSummonerSpell;
import me.botsko.mythos.spells.SpellBase;

public class AwardChoice {
	
	/**
	 * Holds the spells we offer
	 */
	List<SpellBase> spells = new ArrayList<SpellBase>();
	
	
	/**
	 * Add spells to the list.
	 * @todo I'd like them to self-register eventually
	 */
	public AwardChoice(){
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
	public SpellBase chooseRandomAward(){
		// We only want to choose a weighted award
		// very rarely, so it's odds are checked first
		if(getRandomNumber() == 5){
			return chooseOnWeight(spells);
		}
		return null;
		
	}
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public SpellBase chooseAward(int spell_id){
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
		return randomGenerator.nextInt(25); // @todo configure?
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