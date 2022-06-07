package view;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.DarkEldarInfantryAbilities;
import model.DarkEldarInfantryNames;
import model.DarkEldarInfantryUnits;
import model.DarkEldarRace;
import model.DarkEldarRaceDescription;

public class DarkEldarRacePane extends GridPane {

	private Label darkEldarAbilitiesLbl,darkEldarInfantryLbl,mandrakeSquadLbl,warriorSquadLbl, scourgeSquadLbl, wychSquadLbl, warpBeastPackLbl;
	private TextField mandrakeSquadTxt,warriorSquadTxt, scourgeSquadTxt, wychSquadTxt, warpBeastPackTxt;
	private CheckBox combatDrugs, infiltration, jump,specialMoraleBrokenEffect;
	private Button submitBtn;


	public DarkEldarRacePane()
	{

		this.setPadding(new Insets(20, 20, 20, 20));
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);

		darkEldarInfantryLbl = new Label("DARK ELDAR INFANTRY");

		//set the mandrake squad Lbl as well as text field
		mandrakeSquadLbl = new Label("Mandrake Squads");
		mandrakeSquadTxt = new TextField();


		//set the warriorSquad Lbl as well as text field
		warriorSquadLbl = new Label("Warrior Squads");
		warriorSquadTxt = new TextField();


		//set the scourgeSquad Lbl as well as text field
		scourgeSquadLbl = new Label("Scourge Squads");
		scourgeSquadTxt = new TextField();

		//set the wychSquad Lbl as well as text field
		wychSquadLbl = new Label("Wych Squads");
		wychSquadTxt = new TextField();

		//set the warpBeastPack Lbl as well as text field
		warpBeastPackLbl = new Label("Warp Beast Packs");
		warpBeastPackTxt = new TextField();

		//set the darkEldarInfantry Lbl 
		darkEldarAbilitiesLbl = new Label("DARK ELDAR INFANTRY ABILITIES");

		//set up the checkboxes for special asbilities
		combatDrugs = new CheckBox("Combat drugs");
		infiltration = new CheckBox("Infiltration");
		jump = new CheckBox("Jump");
		specialMoraleBrokenEffect = new CheckBox("Special morale broken effect");

		//set the submit button to submit all of the above fields
		submitBtn = new Button("Submit");

		this.add(darkEldarInfantryLbl, 0, 0);

		this.add(mandrakeSquadLbl, 0, 1);
		this.add(mandrakeSquadTxt, 1, 1);

		this.add(warriorSquadLbl, 0, 2);
		this.add(warriorSquadTxt, 1, 2);

		this.add(scourgeSquadLbl, 0, 3);
		this.add(scourgeSquadTxt, 1, 3);

		this.add(wychSquadLbl, 0, 4);
		this.add(wychSquadTxt, 1, 4);

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

		
		String mandrakeSquadString = mandrakeSquadTxt.getText();
		int mandrakeSquad = Integer.parseInt(mandrakeSquadString);
		
		String warriorSquadString =  warriorSquadTxt.getText();
		int warriorSquad = Integer.parseInt(warriorSquadString);

		String scourgeSquadString = scourgeSquadTxt.getText();
		int scourgeSquad = Integer.parseInt(scourgeSquadString);

		String wychSquadString = wychSquadTxt.getText();
		int wychSquad   = Integer.parseInt(wychSquadString);

		String warpBeastPackString = warpBeastPackTxt.getText();
		int warpBeastPack   = Integer.parseInt(warpBeastPackString);


		DarkEldarInfantryAbilities abilities = new DarkEldarInfantryAbilities();

		if(combatDrugs.isSelected() == true) {abilities.assignCombatDrugsAbility();};
		if(infiltration.isSelected() == true) {abilities.assignInfiltrationAbility();};
		if(jump.isSelected() == true) {abilities.assignJumpAbility();};
		if(specialMoraleBrokenEffect.isSelected() == true) {abilities.assignSpecialMoraleBrokenEffectAbility();};



		DarkEldarInfantryUnits units = new DarkEldarInfantryUnits(abilities, new DarkEldarInfantryNames(mandrakeSquad,warriorSquad,scourgeSquad,wychSquad,warpBeastPack ),0);
		DarkEldarRaceDescription description = new DarkEldarRaceDescription();


		ArrayList<DarkEldarInfantryUnits> arrayList = new ArrayList<DarkEldarInfantryUnits>();
		arrayList.add(units);



		return new DarkEldarRace(units.getOverallScore(),description,arrayList);

	}

	//clear the input fields
	public void clear() {
		mandrakeSquadTxt.setText("");
		scourgeSquadTxt.setText("");
		warpBeastPackTxt.setText("");
		warriorSquadTxt.setText("");
		wychSquadTxt.setText("");
		combatDrugs.setSelected(false);
		infiltration.setSelected(false);
		jump.setSelected(false);
		specialMoraleBrokenEffect.setSelected(false);

	}


	public void addDarkEldarRaceHandler(EventHandler<ActionEvent> handler) {
		submitBtn.setOnAction(handler);
	}


}
