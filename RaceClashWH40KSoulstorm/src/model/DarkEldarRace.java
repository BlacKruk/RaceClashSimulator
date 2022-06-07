package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import model.DarkEldarInfantryUnits;




public class DarkEldarRace implements Iterable<DarkEldarInfantryUnits> {

	/** A  DarkEldar class represents the overall score and a general description of a WH40k race called  DarkEldar. 
	 * The overall score can be calculated to give a representation of what is the strength of the race..
	 * General description can be outputted in the terminal to give an overview of the strengths and weaknesses that the race has.
	 * @author MateuszWos */

	//fields
	private double overallScore;
	private DarkEldarRaceDescription newRaceDescription;
	private ArrayList<DarkEldarInfantryUnits> newInfantryUnits;

	/**
	 * 
	 * A default constructor which initializes the overallScore field and the generalDescription field
	 * By default the overallScore field value is set to 0  and the generalDescription field is set to "The DarkEldar are a mysterious xenos species of humanoid, robotic skeletal warriors that have lain dormant in their stasis-tombs for more than 60 million Terran years, though they have begun to awaken at last. "
				+ "They are the soulless creations and former servants of the ancient C'tan, the terrible Star Gods of Aeldari myth."
	 * 
	 * @param overallScore the score that the race is going to achieve when launching the apllication
	 * @param newRaceDescription - a general description of the whole race
	 * @param newInfantryUnits - the infantry units that the race has
	 * */

	//default constructor
	public DarkEldarRace() {


		this.overallScore = 0;
		this.newRaceDescription = new DarkEldarRaceDescription();
		newInfantryUnits = new ArrayList<>();

	}

	/**
	 * 
	 * A default custom which initializes the overallScore field and the generalDescription field
	 * Creates a  DarkEldar Race with an overallScore as well as generalDescription
	 * 
	 * @param d the score that the race is going to achieve when launching the apllication
	 * @param newRaceDescription - a general description of the whole race
	 * @param newInfantryUnits - the infantry units that the race has
	 * 
	 * */


	//custom constructor
	public DarkEldarRace(double d, DarkEldarRaceDescription newRaceDescription, ArrayList<DarkEldarInfantryUnits> newInfantryUnits)
	{

		this.overallScore = d;
		this.newRaceDescription = newRaceDescription;
		this.newInfantryUnits = newInfantryUnits;
	}

	/**
	 * Returns the overallScore that the DarkEldarUnits have. It is based on the properties that the two classes have: DarkEldarInfantryAbilities and DarkEldarInfantryNames
	 * 
	 * @return the overallScore 
	 * 
	 * */

	//Methods
	public double getOverallScore() {
		return overallScore;
	}

	/**
	 * Sets the overallScore , to a value chosen by the user
	 * 
	 * @param overallScore, overallScore of the whole race	 * 
	 * */
	
	public void setOverallScore(int overallScore) {
		this.overallScore = overallScore;
	}

	/** Adds the given DarkEldar infantry units to the end of the of DarkEldar Race.
	 * @param e The infantry units to add */

	public void addDarkEldarInfantryUnits(DarkEldarInfantryUnits e) {
		newInfantryUnits.add(e);
	}

	/** Removes the infantryUnits at index pos from the whole DarkEldar race.
	 * @param pos The index of the DarkEldarInfantryUnits to be removed.*/

	public DarkEldarInfantryUnits removeDarkEldarInfantryUnits(int pos) {
		return newInfantryUnits.remove(pos);
	}

	/** Gets the DarkEldarInfantry units at index pos from the whole  DarkEldar Race.
	 * @param pos The index of the units to get
	 * */

	public DarkEldarInfantryUnits getDarkEldarInfantryUnits(int pos) {
		return newInfantryUnits.get(pos);
	}

	/** Returns the number of infantryUnits in the in the "DarkEldarInfantryUnits" ArrayList
	 * @return number of infantry units in the whole  DarkEldar Race. */

	public int size() {
		return newInfantryUnits.size();
	}

	/** Clears all entries from the DarkEldarInfantryUnitsClass */

	public void clearDarkEldarRace() {
		newInfantryUnits.clear();
	}

	/** Checks if the arrayList containing  DarkEldar infantry units is empty
	 * @return true or false depending on whether the  DarkEldar infantry units Array list is empty or not. */

	public boolean isDarkEldarRaceClassEmpty() {
		return newInfantryUnits.isEmpty();
	}

	/** Gets the total score of the DarkEldarInfantry units with their abilities
	 * @return the total score that the DarkEldar units have*/

	public double getTotalScoreOfInfantryUnitsWithAbilities() {
		//using for-each loop
		double total=0;
		for (DarkEldarInfantryUnits e : newInfantryUnits) {
			total+=e.getOverallScore();
		}
		return total;

	}

	/**Returns a race description of the whole DarkEldarRace
	 * @return newRaceDescription, returns a description of the whole race
	 * */

	public DarkEldarRaceDescription getRaceDescription() {

		return newRaceDescription;
	}

	/**Returns a textual representation of the whole class
	 * @return textual representation of the whole class
	 * */

	@Override
	public String toString() {
		return "DarkEldarRace [overallScore=" + overallScore + ", newRaceDescription=" + newRaceDescription
				+ ", newInfantryUnits=" + newInfantryUnits + "]";
	}
	
	 /**Returns a string containing the units in numbered order
     * @return The units in numbered order. */
    public String getAllOfTheUnits() {
    	String s = "";
        
        for (int i = 0; i < newInfantryUnits.size(); i++) {
            s = s + (i+1) + "\t" + newInfantryUnits.get(i).toString() + "\n";
        }
        return s;       
    }
    
	
	/** Shuffles the units for DarkEldarRace into random order*/
	public void shuffleUnits() {
		//The shuffle method is static, which means it can be called
		//on the Collections class without it being instantiated.
		Collections.shuffle(newInfantryUnits);
	}

	/**List iterator, allows for an implementation of a for each loop and a for loop
	 * */

	public Iterator<DarkEldarInfantryUnits> iterator() {
		return newInfantryUnits.iterator();
	}
	
	/**List comparator, allows the units to be sorted in naturalOrder
	 * */
	
	public void sortUnits() {
		//Collections.sort(list); //or same as
		newInfantryUnits.sort(Comparator.naturalOrder());
	}
	
	/**List comparator, allows the units to be sorted, with the use of a comparator chosen by the user
	 * */
	
	public void sortUnits(Comparator<DarkEldarInfantryUnits> comparator) {
		 newInfantryUnits.sort(comparator); 
		}
}
