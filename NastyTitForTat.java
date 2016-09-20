class NastyTitForTat extends TitForTat {


	public NastyTitForTat(){
		super("Nasty Tit For Tat");
	}

	public int decision(){
		int numBouts = getNumBouts();
		if (numBouts == 0) {
			return 1;
		}
		else {
			return super.decision();
		}
	}
}