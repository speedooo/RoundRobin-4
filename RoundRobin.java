class RoundRobin {

	private int numRounds;
    private Prisoner[] prisoners;

	public RoundRobin(){
	}

	public void run(int numRounds){
		this.numRounds = numRounds;
		prisoners = new Prisoner[5];
        prisoners[0] = new NiceTitForTat();
        prisoners[1] = new NastyTitForTat();
        prisoners[2] = new RandomChoice();
        prisoners[3] = new SoftMajo();
        prisoners[4] = new HardMajo();

        for (int i = 0; i < prisoners.length -1; i ++) {
        	Prisoner p1 = prisoners[i];
        	for (int j = i+1; j < prisoners.length; j++) {
        		Prisoner p2 = prisoners[j];
        		for (int e = 0; e < numRounds; e ++) {

        			int p1Dec = p1.decision();
        			int p2Dec = p2.decision();

                    if (p1Dec == p2Dec && p1Dec == 0) {
                        p1.playBout(3);
                        p2.playBout(3);
                    }
                    else if (p1Dec == p2Dec && p1Dec == 1) {
                        p1.playBout(1);
                        p2.playBout(1);
                    }
                    else if (p1Dec != p2Dec && p1Dec == 0) {
                        p1.playBout(0);
                        p2.playBout(5);
                    }
                    else if (p1Dec != p2Dec && p1Dec == 1) {
                        p1.playBout(5);
                        p2.playBout(0);
                    }

                    p2.finishedGame();
        		}
        		p1.finishedGame();
        	}
        }
	}

	public void displayTable(){
        System.out.print(new LeagueTable(prisoners));
	}
}

// 0 = Cooperate
// 1 = Defect