package model;

public class NecronsRaceDescription {

	//fields
	private String generalDescription;
	private String capital;
	private String mainStrengths;
	private String mainWeakness;


	/** Creates a new instance of DarkEldarRaceDEscription,using default generalDescription, capital, mainStrengths, mainWeakness values. 
	 * "The Necrons are a mysterious xenos species of humanoid, robotic skeletal warriors that have lain dormant in their stasis-tombs for more than 60 million Terran years, 
	 * though they have begun to awaken at last. "
		+ "They are the soulless creations and former servants of the ancient C'tan, the terrible Star Gods of Aeldari myth. 

		capital is equal to "Hollow sun";
		mainStrengths is equal to "resilience,strength";
		mainWeakness is equal to "speed"; */


	//default constructor
	public NecronsRaceDescription() 
	{

		generalDescription = "The Necrons are a mysterious xenos species of humanoid, robotic skeletal warriors that have lain dormant in their"
				+ " stasis-tombs for more than 60 million Terran years, though they have begun to awaken at last. ";
		capital = "Hollow Sun";
		mainStrengths = "resilience, strength";
		mainWeakness = "speed";

	}


	/**
	 * Returns the generalDescription
	 * 
	 * @return  the generalDescription of the whole race
	 * 
	 * */

	//get and set methods
	public String getRaceDescription() {


		return generalDescription;
	}

	/**
	 * Returns the Capital
	 * 
	 * @return return the capital that the race has
	 * 
	 * */

	public String getCapital() {


		return capital;
	}

	/**
	 * Returns the mainStrengths
	 * 
	 * @return returns the main strengths that the race has
	 * 
	 * */

	public String getMainStrengths() {


		return mainStrengths;
	}

	/**
	 * Returns the mainWeakness
	 * 
	 * @return return the main weakness that the race has
	 * 
	 * */

	public String getMainWeakness() {


		return mainWeakness;
	}

	/**
	 * Returns a textual representation of the whole class
	 * 
	 * @return return a textual representation of the whole class
	 * 
	 * */


	@Override
	public String toString() {
		return "NecronsRaceDescription [generalDescription=" + generalDescription + ", capital=" + capital
				+ ", mainStrengths=" + mainStrengths + ", mainWeakness=" + mainWeakness + "]";
	}

}

