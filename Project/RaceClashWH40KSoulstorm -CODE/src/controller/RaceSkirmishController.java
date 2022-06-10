package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.DarkEldarRace;
import model.GameEngine;
import model.NecronsRace;
import view.DarkEldarRacePane;
import view.NecronsRacePane;
import view.RaceClashRootPane;
import view.RaceMenuBar;
import view.ViewPane;
import view.OverviewResultsPane;


public class RaceSkirmishController {

	private RaceClashRootPane view;
	private GameEngine model;
	private NecronsRacePane nrp;
	private DarkEldarRacePane derp;
	private OverviewResultsPane orp;
	private ViewPane vp;
	private RaceMenuBar mb;



	public RaceSkirmishController(RaceClashRootPane view, GameEngine model)
	{
		//initailzie the model and the view
		this.model = model;
		this.view = view;


		nrp = view.getNecronsRacePane();
		derp = view.getDarkEldarRacePane();
		orp = view.getOverviewResultsPane();
		vp = view.getViewPane();
		mb = view.getMenuBar();



		this.attachEventHandlers();

	}

	private void attachEventHandlers() {

		derp.addDarkEldarRaceHandler(new AddDarkEldarRaceHandler());
		nrp.addNecronsRaceHandler(new AddNecronsInfantryNamesHandler());
		vp.addFightButtonHandler( new FightButtonHandler());
		mb.addAboutHandler(new AboutHandler());
		mb.addExitHandler(e -> System.exit(0));
		orp.addClearResultsHandler(new ClearResultsHandler());

	}

	private class AddDarkEldarRaceHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {

			vp.addDarkEldarRace(derp.getDarkEldarRace());

			model.addDarkEldarRace(derp.getDarkEldarRace());

			derp.clear();

		}
	}

	private class AddNecronsInfantryNamesHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {

			vp.addNecronsRace(nrp.getNecronsRace());


			model.addNecronsRace(nrp.getNecronsRace());

			nrp.clear();
		}
	}

	private class FightButtonHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {
			
			model.setOverAllScoreDarkEldar();
			model.setOverAllScoreNecrons();

			orp.setResults(model.calculateResults());
			
			

			vp.clearDarkEldarRace();
			vp.clearNecronsRace();
			vp.clearSelectionDarkEldarRace();
			vp.clearSelectionNecronsRace();


			if (model.getOverallScoreDarkEldar() > model.getOverallScoreNecrons()) {
				orp.setColor("purple");
			} else if(model.getOverallScoreDarkEldar() < model.getOverallScoreNecrons()){
				orp.setColor("green");
			}
			else
			{orp.setColor("black");}
		} 
	}
	
	private class ClearResultsHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {

			orp.clearResults();
			orp.setColor("white");
			model.setTheOverallScoreOfDarkEldarRaceToZero();
			model.setTheOverallScoreOfNecronsToZero();
		} 
	}

	private class AboutHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent e) {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("About Handler");
			alert.setHeaderText("The app which you have created is:");
			alert.setContentText("Race Clash App: Based on Wh40k Soultstorm");

			alert.showAndWait();         


		}
	}


}
