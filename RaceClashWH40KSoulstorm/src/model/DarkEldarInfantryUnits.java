package model;



public class DarkEldarInfantryUnits implements Comparable<DarkEldarInfantryUnits>  {


	//fields
	private DarkEldarInfantryAbilities newSetOfAbilities;
	private DarkEldarInfantryNames     newSetOfNames;
	private int overallScore;


	//default constructor
	/** Creates a new instance of DarkEldarInfantryUnits, using default DarkEldarInfantryAbilities and DarkEldarInfantryNames values. 
     * The default overallscore is 0. */
	public DarkEldarInfantryUnits() {
		
		newSetOfAbilities = new DarkEldarInfantryAbilities();
		newSetOfNames = new DarkEldarInfantryNames();
		overallScore = 0;

	}


	//custom constructor
	 /** Creates a new instance of DarkEldarInfantryUnits, with the given values. 
     * 
     * @param newSetOfabilities the abilities of the units
     * @param newSetOfNames the names of the units
     * @param overallScore the OverallScore for the whole race
     * */
	public DarkEldarInfantryUnits(DarkEldarInfantryAbilities newSetOfAbilities,DarkEldarInfantryNames newSetOfNames, int overallScore) {


		this.newSetOfAbilities = newSetOfAbilities;
		this.newSetOfNames = newSetOfNames;
		this.overallScore = overallScore;


	}

	//get and set methods
	
	/**
	 * Returns the abilities that the DarkEldarUnits have
	 * 
	 * @return the abilities that the DarkEldarUnits have
	 * 
	 * */
	
	public DarkEldarInfantryAbilities  getDarkEldarInfantryAbilities() {
		return newSetOfAbilities;
	}
	
	
	/**
	 * Returns the names that the DarkEldarUnits have
	 * 
	 * @return the names that the DarkEldarUnits have
	 * 
	 * */
	public DarkEldarInfantryNames getDarkEldarInfantryNames() {
		return newSetOfNames;

	}
	
	/**
	 * Sets the Dark Eldar Infantry Abilities , to a value chosen by the user
	 * 
	 * @param newSetOFAbilities, abilities assigned to Dark Eldar Units
	 * 
	 * */


	public void setDarkEldarInfantryAbilities(DarkEldarInfantryAbilities newSetOfAbilities) {

		this.newSetOfAbilities = newSetOfAbilities;



	}
	
	
	/**
	 * Sets the Dark Eldar Infantry Names , to a value chosen by the user
	 * 
	 * @param newSetOFNames, Names that the Dark Eldar Units have, they are assigned to assigned to Dark Eldar Units
	 * 
	 * */
	public void setDarkEldarInfantryNames(DarkEldarInfantryNames newSetOfNames) {

		this.newSetOfNames = newSetOfNames;



	}
	
	/**
	 * Sets the OverallScore , to a value chosen by the user
	 * 
	 * @param overallScore, the overallScore that the Dark Eldar units have.
	 * 
	 * */
	
	public void setOverallScore(int overallScore) {
		
		this.overallScore = overallScore;
		
	}
	
	/**
	 * Returns the overallScore that the DarkEldarUnits have. It is based on the properties that the two classes have: DarkEldarInfantryAbilities and DarkEldarInfantryNames
	 * 
	 * @return the overallScore 
	 * 
	 * */
	
	public int getOverallScore() 
	{
	 overallScore = overallScore + newSetOfNames.getMandrakeSquad() + newSetOfAbilities.getInfiltrationAbility() + newSetOfNames.getScourgeSquad() +  newSetOfAbilities.getJumpAbility() + newSetOfNames.getWarpBeastPack() + newSetOfAbilities.getSpecialMoraleBrokenEffectAbility()  + newSetOfNames.getWychSquad() + newSetOfAbilities.getCombatDrugsAbility() + newSetOfNames.getWarriorSquad();
	 
	 return overallScore;
	 
		
	}
	
	
	/** Returns a textual representation of the DarkEldarInfantryUnitsClass.
	 * 
	 * @return a textual representation of the whole class.
	 */


	@Override
	public String toString() {
		return "DarkEldarInfantryUnits [newSetOfAbilities=" + newSetOfAbilities + ", newSetOfNames=" + newSetOfNames
				+ ", overallScore=" + overallScore + "]";
	}
	
	
	@Override
	public int compareTo(DarkEldarInfantryUnits other) {
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
