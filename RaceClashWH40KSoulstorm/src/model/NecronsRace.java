package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import model.DarkEldarInfantryUnits;
import model.NecronsInfantryUnits;
import model.*;


public class NecronsRace implements Iterable<NecronsInfantryUnits> {

	/** A  Necrons class represents the overall score and a general description of a WH40k race called  Necrons. 
	 * The overall score can be calculated to give a representation of what is the strength of the race..
	 * General description can be outputted in the terminal to give an overview of the strengths and weeknesses that the race has.
	 * @author MateuszWos */

	//fields
	private double overallScore;
	private NecronsRaceDescription newRaceDescription;
	private ArrayList<NecronsInfantryUnits> newInfantryUnits;

	/**
	 * 
	 * A default constructor which initializes the overallScore field and the generalDescription field
	 * By default the overallScore field value is set to 0  and the generalDescription field is set to "The Necrons are a mysterious xenos species of humanoid, robotic skeletal warriors that have lain dormant in their stasis-tombs for more than 60 million Terran years, though they have begun to awaken at last. "
				+ "They are the soulless creations and former servants of the ancient C'tan, the terrible Star Gods of Aeldari myth."
	 * 
	 * @param overallScore the score that the race is going to achieve when launching the apllication
	 * @param newRaceDescription - a general description of the whole race
	 * @param newInfantryUnits - the infantry units that the race has
	 * */

	//default constructor
	public NecronsRace() {


		this.overallScore = 0;
		this.newRaceDescription = new NecronsRaceDescription();
		newInfantryUnits = new ArrayList<>();

	}

	/**
	 * 
	 * A default custom which initializes the overallScore field and the generalDescription field
	 * Creates a  Necrons Race with an overallScore as well as generalDescription
	 * 
	 * @param d the score that the race is going to achieve when launching the apllication
	 * @param newRaceDescription - a general description of the whole race
	 * @param newInfantryUnits - the infantry units that the race has
	 * 
	 * */


	//custom constructor
	public NecronsRace(double d, NecronsRaceDescription newRaceDescription, ArrayList<NecronsInfantryUnits> newInfantryUnits)
	{

		this.overallScore = d;
		this.newRaceDescription = newRaceDescription;
		this.newInfantryUnits = newInfantryUnits;
	}

	/**
	 * Returns the overallScore that the NecronsUnits have. It is based on the properties that the two classes have: NecronsInfantryAbilities and NecronsInfantryNames
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

	/** Adds the given Necrons infantry units to the end of the of Necrons Race.
	 * @param e The infantry units to add */

	public void addNecronsInfantryUnits(NecronsInfantryUnits e) {
		newInfantryUnits.add(e);
	}

	/** Removes the song at index pos from the whole Necrons race.
	 * @param pos The index of the NecronsInfantryUnits to be removed.*/

	public NecronsInfantryUnits removeNecronsInfantryUnits(int pos) {
		return newInfantryUnits.remove(pos);
	}

	/** Gets the NecronsInfantry units at index pos from the whole  Necrons Race.
	 * @param pos The index of the units to get
	 * */

	public NecronsInfantryUnits getNecronsInfantryUnits(int pos) {
		return newInfantryUnits.get(pos);
	}

	/** Returns the number of infantryUnits in the playlist.
	 * @return number of infantry units in the whole  Necrons Race. */

	public int size() {
		return newInfantryUnits.size();
	}

	/** Clears all entries from the NecronsInfantryUnitsClass */

	public void clearNecronsRace() {
		newInfantryUnits.clear();
	}

	/** Checks if the arrayList containing  Necrons infantry units is empty
	 * @return true or false depending on whether the  Necrons infantry units Array list is empty or not. */

	public boolean isNecronsRaceClassEmpty() {
		return newInfantryUnits.isEmpty();
	}

	/** Gets the total score of the NecronsInfantry units with their abilities
	 * @return the toatal score that the Necrons units have*/


	public double getTotalScoreOfInfantryUnitsWithAbilities() {
		//using for-each loop
		double total=0;
		for (NecronsInfantryUnits e : newInfantryUnits) {
			total+=e.getOverallScore();
		}
		return total;

	}

	/**Returns a race description of the whole NecronsRace
	 * @return newRaceDescription, returns a description of the whole race
	 * */

	public NecronsRaceDescription getRaceDescription() {

		return newRaceDescription;
	}

	/**Returns a textual representation of the whole class
	 * @return textual representation of the whole class
	 * */

	@Override
	public String toString() {
		return "NecronsRace [overallScore=" + overallScore + ", newRaceDescription=" + newRaceDescription
				+ ", newInfantryUnits=" + newInfantryUnits + "]";
	}
	
	 /**Returns a string containing the track listings in numbered order
     * @return The track listings in numbered order. */
    public String getAllOfTheUnits() {
    	String s = "";
        
        for (int i = 0; i < newInfantryUnits.size(); i++) {
            s = s + (i+1) + "\t" + newInfantryUnits.get(i).toString() + "\n";
        }
        return s;       
    }
    
    
	/** Returns the number of units for the whole race.
	 * @return Number of units for the whole race. */
	public int numberOfUnits() {
		return newInfantryUnits.size();
	}
	
	/** Clears all entries from the the Necrons Race */
	public void clearAllUnits() {
               newInfantryUnits.clear();
	}
	
	/** Shuffles the units for NecronsRace into random order*/
	public void shufflePlaylist() {
		//The shuffle method is static, which means it can be called
		//on the Collections class without it being instantiated.
		Collections.shuffle(newInfantryUnits);
	}

	/**List iterator, allows for an implementation of a for each loop and a for loop
	 * */

	public Iterator<NecronsInfantryUnits> iterator() {
		return newInfantryUnits.iterator();
	}
	
	public void sortPlaylist() {
		//Collections.sort(list); //or same as
		newInfantryUnits.sort(Comparator.naturalOrder());
	}
	
	public void sortPlaylist(Comparator<NecronsInfantryUnits> comparator) {
		 newInfantryUnits.sort(comparator); 
		}








}
