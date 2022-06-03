package view;

import javafx.scene.control.Accordion;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;

public class RaceClashRootPane extends TabPane {

	private NecronsRacePane nrp;
	private DarkEldarRacePane derp;
	private OverviewResultsPane orp;
	private ViewPane vp;
	private Tab t1,t2,t3,t4;


	public RaceClashRootPane()
	{



		nrp = new NecronsRacePane();
		derp = new DarkEldarRacePane();
		orp = new OverviewResultsPane();
		vp = new ViewPane();

		t1 =  new Tab("Necrons Race Pane", nrp);
		t2 =  new Tab("Dark Eldar Race Pane", derp);
		t3 = new Tab("View Pane",vp);
		t4 = new Tab("Overview Reults Pane",orp);


		this.getTabs().addAll(t1,t2,t3,t4);



	}

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







}
