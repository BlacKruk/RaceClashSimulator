package model;

import model.DarkEldarInfantryNames;

public class NecronsInfantryNames implements Comparable<NecronsInfantryNames>{

	//fields
	private int necronWarriors;
	private int flayedOnes;
	private int Immortals;
	private int Wraiths;


	//default constructor

	/** Creates a new instance of NecronsInfantryNames,using default necronWarriors, flayedOnes, immortals,wraiths values. 
	 * The default overallscore is 0. */
	public NecronsInfantryNames() {

		necronWarriors = 0;
		flayedOnes = 0;
		Immortals = 0;
		Wraiths = 0;

	}

	//custom constructor
	/** Creates a new instance of NecronsInfantryNames, with the given values. 
	 * 
	 * @param necronWarriors - a necronWarriors squad, one of NecronsInfantryUnits
	 * @param flayedOnes - a flayedOnes squad, one of NecronsInfantryUnits
	 * @param Immortals - an Immortals squad, one of NecronsInfantryUnits
	 * @param  Wraiths   - a wraith squad,one of NecronsInfantryUnits
	 * */


	//custom constructor
	public NecronsInfantryNames(int necronWarriors, int flayedOnes, int Immortals, int Wraiths) 
	{


		this.necronWarriors = necronWarriors;
		this.flayedOnes = flayedOnes;
		this.Immortals = Immortals;
		this.Wraiths = Wraiths;

	}

	//get and set methods

	/**
	 * Returns a necronWarriorsSquad
	 * 
	 * @return necronWarriorsSquad, how many necronWarriors squads does the player have
	 * 
	 * */


	public int getNecronWarriorSquad() {

		return necronWarriors;

	}

	/**
	 * Returns a flayedOnesSquad
	 * 
	 * @return flayedOnesSquad, how many flayedOnes squads does the player have
	 * 
	 * */

	public int getFlayedOnesSquad() {

		return flayedOnes;

	}

	/**
	 * Returns an ImmortalsSquad
	 * 
	 * @return ImmortalsSquad, how many Immortals squads does the player have
	 * 
	 * */

	public int getImmortalsSquad() {

		return Immortals;

	}

	/**
	 * Returns a WraithSquad
	 * 
	 * @return necronWarriorsSquad, how many wraith squads does the player have
	 * 
	 * */

	public int getWraithSquad() {

		return Wraiths;

	}


	/*
	@Override
	public int getOverallScore() {

		return super.getOverallScore() + necronWarriors + flayedOnes + Immortals + Wraiths;
	}
	 */

	//set methods

	/**
	 * Sets the amount of  NecronWarriorsSquads , to a value chosen by the user
	 * 
	 * @param necronWarriors, the amount of NecronWarriors  to be assigned to the "NecronWarriors" field
	 * 
	 * */


	public void setNecronWarriorsSquad(int NecronWarriors) {

		this.necronWarriors = NecronWarriors;

	}

	/**
	 * Sets the amount of  flayedOnesSquads , to a value chosen by the user
	 * 
	 * @param flayedOnes, the amount of flayedOnesSquads  to be assigned to the "flayedOnes" field
	 * 
	 * */


	public void setFlayedOnesSquad(int flayedOnesSquad) {

		this.flayedOnes = flayedOnesSquad;

	}

	/**
	 * Sets the amount of wraithSquads , to a value chosen by the user
	 * 
	 * @param wraithSquads, the amount of wraithSquads  to be assigned to the "Wraiths" field
	 * 
	 * */

	public void setWraithSquad(int WraithSquad) {

		this.Wraiths = WraithSquad;

	}

	/**
	 * Sets the amount of  ImmortalsSquads , to a value chosen by the user
	 * 
	 * @param Immortals, the amount of Immortals to be assigned to the "Immortals" field
	 * 
	 * */

	public void setImmortalsSquad(int Immortals) {

		this.Immortals = Immortals;

	}

	/**
	 * Returns a textual representation of the whole class
	 * 
	 * @return a textual representation of the whole class 
	 * */


	@Override
	public String toString() {
		return "NecronsInfantryNames [necronWarriors=" + necronWarriors + ", flayedOnes=" + flayedOnes + ", Immortals="
				+ Immortals + ", Wraiths=" + Wraiths + "]";
	}
	
	
	@Override
	public int compareTo(NecronsInfantryNames other) {
		int result = Integer.compare(this.necronWarriors, other.necronWarriors);		
		
		if (result == 0) {
			result = Integer.compare(this.flayedOnes, other.flayedOnes);

			if (result == 0) {
				result = Integer.compare(this.Immortals, other.Immortals);
				
				if (result == 0) {
				
					result = Integer.compare(this.Wraiths, other.Wraiths);
					
					
				}
			}
		}

		return result;
	}


}
