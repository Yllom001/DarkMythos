package me.botsko.mythos.artifacts;

import java.util.ArrayList;
import java.util.List;

import me.botsko.mythos.Mythos;
import me.botsko.mythos.MythosWeighted;
import me.botsko.mythos.utilities.WeightedRandom;


public class ArtifactChoice {
	
	private Mythos plugin;
	
	/**
	 * Holds the artifacts we offer
	 */
	List<MythosWeighted> artifacts = new ArrayList<MythosWeighted>();
	
	
	/**
	 * Add spells to the list.
	 * @todo I'd like them to self-register eventually
	 */
	public ArtifactChoice( Mythos plugin ){
		
		this.plugin = plugin;
		
		artifacts.add(new ApollosSwordArtifact());
	}
	
	
	/**
	 * Chooses a random reward.
	 * @return
	 */
	public ArtifactBase chooseRandomArtifact(){
		// We only want to choose a weighted artifact
		// very rarely, so it's odds are checked first
		if(WeightedRandom.getRandomNumber( plugin.getConfig().getInt("mythos.artifact_chance_range") ) == 2){
			return (ArtifactBase) WeightedRandom.chooseOnWeight(artifacts);
		}
		return null;
	}
}