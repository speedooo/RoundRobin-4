class NiceTitForTat extends TitForTat {


	public NiceTitForTat(){
		super("Nice Tit For Tat");
	}

	public int decision(){
		int numBouts = getNumBouts();
		if (numBouts == 0) {
			return 0;
		}
		else {
			return super.decision();
		}
	}
}