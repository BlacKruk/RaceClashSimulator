package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.DarkEldarRace;
import model.GameEngine;
import model.NecronsRace;
import model.Races;
import view.DarkEldarRacePane;
import view.NecronsRacePane;
import view.RaceClashRootPane;
import view.ViewPane;
import view.OverviewResultsPane;


public class RaceSkirmishController {

	private RaceClashRootPane view;
	private GameEngine model;
	private Races model1;
	private NecronsRacePane nrp;
	private DarkEldarRacePane derp;
	private OverviewResultsPane orp;
	private ViewPane vp;



	public RaceSkirmishController(RaceClashRootPane view, GameEngine model)
	{
		//initailzie the model and the view
		this.model = model;
		this.view = view;


		nrp = view.getNecronsRacePane();
		derp = view.getDarkEldarRacePane();
		orp = view.getOverviewResultsPane();
		vp = view.getViewPane();



		this.attachEventHandlers();

	}

	private void attachEventHandlers() {

		derp.addDarkEldarRaceHandler(new AddDarkEldarRaceHandler());
		nrp.addNecronsRaceHandler(new AddNecronsInfantryNamesHandler());
		vp.addFightButtonHandler( new FightButtonHandler());



	}

	private class AddDarkEldarRaceHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {

			vp.addDarkEldarRace(derp.getDarkEldarRace());
			
			model.addDarkEldarRace(derp.getDarkEldarRace());
			
			
			


		}
	}

	private class AddNecronsInfantryNamesHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {

			vp.addNecronsRace(nrp.getNecronsRace());
			
			
			model.addNecronsRace(nrp.getNecronsRace());
			
			


		}
	}

	private class FightButtonHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {

			

		


			orp.setResults(model.calculateResults());
			



		}
	}









}
