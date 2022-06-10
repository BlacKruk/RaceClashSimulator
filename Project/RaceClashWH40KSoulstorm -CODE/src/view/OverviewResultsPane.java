package view;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class OverviewResultsPane extends BorderPane {

	private TextArea results;
	private Button clearResultsButton;

	public OverviewResultsPane() {


		results = new TextArea("Results will apeear here");
		results.setEditable(false);

		this.setPadding(new Insets(40, 40, 40, 40));
		
		clearResultsButton = new Button("Clear Results!");
		
		clearResultsButton.setAlignment(Pos.BOTTOM_RIGHT);
		
        
		this.setTop(results);
		this.setCenter(clearResultsButton);
		
		results.setId("results-id");


	}

	public void setResults (String newValue) {

		results.setText(newValue);
		


	}
	
	public void clearResults() {
		
		results.clear();
		
	}
	
	

	public void setColor(String colour) {
		this.setStyle("-fx-background-color: " + colour + ";");
	}
	
	public void addClearResultsHandler(EventHandler<ActionEvent> handler) {
		clearResultsButton.setOnAction(handler);
	}
	





}
