package model;

public class Races {
	
	
	private DarkEldarRace darkEldarRace;
	private NecronsRace necronsRace;
	
	public Races () {
		
		darkEldarRace = new DarkEldarRace();
		 necronsRace = new NecronsRace();
		
	}
	
	public Races(DarkEldarRace darkEldarRace,NecronsRace necronsRace) {
		
		this.darkEldarRace = darkEldarRace;
		this.necronsRace = necronsRace;
	}
	
	public Races(DarkEldarRace darkEldarRace) {
		this.darkEldarRace = darkEldarRace;
		
	}
	
	public Races(NecronsRace NecronsRace) {
		this.necronsRace = NecronsRace;
		
	}
	
	public DarkEldarRace getDarkEldarRace() {
		return darkEldarRace;
	}
	
	public void setDarkEldarRace(DarkEldarRace darkEldarRace) {
		this.darkEldarRace = darkEldarRace;
	}
	
	public NecronsRace getNecronsRace() {
		return necronsRace;
	}
	
	public void setNecronsRace(NecronsRace necronsRace) {
		this.necronsRace = necronsRace;
	}
	
	public double getDarkEldarRaceScore() {
		return darkEldarRace.getTotalScoreOfInfantryUnitsWithAbilities();
	}
	
	public double getNecronsRaceScore() {
		return necronsRace.getTotalScoreOfInfantryUnitsWithAbilities();
	}
	
	

}
