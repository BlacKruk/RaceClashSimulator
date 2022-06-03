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
	 * The default values of each of the fields mentioned above are equal to 10 */
	public NecronsInfantryAbilities () {


		dimensionalCorridor = 0;
		auraOfFear = 0;
		necrodermisRepair = 0;



	}

	/** Creates a new instance of DarkEldarInfantryNames, with the given values. 
	 * 
	 * @param dimensionalCorridor - additional ability, can only be assigned to a Neccron Warrior squad
	 * @param auraOfFear - additional ability, can only be assigned to a flayedOnesSquad
	 * @param necromedisRepair -additional ability, can only be assigned to Neccron Warrior Squad, flayedOnes Squad, Wraith Squad and Immortals Squad
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
	 * Returns the dimensionalCorridor ability that the NecronsUnits have. It can only be assigned to a NecronWarrior squad	 * 
	 * @return dimensionalCorridor
	 * 
	 * */

	public void assignDimensionalCorridorAbility() {

		this.dimensionalCorridor = 10;

	}



	/**
	 * Returns the auraOfFear ability that the NecronsUnits have. It can only be assigned to a flayedOnes squad	 * 
	 * @return auraOfFear
	 * 
	 * */

	public void assignAuraOfFearAbility() {

		this.auraOfFear = 10;
	}

	/**
	 * Returns the NecrodermisRepair ability that the NecronsUnits have. It can be assigned to all four of the squads* 
	 * @return NecrodermisRepairAbility
	 * 
	 * */

	public void assignNecrodermisRepairAbility() {

		this.necrodermisRepair = 10;


	}
	
	public int getDimensionalCorridorAbility()
	{
	
		return dimensionalCorridor;
	}
	
	public int getAuraOfFearAbility()
	{
	
		return auraOfFear;
	}
	
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



	/*
	@Override
	public int getOverallScore() {


		return  super.getNecronWarriorSquad() + necrodermisRepair + dimensionalCorridor + super.getFlayedOnesSquad() + auraOfFear + necrodermisRepair + super.getImmortalsSquad() + necrodermisRepair + super.getWraithSquad() + necrodermisRepair ;
	}
	 */
	
	
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


