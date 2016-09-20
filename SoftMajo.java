class SoftMajo extends Majo {

	public SoftMajo(){
		super("Soft Majority");
	}

	public int decision(){
		numBouts = getNumBouts();
		double oppAvg = getOppAvg();
		if (numBouts == 0 || oppAvg == 0.5 ) {
			return 0;
		}
		else {
			return super.decision();
		}
	}
}