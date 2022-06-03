package view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import model.DarkEldarRace;
import model.NecronsRace;
import model.DarkEldarRace;



public class ViewPane extends GridPane {



	private ListView<DarkEldarRace> darkEldarListView;
	private ObservableList<DarkEldarRace> darkEldarRace;
	private Label darkEldarListViewLabel, necronsListViewLabel, areTheUnitsReady;
	private Button fightButton;

	private ListView<NecronsRace> necronsListView;
	private ObservableList<NecronsRace> necronsRace;

	public ViewPane() {

		this.setPadding(new Insets(20, 20, 20, 20));
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER_LEFT);

		necronsListViewLabel = new Label("Necrons list view");


		necronsRace = FXCollections.observableArrayList();
		necronsListView = new ListView<>(necronsRace);
		necronsListView.setPrefSize(200, 150);

		necronsListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		darkEldarListViewLabel = new Label("Dark Eldar list view");

		darkEldarRace = FXCollections.observableArrayList();
		darkEldarListView = new ListView<>(darkEldarRace);
		darkEldarListView.setPrefSize(200, 150);

		darkEldarListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		areTheUnitsReady = new Label("Are the units ready???");
		fightButton = new Button("Fight!");
		fightButton.setPrefSize(100, 100);

		this.add(darkEldarListViewLabel, 0, 0);
		this.add(darkEldarListView, 1, 0);
		this.add(areTheUnitsReady, 3, 0);
		this.add(fightButton, 3, 1);
		this.add(necronsListViewLabel, 0, 1);
		this.add(necronsListView, 1, 1);
	}

	//dark eldar  Race methods
	public void addDarkEldarRace(DarkEldarRace Race1) {
		darkEldarRace.add(Race1);
		this.clearSelectionDarkEldarRace();;
	}

	public ObservableList<DarkEldarRace> getContentsDarkEldarRace() {
		return darkEldarRace;
	}

	public void clearDarkEldarRace() {
		darkEldarRace.clear();
	}

	public DarkEldarRace getSelectedItemDarkEldarRace() {
		return darkEldarListView.getSelectionModel().getSelectedItem();
	}

	public ObservableList<DarkEldarRace> getSelectedItemsDarkEldarRace() {
		return darkEldarListView.getSelectionModel().getSelectedItems();
	}

	public void removeSelectedDarkEldarRace() {
		int index = darkEldarListView.getSelectionModel().getSelectedIndex();

		if (index != -1) {
			darkEldarRace.removeAll(this.getSelectedItemsDarkEldarRace());
			this.clearSelectionDarkEldarRace();
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Selection Error");
			alert.setContentText("Please select an item to remove.");
			alert.showAndWait();
		}
	}

	public void clearSelectionDarkEldarRace() {
		darkEldarListView.getSelectionModel().clearSelection();
	}


	//necrons  Race methods
	public void addNecronsRace(NecronsRace Race1) {
		necronsRace.add(Race1);
		this.clearSelectionNecronsRace();;
	}

	public ObservableList<NecronsRace> getContentsNecronsRace() {
		return necronsRace;
	}

	public void clearNecronsRace() {
		necronsRace.clear();
	}

	public NecronsRace getSelectedItemNecronsRace() {
		return necronsListView.getSelectionModel().getSelectedItem();
	}

	public ObservableList<NecronsRace> getSelectedItemsNecronsRace() {
		return necronsListView.getSelectionModel().getSelectedItems();
	}

	public void removeSelectedNecronsRace() {
		int index = necronsListView.getSelectionModel().getSelectedIndex();

		if (index != -1) {
			necronsRace.removeAll(this.getSelectedItemsNecronsRace());
			this.clearSelectionNecronsRace();
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Selection Error");
			alert.setContentText("Please select an item to remove.");
			alert.showAndWait();
		}
	}

	public void clearSelectionNecronsRace() {
		necronsListView.getSelectionModel().clearSelection();
	}
	
	public void addFightButtonHandler(EventHandler<ActionEvent> handler) {
		fightButton.setOnAction(handler);
	}

}
