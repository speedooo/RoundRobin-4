class HardMajo extends Majo {

	public HardMajo(){
		super("Hard Majority");
	}

	public int decision(){
		numBouts = getNumBouts();
		double oppAvg = getOppAvg();
		if (numBouts == 0 || oppAvg == 0.5 ) {
			return 1;
		}
		else {
			return super.decision();
		}
	}
}