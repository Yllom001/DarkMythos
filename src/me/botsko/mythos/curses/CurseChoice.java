package me.botsko.mythos.curses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CurseChoice {
	
	/**
	 * Holds the spells we offer
	 */
	List<CurseBase> curses = new ArrayList<CurseBase>();
	
	
	/**
	 * Add spells to the list.
	 * @todo I'd like them to self-register eventually
	 */
	public CurseChoice(){
		curses.add(new HealthDamageCurse());
		curses.add(new PoisonPlayerCurse());
		curses.add(new KillPlayerCurse());
		curses.add(new LoseXPCurse());
	}
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public CurseBase chooseRandomCurse(){
		// We only want to choose a weighted award
		// very rarely, so it's odds are checked first
//		if(getRandomNumber() == 2){
			return chooseOnWeight(curses);
//		}
//		return null;
		
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
	protected CurseBase chooseOnWeight(List<CurseBase> items) {
        double completeWeight = 0.0;
        for (CurseBase item : items)
            completeWeight += item.getWeight();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (CurseBase item : items) {
            countWeight += item.getWeight();
            if (countWeight >= r)
                return item;
        }
        return null;
    }
}