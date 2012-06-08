package me.botsko.mythos.utilities;

import java.util.List;
import java.util.Random;

import me.botsko.mythos.spells.SpellBase;

public class WeightedRandom {

	
	/**
	 * Gets a random number
	 * @return
	 */
	public static int getRandomNumber(){
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(5); // @todo configure?
	}
	
	
	/**
	 * 
	 * @param items
	 * @return
	 */
	public static SpellBase chooseOnWeight(List<SpellBase> items) {
		
		// Set total weight for items
        double completeWeight = 0.0d;
        for (SpellBase item : items){
            completeWeight += item.getWeight();
        }
//        System.out.println("Complete Weight Is: " + completeWeight);
        
        // Choose a random item
        double rand = Math.random();
        double r = rand * completeWeight;
        
//        System.out.println("rand Is: " + rand);
//        System.out.println("r Is: " + r);
        
        double countWeight = 0.0;
        for (SpellBase item : items) {
//        	System.out.println("Checking Spell: " + item.getClass().toString() + " CountWeight: " + countWeight);
            countWeight += item.getWeight();
            if (countWeight >= r){
//            	System.out.println("CountWeight Matched");
                return item;
            }
        }
        return null;
    }
}