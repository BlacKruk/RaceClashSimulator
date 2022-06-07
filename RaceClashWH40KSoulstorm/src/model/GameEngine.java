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



	public double getOverAllScoreNecrons() {

		double total=0;
		for (NecronsRace e : necronsRace) {
			total+=e.getTotalScoreOfInfantryUnitsWithAbilities();
		}
		return total;

	}

	public double getOverAllScoreDarkEldar() {

		//using for-each loop
		double total=0;
		for (DarkEldarRace e : darkEldarRace) {
			total+=e.getTotalScoreOfInfantryUnitsWithAbilities();
		}
		return total;
	}


	public String calculateResults() {
		String results = "Game result overview\n================\n";

		if (getOverAllScoreDarkEldar()> getOverAllScoreNecrons()) {
			results+= "\n Dark Eldar Win!";
			results+= "\n================";
			results+= "\n With the last major threat removed the Dark Eldar are now free to roam through the entire galaxy!";
		} else if (getOverAllScoreNecrons() > getOverAllScoreDarkEldar()) {
			results+= "\nNecrons win!";
			results+= "\n================";
			results+= "\n With the last major threat removed the Necrons are now free to roam through the entire galaxy!";
		} else {
			results+= "\nGame drawn! :s";
		}
		
		results+= "\n================";
		results+= "\nDark Eldar Combined Score " + getOverAllScoreDarkEldar();
		results+= "\n================";
		results+= "\nNecrons Cobined Score" + getOverAllScoreNecrons();

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
