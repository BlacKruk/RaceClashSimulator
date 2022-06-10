package model;

public class DarkEldarInfantryAbilities implements Comparable<DarkEldarInfantryAbilities> {


	//fields
	private int combatDrugs;
	private int infiltration;
	private int jump;
	private int specialMoraleBrokenEffect;



	//default constructor
	/** Creates a new instance of DarkEldarInfantryNames,using default combatDrugs, infiltration, jump, specialMoraleBrokenFeect values. 
	 * The default overallscore is 0. */

	//default constructor
	public DarkEldarInfantryAbilities () {


		combatDrugs = 0;
		infiltration = 0;
		jump = 0;
		specialMoraleBrokenEffect = 0;


	}

	//custom constructor
	/** Creates a new instance of DarkEldarInfantryNames, with the given values. 
	 * 
	 * @param combatDrugs - additional ability, can only be assigned to a WychSquad
	 * @param infiltration - additional ability, can only be assigned to a MandrakeSquad
	 * @param jump -additional ability, can only be assigned to a ScourgeSquad 
	 * @param  specialMoraleBrokenEffect   - can only be assigned  to a WarpBeastPack
	 * */

	public DarkEldarInfantryAbilities(int combatDrugs, int infiltration, int jump,int specialMoraleBrokenEffect) {


		this.combatDrugs = combatDrugs;
		this.infiltration = infiltration;
		this.jump = jump;
		this.specialMoraleBrokenEffect = specialMoraleBrokenEffect;

	}

	//get and set methods
	
	
	/**
	 * Sets the combatDrugs value to 10
	 * 
	 * @param combatDrugs, sets the combat drugs value to 10
	 * 
	 * */
	public void assignCombatDrugsAbility() {


		this.combatDrugs = 10;

	}

	

	/**
	 * Sets the infiltration value to 10
	 * 
	 * @param combatDrugs, sets the infiltration value to 10
	 * 
	 * */
	public void assignInfiltrationAbility() {

		this.infiltration = 10;
	}
	
	
	/**
	 * Sets the jump value to 10
	 * 
	 * @param jump, sets the infiltration value to 10
	 * 
	 * */
	public void assignJumpAbility() {

		this.jump = 10;


	}
	
	/**
	 * Sets the specialMoraleBrokenEffect value to 10
	 * 
	 * @param specialMoraleBrokenEffect, sets the specialMoraleBrokenEffect value to 10
	 * 
	 * */
	public void assignSpecialMoraleBrokenEffectAbility() {

		this.specialMoraleBrokenEffect = 10;
	}

	
	/**
	 * Returns the combatDrugs ability that the DarkEldarUnits have. It can only be assigned to a witchSquad	 * 
	 * @return combatDrugs
	 * 
	 * */
	public int getCombatDrugsAbility() {

		return combatDrugs;
	}
	
	/**
	 * Returns the infiltration ability that the DarkEldarUnits have. It can only be assigned to a mandrakeSquad	 * 
	 * @return infiltration
	 * 
	 * */
	public int getInfiltrationAbility() {

		return infiltration;
	}
	
	/**
	 * Returns the jump ability that the DarkEldarUnits have. It can only be assigned to a scourgeSquad	* 
	 * @return jump
	 * 
	 * */
	public int getJumpAbility() {

		return jump;
	}
	
	/**
	 * Returns the specialMoraleBrokenEffect ability that the DarkEldarUnits have. It can only be assigned to a mandrakeSqua* 
	 * @return specialMoraleBrokenEffect
	 * 
	 * */
	public int getSpecialMoraleBrokenEffectAbility() {

		return specialMoraleBrokenEffect;
	}

	/**
	 * Returns a textual representation of the whole class 
	 * @return a  textual representaion
	 * 
	 * */
	@Override
	public String toString() {
		return super.toString() + "DarkEldarInfantryAbilities:[combatDrugs=" + combatDrugs + ", infiltration=" + infiltration + ", jump="
				+ jump + ", specialMoraleBrokenEffect=" + specialMoraleBrokenEffect + "]";
	}

	@Override
	public int compareTo(DarkEldarInfantryAbilities other) {
		int result = Integer.compare(this.combatDrugs, other.combatDrugs);		

		if (result == 0) {
			result = Integer.compare(this.infiltration, other.infiltration);

			if (result == 0) {
				result = Integer.compare(this.jump, other.jump);

				if (result == 0) {

					result = Integer.compare(this.specialMoraleBrokenEffect, other.specialMoraleBrokenEffect);


				}
			}
		}

		return result;
	}

}

