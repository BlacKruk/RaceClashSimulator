package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class OverviewResultsPane extends StackPane {
	
	private TextArea results;
	
	public OverviewResultsPane() {
		
		
		results = new TextArea("Results will apeear here");
		results.setEditable(false);
		
		 this.setPadding(new Insets(40, 40, 40, 40));
	
		this.getChildren().add(results);
		
		
	}
	
	public void setResults (String newValue) {
		
		results.setText(newValue);
		
		
	}
	
	
	
	
	

}
