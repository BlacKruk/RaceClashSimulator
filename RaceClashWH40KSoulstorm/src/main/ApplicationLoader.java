
package main;

import controller.RaceSkirmishController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.GameEngine;
import view.RaceClashRootPane;



/* Loads the application and creates an instance of the model, view and controller */
public class ApplicationLoader extends Application {

	private RaceClashRootPane view;
	
	public void init() {
		
		view = new RaceClashRootPane();
		GameEngine model = new GameEngine();
		new RaceSkirmishController(view, model);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setMinWidth(510);
		stage.setMinHeight(260);
		stage.setTitle("Journey Planner MVC2");
		stage.setScene(new Scene(view));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
