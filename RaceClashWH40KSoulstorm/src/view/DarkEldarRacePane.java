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
import model.DarkEldarInfantryUnits;
import model.DarkEldarRace;
import model.DarkEldarRaceDescription;
import model.GameEngine;
import model.NecronsInfantryAbilities;
import model.NecronsInfantryNames;
import model.NecronsInfantryUnits;
import model.NecronsRace;
import model.NecronsRaceDescription;
import model.Races;

public class DarkEldarRacePane extends GridPane {

	private Label darkEldarAbilitiesLbl,darkEldarInfantryLbl,mandrakeSquadLbl,warriorSquadLbl, scourgeSquadLbl, wychSquadLbl, warpBeastPackLbl;
	private TextField darkEldarInfantryTxt,mandrakeSquadTxt,warriorSquadTxt, scourgeSquadTxt, wychSquadTxt, warpBeastPackTxt;
	private Button playButton;
	private GameEngine newEngine;
	private DarkEldarRacePane newBox;
	private CheckBox combatDrugs, infiltration, jump,specialMoraleBrokenEffect;
	private Button submitBtn;

	private int mandrakeSquad;
	private int warriorSquad;
	private int scourgeSquad;
	private int wychSquad;
	private int warpBeastPack;



	public DarkEldarRacePane()
	{

		this.setPadding(new Insets(20, 20, 20, 20));
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);

		darkEldarInfantryLbl = new Label("DARK ELDAR INFANTRY");


		mandrakeSquadLbl = new Label("Mandrake Squads");
		mandrakeSquadTxt = new TextField();


		warriorSquadLbl = new Label("Warrior Squads");
		warriorSquadTxt = new TextField();

		scourgeSquadLbl = new Label("Scourge Squads");
		scourgeSquadTxt = new TextField();

		wychSquadLbl = new Label("Wych Squads");
		wychSquadTxt = new TextField();

		warpBeastPackLbl = new Label("Wych Squads");
		warpBeastPackTxt = new TextField();

		darkEldarAbilitiesLbl = new Label("Dark Eldar Infantry Abilities");

		combatDrugs = new CheckBox("Combat drugs");
		infiltration = new CheckBox("Infiltration");
		jump = new CheckBox("Jump");
		specialMoraleBrokenEffect = new CheckBox("Special morale broken effect");

		submitBtn = new Button("Submit");



		this.add(darkEldarInfantryLbl, 0, 0);

		this.add(mandrakeSquadLbl, 0, 1);
		this.add(mandrakeSquadTxt, 1, 1);

		this.add(warriorSquadLbl, 0, 2);
		this.add(warriorSquadTxt, 1, 2);

		this.add(wychSquadLbl, 0, 3);
		this.add(wychSquadTxt, 1, 3);

		this.add(scourgeSquadLbl, 0, 4);
		this.add(scourgeSquadTxt, 1, 4);

		this.add(warpBeastPackLbl, 0, 5);
		this.add(warpBeastPackTxt, 1, 5);

		this.add(darkEldarAbilitiesLbl, 0, 6);

		this.add(combatDrugs, 0, 7);
		this.add(infiltration, 1, 7);
		this.add(specialMoraleBrokenEffect, 2, 7);
		this.add(jump, 3, 7);

		this.add(submitBtn, 0, 8);

	}


	//returns a name object based on the input fields
	public DarkEldarRace getDarkEldarRace() {
		
		String warriorSquadString =  warriorSquadTxt.getText();
		int warriorSquad = Integer.parseInt(warriorSquadString);

		String scourgeSquadString = scourgeSquadTxt.getText();
		int scourgeSquad = Integer.parseInt(scourgeSquadString);

		String mandrakeSquadString = mandrakeSquadTxt.getText();
		int mandrakeSquad = Integer.parseInt(mandrakeSquadString);

		String wychSquadString = wychSquadTxt.getText();
		int wychSquad   = Integer.parseInt(wychSquadString);
		
		String warpBeastPackString = warpBeastPackTxt.getText();
		int warpBeastPack   = Integer.parseInt(warpBeastPackString);
		
		
		DarkEldarInfantryAbilities abilities = new DarkEldarInfantryAbilities();
		
		if(combatDrugs.isSelected() == true) {abilities.assignCombatDrugsAbility();};
		if(infiltration.isSelected() == true) {abilities.assignInfiltrationAbility();};
		if(jump.isSelected() == true) {abilities.assignJumpAbility();};
		if(specialMoraleBrokenEffect.isSelected() == true) {abilities.assignJumpAbility();};
		
		

		DarkEldarInfantryUnits units = new DarkEldarInfantryUnits(abilities, new DarkEldarInfantryNames(warriorSquad,scourgeSquad,mandrakeSquad,wychSquad,warpBeastPack ),0);
		DarkEldarRaceDescription description = new DarkEldarRaceDescription();
		
		
		
		
		ArrayList<DarkEldarInfantryUnits> arrayList = new ArrayList<DarkEldarInfantryUnits>();
		arrayList.add(units);

		DarkEldarRace newRace = new DarkEldarRace(0,description,arrayList);

		return new DarkEldarRace(newRace.getTotalScoreOfInfantryUnitsWithAbilities(),description,arrayList);
		
	}
	
	//returns a name object based on the input fields
		public String getOverallScore() {
			
			String warriorSquadString =  warriorSquadTxt.getText();
			int warriorSquad = Integer.parseInt(warriorSquadString);

			String scourgeSquadString = scourgeSquadTxt.getText();
			int scourgeSquad = Integer.parseInt(scourgeSquadString);

			String mandrakeSquadString = mandrakeSquadTxt.getText();
			int mandrakeSquad = Integer.parseInt(mandrakeSquadString);

			String wychSquadString = wychSquadTxt.getText();
			int wychSquad   = Integer.parseInt(wychSquadString);
			
			String warpBeastPackString = warpBeastPackTxt.getText();
			int warpBeastPack   = Integer.parseInt(warpBeastPackString);
			
			
			DarkEldarInfantryAbilities abilities = new DarkEldarInfantryAbilities();
			
			if(combatDrugs.isSelected() == true) {abilities.assignCombatDrugsAbility();};
			if(infiltration.isSelected() == true) {abilities.assignInfiltrationAbility();};
			if(jump.isSelected() == true) {abilities.assignJumpAbility();};
			if(specialMoraleBrokenEffect.isSelected() == true) {abilities.assignJumpAbility();};
			
			

			DarkEldarInfantryUnits units = new DarkEldarInfantryUnits(abilities, new DarkEldarInfantryNames(warriorSquad,scourgeSquad,mandrakeSquad,wychSquad,warpBeastPack ),0);
			DarkEldarRaceDescription description = new DarkEldarRaceDescription();
			
			
			
			
			ArrayList<DarkEldarInfantryUnits> arrayList = new ArrayList<DarkEldarInfantryUnits>();
			arrayList.add(units);

			DarkEldarRace newRace = new DarkEldarRace(0,description,arrayList);

			
		String newString = String.valueOf(newRace.getTotalScoreOfInfantryUnitsWithAbilities());
		return newString;
				
				
			
		}

	public void addDarkEldarRaceHandler(EventHandler<ActionEvent> handler) {
		submitBtn.setOnAction(handler);
	}


}
