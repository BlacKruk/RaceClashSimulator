package model;

public class DarkEldarInfantryNames implements Comparable<DarkEldarInfantryNames> {

	//fields
	private int mandrakeSquad;
	private int warriorSquad;
	private int scourgeSquad;
	private int wychSquad;
	private int warpBeastPack;

	//default constructor

	//default constructor
	/** Creates a new instance of DarkEldarInfantryNames,using default mandrake squad, warrior squad, scourge squad,wychSquad and warpBeastPack values. 
	 * The default overallscore is 0. */
	public DarkEldarInfantryNames() {


		mandrakeSquad = 0;
		warriorSquad = 0;
		scourgeSquad = 0;
		wychSquad = 0;
		warpBeastPack = 0;


	}

	//custom constructor
	/** Creates a new instance of DarkEldarInfantryNames, with the given values. 
	 * 
	 * @param mandrakeSuad - a mandrake squad, one of DarkEldarInfantryUnits
	 * @param warriorSquad - a warrior squad, one of DarkEldarInfantryUnits
	 * @param scourgeSquad - a scourge squad, one of DarkEldarInfantryUnits
	 * @param  wychSquad   - a wych squad,one of DarkEldarInfantryUnits
	 * @param warpBeastPack - a warpBeastPack squad,one of DarkEldarInfantryUnits
	 * */


	//custom constructor
	public DarkEldarInfantryNames(int mandrakeSquad, int warriorSquad, int scourgeSquad, int wychSquad, int warpBeastPack) {

		this.mandrakeSquad = mandrakeSquad;
		this.warriorSquad = warriorSquad;
		this.scourgeSquad = scourgeSquad;
		this.wychSquad = wychSquad;
		this.warpBeastPack = warpBeastPack;

	}

	//get and set methods

	/**
	 * Returns a mandrakeSquad
	 * 
	 * @return mandrakeSquad, how many mandrakes squad does the player have
	 * 
	 * */
	
	public int getMandrakeSquad() {

		return mandrakeSquad;

	}
	
	/**
	 * Returns a warriorSquad
	 * 
	 * @return mandrakeSquad, how many warrior squads does the player have
	 * 
	 * */

	public int getWarriorSquad() {

		return warriorSquad;

	}
	
	/**
	 * Returns a scourgeSquad
	 * 
	 * @return scourgeSquad, how many scourge Squads  does the player have
	 * 
	 * */

	public int getScourgeSquad() {

		return scourgeSquad;

	}
	
	/**
	 * Returns a wychSquad
	 * 
	 * @return wychSquads, how many wychSquads  does the player have
	 * 
	 * */

	public int getWychSquad() {

		return wychSquad;

	}
	
	/**
	 * Returns a warpBeastPackSquad
	 * 
	 * @return warpBeastPack, how many warpBeastPacks does the player have
	 * 
	 * */

	public int getWarpBeastPack() {

		return warpBeastPack;

	}

	//set methods

	
	/**
	 * Sets the amount MandrakeSquads , to a value chosen by the user
	 * 
	 * @param mandrakeSquad, the amount of mandrake squads to be assigned to the "mandrakeSquad" field
	 * 
	 * */
	
	public void setMandrakeSquad(int mandrakeSquad) {

		this.mandrakeSquad = mandrakeSquad;

	}
	
	/**
	 * Sets the amount WarriorSquads , to a value chosen by the user
	 * 
	 * @param WarriorSquad, the amount of mandrake squads to be assigned to the "mandrakeSquad" field
	 * 
	 * */


	public void setWarriorSquad(int warriorSquad) {

		this.warriorSquad = warriorSquad;

	}
	
	/**
	 * Sets the amount ScourgeSquads , to a value chosen by the user
	 * 
	 * @param scourgeSquads, the amount of mandrake squads to be assigned to the "mandrakeSquad" field
	 * 
	 * */

	public void setScourgeSquad(int scourgeSquad) {

		this.scourgeSquad = scourgeSquad ;

	}
	
	/**
	 * Sets the amount of WychSquads , to a value chosen by the user
	 * 
	 * @param wychSquads, the amount of wych squads to be assigned to the "wychSquad" field
	 * 
	 * */

	public void setWychSquad(int wychSquad) {

		this.wychSquad = wychSquad;

	}
	
	/**
	 * Sets the amount of WarpBeastPacks , to a value chosen by the user
	 * 
	 * @param warpBeastPack, the amount of warpBeastPacks to be assigned to the "warpBeastPack" field
	 * 
	 * */
	
	

	public void setWarpBeastPack(int warpBeastPack) {

		this.warpBeastPack = warpBeastPack;

	}

	
	/** Returns a textual representation of the DarkEldarInfantryUnitsClass.
	 * 
	 * @return a textual representation of the whole class.
	 */


	@Override
	public String toString() {
		return "DarkEldarInfantryNames [mandrakeSquad=" + mandrakeSquad + ", warriorSquad=" + warriorSquad
				+ ", scourgeSquad=" + scourgeSquad + ", wychSquad=" + wychSquad + ", warpBeastPack=" + warpBeastPack
				+ "]";
	}
	
	
	@Override
	public int compareTo(DarkEldarInfantryNames other) {
		int result = Integer.compare(this.mandrakeSquad, other.mandrakeSquad);		
		
		if (result == 0) {
			result = Integer.compare(this.scourgeSquad, other.scourgeSquad);

			if (result == 0) {
				result = Integer.compare(this.warpBeastPack, other.warpBeastPack);
				
				if (result == 0) {
				
					result = Integer.compare(this.warriorSquad, other.warriorSquad);
					
					if (result == 0) {
						result = Integer.compare(this.wychSquad, other.wychSquad);
				}				
				}
			}
		}

		return result;
	}

	












}
