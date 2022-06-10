package view;

import javafx.scene.Parent;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class RaceClashRootPane extends BorderPane {


	//declare all of the panes
	private NecronsRacePane nrp;
	private DarkEldarRacePane derp;
	private OverviewResultsPane orp;
	private ViewPane vp;
	private RaceMenuBar mb;
	private Tab t1,t2,t3,t4,t5;
	private Parent root;
	private TabPane newTabPane;
	private BorderPane  newBorderPane;

	public RaceClashRootPane() 
	{

		//create an instance of the panes
		nrp = new NecronsRacePane();
		derp = new DarkEldarRacePane();
		orp = new OverviewResultsPane();
		vp = new ViewPane();
		mb = new RaceMenuBar();


		//add the panes from above into appropriate tabs
		t1 =  new Tab("Necrons Race Pane", nrp);
		t2 =  new Tab("Dark Eldar Race Pane", derp);
		t3 = new Tab("View Pane",vp);
		t4 = new Tab("Overview Results Pane",orp);
		newTabPane = new TabPane(t1,t2,t3,t4);

		this.setTop(mb);
		this.setCenter(newTabPane);


	}

	//return methods for each of the panes
	public NecronsRacePane getNecronsRacePane() {
		return nrp;
	}

	public DarkEldarRacePane getDarkEldarRacePane() {
		return derp;
	}
	public OverviewResultsPane getOverviewResultsPane() {
		return orp;
	}

	public ViewPane getViewPane() {
		return vp;
	}

	public RaceMenuBar getMenuBar() {
		return mb;
	}

}
