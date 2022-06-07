package view;


import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;


public class OverviewResultsPane extends StackPane {

	private TextArea results;

	public OverviewResultsPane() {


		results = new TextArea("Results will apeear here");
		results.setEditable(false);

		this.setPadding(new Insets(40, 40, 40, 40));

		this.getChildren().add(results);
		
		results.setId("results-id");


	}

	public void setResults (String newValue) {

		results.setText(newValue);
		


	}

	public void setColor(String colour) {
		this.setStyle("-fx-background-color: " + colour + ";");
	}
	





}
