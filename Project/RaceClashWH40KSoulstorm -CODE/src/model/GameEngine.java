package model;

import java.util.ArrayList;
import java.util.Iterator;

/** A simple game engine that holds two players (a human and opponent)
 * and allows a game to be played by rolling both of their dice.
 * 
 * Furthermore, the winning player can be retrieved and an overview of
 * the results generated.
 * 
 * @author la
 */
public class GameEngine {

	private ArrayList<DarkEldarRace> darkEldarRace;
	private ArrayList<NecronsRace> necronsRace;
	private double overallScoreNecrons;
	private double overallScoreDarkEldar;

	public GameEngine() {
		darkEldarRace = new ArrayList<>();
		necronsRace = new ArrayList<>();
	}

	public GameEngine(ArrayList<DarkEldarRace> darkEldarRace, ArrayList<NecronsRace> necronsRace) {
		this.darkEldarRace = darkEldarRace;
		this.necronsRace = necronsRace ;
	}



	public void addDarkEldarRace(DarkEldarRace darkEldarRace1) {

		this.darkEldarRace.add(darkEldarRace1);
	}

	public void addNecronsRace(NecronsRace necronsRace) {

		this.necronsRace.add(necronsRace);
	}

	public double getOverallScoreDarkEldar() {

		return overallScoreDarkEldar;



	}

	public double getOverallScoreNecrons() {

		return overallScoreNecrons;



	}

	public void setTheOverallScoreOfDarkEldarRaceToZero() {

		overallScoreDarkEldar = 0;
	}

	public void setTheOverallScoreOfNecronsToZero() {

		overallScoreNecrons = 0;
	}



	public void setOverAllScoreNecrons() {

		double total=0;
		for (NecronsRace e : necronsRace) {
			total+=e.getTotalScoreOfInfantryUnitsWithAbilities();
		}

		this.overallScoreNecrons = total;
		
		necronsRace.clear();



	}



	public void setOverAllScoreDarkEldar() {

		//using for-each loop
		double total=0;
		for (DarkEldarRace e : darkEldarRace) {
			total+=e.getTotalScoreOfInfantryUnitsWithAbilities();
		}
		this.overallScoreDarkEldar =total;
		
		darkEldarRace.clear();
	}


	public String calculateResults() {
		String results = "Game result overview\n================\n";

		if (getOverallScoreDarkEldar()> getOverallScoreNecrons()) {
			results+= "\n Dark Eldar Win!";
			results+= "\n================";
			results+= "\n With the last major threat removed the Dark Eldar are now free to roam through the entire galaxy!";
		} else if (getOverallScoreNecrons() > getOverallScoreDarkEldar()) {
			results+= "\nNecrons win!";
			results+= "\n================";
			results+= "\n With the last major threat removed the Necrons are now free to roam through the entire galaxy!";
		} else {
			results+= "\nGame drawn! :s";
		}

		results+= "\n================";
		results+= "\nDark Eldar Combined Score " + getOverallScoreDarkEldar();
		results+= "\n================";
		results+= "\nNecrons Cobined Score" + getOverallScoreNecrons();

		return results;
	}

	public void forEach(Object object) {
		// TODO Auto-generated method stub

	}

	public Iterator<DarkEldarRace> DarkEldarIterator() {
		return darkEldarRace.iterator();
	}

	public Iterator<NecronsRace> NecronsIterator() {
		return necronsRace.iterator();
	}

}
