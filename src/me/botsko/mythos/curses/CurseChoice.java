package me.botsko.mythos.curses;

import java.util.ArrayList;
import java.util.List;

import me.botsko.mythos.MythosWeighted;
import me.botsko.mythos.utilities.WeightedRandom;


public class CurseChoice {
	
	/**
	 * Holds the spells we offer
	 */
	List<MythosWeighted> curses = new ArrayList<MythosWeighted>();
	
	
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
//		if(WeightedRandom.getRandomNumber() == 2){
			return (CurseBase) WeightedRandom.chooseOnWeight(curses);
//		}
//		return null;
		
	}
}