package me.botsko.mythos.artifacts;

import java.util.ArrayList;
import java.util.List;

import me.botsko.mythos.MythosWeighted;
import me.botsko.mythos.utilities.WeightedRandom;


public class ArtifactChoice {
	
	/**
	 * Holds the artifacts we offer
	 */
	List<MythosWeighted> artifacts = new ArrayList<MythosWeighted>();
	
	
	/**
	 * Add spells to the list.
	 * @todo I'd like them to self-register eventually
	 */
	public ArtifactChoice(){
		artifacts.add(new ApollosSwordArtifact());
	}
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public ArtifactBase chooseRandomArtifact(){
		// We only want to choose a weighted artifact
		// very rarely, so it's odds are checked first
		if(WeightedRandom.getRandomNumber() == 2){
			return (ArtifactBase) WeightedRandom.chooseOnWeight(artifacts);
		}
		return null;
	}
}