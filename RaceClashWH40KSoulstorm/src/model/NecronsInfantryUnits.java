package model;

import model.DarkEldarInfantryUnits;

public class NecronsInfantryUnits implements Comparable<NecronsInfantryUnits>   {


	//fields
	private NecronsInfantryAbilities newSetOfAbilities;
	private NecronsInfantryNames     newSetOfNames;
	private int overallScore;


	//default constructor
	/** Creates a new instance of NecronsInfantryUnits, using default NecronsInfantryAbilities and NecronsInfantryNames values. 
	 * The default overallscore is 0. */
	public NecronsInfantryUnits() {


		newSetOfAbilities = new NecronsInfantryAbilities();
		newSetOfNames = new NecronsInfantryNames();
		overallScore = 0;



	}
	
	 /** Creates a new instance of NecronsInfantryUnits, with the given values. 
     * 
     * @param newSetOfabilities the abilities of the units
     * @param newSetOfNames the names of the units
     * @param overallScore the OverallScore for the whole race
     * */


	//custom constructor
	public NecronsInfantryUnits(NecronsInfantryAbilities newSetOfAbilities,NecronsInfantryNames newSetOfNames, int overallScore) {


		this.newSetOfAbilities = newSetOfAbilities;
		this.newSetOfNames = newSetOfNames;
		this.overallScore = overallScore;


	}



	//get and set methods
	
	/**
	 * Returns the abilities that the NecronsUnits have
	 * 
	 * @return the abilities that the NecronsUnits have
	 * 
	 * */
	
	public NecronsInfantryAbilities  getNecronsInfantryAbilities() {


		return newSetOfAbilities;
	}
	
	/**
	 * Returns the names that the NecronsUnits have
	 * 
	 * @return the names that the NecronsUnits have
	 * 
	 * */


	public NecronsInfantryNames getNecronsInfantryNames() {


		return newSetOfNames;

	}
	
	/**
	 * Sets the  Necrons Infantry Abilities , to a value chosen by the user
	 * 
	 * @param newSetOFAbilities, abilities assigned to  Necrons Units
	 * 
	 * */

	public void setNecronsInfantryAbilities(NecronsInfantryAbilities newSetOfAbilities) {

		this.newSetOfAbilities = newSetOfAbilities;



	}
	
	/**
	 * Sets the  Necrons Infantry Names , to a value chosen by the user
	 * 
	 * @param newSetOFNames, Names that the  Necrons Units have, they are assigned to assigned to  Necrons Units
	 * 
	 * */

	public void setNecronsInfantryNames(NecronsInfantryNames newSetOfNames) {

		this.newSetOfNames = newSetOfNames;



	}
	
	/**
	 * Sets the OverallScore , to a value chosen by the user
	 * 
	 * @param overallScore, the overallScore that the  Necrons units have.
	 * 
	 * */
	

	public void setOverallScore(int overallScore) {

		this.overallScore = overallScore;

	}
	
	/**
	 * Returns the overallScore that the NecronsUnits have. It is based on the properties that the two classes have: NecronsInfantryAbilities and NecronsInfantryNames
	 * 
	 * @return the overallScore 
	 * 
	 * */

	public int getOverallScore() 
	{
		overallScore = overallScore + newSetOfNames.getNecronWarriorSquad() + newSetOfAbilities.getDimensionalCorridorAbility() + newSetOfAbilities.getNecromedisRepairAbility() + newSetOfNames.getFlayedOnesSquad() +  newSetOfAbilities.getAuraOfFearAbility() + newSetOfAbilities.getNecromedisRepairAbility() + newSetOfNames.getImmortalsSquad() + newSetOfAbilities.getNecromedisRepairAbility()+ newSetOfNames.getWraithSquad() + newSetOfAbilities.getNecromedisRepairAbility();

		return overallScore;


	}
	
	/** Returns a textual representation of the NecronsInfantryUnitsClass.
	 * 
	 * @return a textual representation of the whole class.
	 */


	@Override
	public String toString() {
		return "NecronsInfantryUnits [newSetOfAbilities=" + newSetOfAbilities + ", newSetOfNames=" + newSetOfNames
				+ ", overallScore=" + overallScore + "]";
	}
	
	@Override
	public int compareTo(NecronsInfantryUnits other) {
		int result = this.newSetOfAbilities.compareTo(other.newSetOfAbilities);

		if (result == 0) {
			result = this.newSetOfNames.compareTo(other.newSetOfNames);

			if (result == 0) {
				result = Integer.compare(this.overallScore, other.overallScore);
			}
		}

		return result;
	}









}
