package model;

import model.DarkEldarInfantryAbilities;
import model.DarkEldarInfantryNames;

public class NecronsInfantryAbilities implements Comparable<NecronsInfantryAbilities>   {


	//fields
	private int dimensionalCorridor;
	private int auraOfFear;
	private int necrodermisRepair;


	//default constructor

	/** Creates a new instance of NecronsInfantryNames,using default dimensionalCorridor, auraOfFear, necrodermisRepair values. 
	 * The default values of each of the fields mentioned above are equal to 0 */
	public NecronsInfantryAbilities () {

		dimensionalCorridor = 0;
		auraOfFear = 0;
		necrodermisRepair = 0;
	}

	/** Creates a new instance of DarkEldarInfantryNames, with the given values. 
	 * 
	 * @param dimensionalCorridor - additional ability, can only be assigned to a NeccronWarriorSquad
	 * @param auraOfFear - additional ability, can only be assigned to a flayedOnesSquad
	 * @param necromedisRepair -additional ability, can only be assigned to NeccronWarriorSquad, flayedOnesSquad, WraithSquad and ImmortalsSquad
	 * */

	//custom constructor
	public NecronsInfantryAbilities(int dimensionalCorridor, int auraOfFear, int necrodermisRepair) 
	{


		this.dimensionalCorridor = dimensionalCorridor;
		this.auraOfFear = auraOfFear;
		this.necrodermisRepair = necrodermisRepair;

	}

	//get and set methods

	/**
	 * Sets the dimensionalCorrridor value to 10
	 * 
	 * @param dimensionalCorridor, sets the dimensionalCorridor value to 10
	 * 
	 * */

	public void assignDimensionalCorridorAbility() {

		this.dimensionalCorridor = 10;

	}



	/**
	 * Sets the auraOfFear value to 10
	 * 
	 * @param auraOfFear, sets the auraOfFear value to 10
	 * 
	 * */

	public void assignAuraOfFearAbility() {

		this.auraOfFear = 10;
	}

	
	/**
	 * Sets the necrodermisRepair value to 10
	 * 
	 * @param necrodermisRepair, sets the infiltration necromerdisRepairValue to 10
	 * 
	 * */
	
	public void assignNecrodermisRepairAbility() {

		this.necrodermisRepair = 10;


	}
	
	/**
	 * Returns the Dimensional Corridor ability that the NecronsUnits have. It can only be assigned to NecronWarriors squad 
	 * @return dimensionalCorridor the value assigned to dimensionalCorridorAbility
	 * 
	 * */
	
	public int getDimensionalCorridorAbility()
	{
	
		return dimensionalCorridor;
	}
	
	/**
	 * Returns the AuraOfFear ability that the NecronsUnits have. It can only be assigned to flayedOnes squad
	 * @return auraOfFear, the value assigned to auraOfFear parameter
	 * 
	 * */
	
	public int getAuraOfFearAbility()
	{
	
		return auraOfFear;
	}
	
	/**
	 * Returns the NecrodermisRepair ability that the NecronsUnits have. It can be assigned to all four of the squads* 
	 * @return NecrodermisRepairAbility
	 * 
	 * */

	public int getNecromedisRepairAbility()
	{
	
		return auraOfFear;
	}

	/**
	 *Returns a textual representation of the whole class
	 * @return a textual representation of the whole class
	 * 
	 * */

	@Override
	public String toString() {
		return "NecronsInfantryAbilities [dimensionalCorridor=" + dimensionalCorridor + ", auraOfFear=" + auraOfFear
				+ ", necrodermisRepair=" + necrodermisRepair + "]";
	}
	
	/**
	 *Compare method
	 * @return allows the abilities to be sorted in an order chosen by the user
	 * 
	 * */
	
	@Override
	public int compareTo(NecronsInfantryAbilities other) {
		int result = Integer.compare(this.auraOfFear, other.auraOfFear);		
		
		if (result == 0) {
			result = Integer.compare(this.dimensionalCorridor, other.dimensionalCorridor);

			if (result == 0) {
				result = Integer.compare(this.necrodermisRepair, other.necrodermisRepair);	
			}
		}

		return result;
	}


}


