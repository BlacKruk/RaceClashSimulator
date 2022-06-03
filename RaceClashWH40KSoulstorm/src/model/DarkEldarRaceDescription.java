package model;

public class DarkEldarRaceDescription {

	//fields
	private String generalDescription;
	private String capital;
	private String mainStrengths;
	private String mainWeakness;

	/** Creates a new instance of DarkEldarRaceDEscription,using default generalDescription, capital, mainStrengths, mainWeakness values. 
	 * The default: generalDescription is equal to "The Drukhari, also known to outsiders as the Dark Eldar, are a forsaken and corrupt Aeldari kindred, the sadistic, malicious counterparts of the Asuryani. Like their cousins of the craftworlds, the Drukhari are an ancient and highly advanced alien race of fey humanoids.  ";
		capital is equal to "Commorragh ";
		mainStrengths is equal to "speed, technology";
		mainWeakness is equal to "few in numbers"; */

	//default constructor
	public DarkEldarRaceDescription() 
	{

		generalDescription = "The Drukhari, also known to outsiders as the Dark Eldar, are a forsaken and corrupt Aeldari kindred, the sadistic, malicious counterparts of the Asuryani. Like their cousins of the craftworlds, the Drukhari are an ancient and highly advanced alien race of fey humanoids.  ";
		capital = "Commorragh ";
		mainStrengths = "speed, technology";
		mainWeakness = "few in numbers";

	}


	/**
	 * Returns the generalDescription
	 * 
	 * @return return the generalDescription of the whole race
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
	 * Returns the Capital
	 * 
	 * @return mainWeakness the main wekaness that the race has
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
		return "DarkEldarRaceDescription [generalDescription=" + generalDescription + ", capital=" + capital
				+ ", mainStrengths=" + mainStrengths + ", mainWeakness=" + mainWeakness + "]";
	}
	
	







}

