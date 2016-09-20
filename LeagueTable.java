class LeagueTable {
	private Prisoner[] prisoners;

	public LeagueTable(Prisoner[] prisoners) {
		this.prisoners = prisoners;
    }

    public String toString() {
		String stats = "";
		for (int a = 0; a < prisoners.length; a ++) {
		       stats += prisoners[a].displayTable() + "\n";    
		}
	    return stats;
	}
}