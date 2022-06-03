package view;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import model.DarkEldarInfantryAbilities;
import model.DarkEldarInfantryNames;
import model.GameEngine;
import model.NecronsInfantryAbilities;
import model.NecronsInfantryNames;
import model.NecronsInfantryUnits;
import model.NecronsRace;
import model.NecronsRaceDescription;


public class NecronsRacePane extends GridPane {

	private Label necronsInfantryAbilities,necronsInfantryLbl,necronWarriorsSquadLbl,flayedOnesSquadLbl, ImmortalsLbl, WraithsLbl;
	private TextField necronWarriorsTxt,flayedOnesTxt, immortalsTxt, wraithsTxt;
	private CheckBox dimensionalCorridor, auraOfFear,necrodermisRepair;
	private Button submitBtn;

	public NecronsRacePane()
	{

		this.setPadding(new Insets(20, 20, 20, 20));
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);


		this.setPadding(new Insets(20, 20, 20, 20));
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);


		necronsInfantryLbl = new Label("NECRONS INFANTRY");


		necronWarriorsSquadLbl = new Label("Necron Warriors");
		necronWarriorsTxt = new TextField();

		dimensionalCorridor = new CheckBox("Special Ability: Dimensional Corridor");
		necrodermisRepair = new CheckBox("Special Ability: NecrodermisRepair");


		flayedOnesSquadLbl = new Label("Flayed Ones Squads");
		flayedOnesTxt = new TextField();

		auraOfFear = new CheckBox("Special Ability: Aura Of Fear");

		necronsInfantryAbilities = new Label("Necrons Infantry Abilities");

		ImmortalsLbl = new Label("Immortals Squads");
		immortalsTxt = new TextField();

		WraithsLbl = new Label("Wych Squads");
		wraithsTxt = new TextField();

		submitBtn = new Button("Submit");

		this.add(necronsInfantryLbl, 0, 0);

		this.add(necronWarriorsSquadLbl, 0, 1);
		this.add(necronWarriorsTxt, 1, 1);

		this.add(flayedOnesSquadLbl, 0, 2);
		this.add(flayedOnesTxt, 1, 2);


		this.add(WraithsLbl, 0, 3);
		this.add(wraithsTxt, 1, 3);


		this.add(ImmortalsLbl, 0, 4);
		this.add(immortalsTxt, 1, 4);

		this.add(necronsInfantryAbilities, 0, 5);

		this.add(dimensionalCorridor, 0, 6);
		this.add(auraOfFear, 1, 6);
		this.add(necrodermisRepair, 2, 6);

		this.add(submitBtn, 0, 7);



	}

	//returns a name object based on the input fields
	public NecronsRace getNecronsRace() {
		String necronWarriorsString =  necronWarriorsTxt.getText();
		int necronWarriors = Integer.parseInt(necronWarriorsString);

		String flayedOnesString = flayedOnesTxt.getText();
		int flayedOnes = Integer.parseInt(flayedOnesString);

		String immortalsString = immortalsTxt.getText();
		int immortals = Integer.parseInt(immortalsString);

		String wraithsString = wraithsTxt.getText();
		int wraiths   = Integer.parseInt(wraithsString);

		
        NecronsInfantryAbilities abilities = new NecronsInfantryAbilities();
		
		if(dimensionalCorridor.isSelected() == true) {abilities.assignDimensionalCorridorAbility();;};
		if(auraOfFear.isSelected() == true) {abilities.assignAuraOfFearAbility();;};
		if(necrodermisRepair.isSelected() == true) {abilities.assignNecrodermisRepairAbility();;};
		
		NecronsInfantryUnits units = new NecronsInfantryUnits(abilities, new NecronsInfantryNames(necronWarriors, flayedOnes,immortals,wraiths),0);
		NecronsRaceDescription description = new NecronsRaceDescription();
		ArrayList<NecronsInfantryUnits> arrayList = new ArrayList<NecronsInfantryUnits>();
		arrayList.add(units);
		
		
		NecronsRace newRace = new NecronsRace(0,description,arrayList);

		return new NecronsRace(newRace.getTotalScoreOfInfantryUnitsWithAbilities(),description,arrayList);



	}
	
	
	//returns a name object based on the input fields
		public String getOverallScore() {
			String necronWarriorsString =  necronWarriorsTxt.getText();
			int necronWarriors = Integer.parseInt(necronWarriorsString);

			String flayedOnesString = flayedOnesTxt.getText();
			int flayedOnes = Integer.parseInt(flayedOnesString);

			String immortalsString = immortalsTxt.getText();
			int immortals = Integer.parseInt(immortalsString);

			String wraithsString = wraithsTxt.getText();
			int wraiths   = Integer.parseInt(wraithsString);

			
	        NecronsInfantryAbilities abilities = new NecronsInfantryAbilities();
			
			if(dimensionalCorridor.isSelected() == true) {abilities.assignDimensionalCorridorAbility();;};
			if(auraOfFear.isSelected() == true) {abilities.assignAuraOfFearAbility();;};
			if(necrodermisRepair.isSelected() == true) {abilities.assignNecrodermisRepairAbility();;};
			
			NecronsInfantryUnits units = new NecronsInfantryUnits(abilities, new NecronsInfantryNames(necronWarriors, flayedOnes,immortals,wraiths),0);
			NecronsRaceDescription description = new NecronsRaceDescription();
			ArrayList<NecronsInfantryUnits> arrayList = new ArrayList<NecronsInfantryUnits>();
			arrayList.add(units);
			
			
			NecronsRace newRace = new NecronsRace(0,description,arrayList);

			
			String newString = String.valueOf(newRace.getTotalScoreOfInfantryUnitsWithAbilities());
			return newString;


		}

	public void addNecronsRaceHandler(EventHandler<ActionEvent> handler) {
		submitBtn.setOnAction(handler);
	}




}
