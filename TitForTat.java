abstract class TitForTat extends Prisoner{

	public TitForTat(String name){
		super(name);
	}

	public int decision() {
		int opponentsPrev = getOppPrev();
		if ( opponentsPrev == 1 ){
			return 1;
		}
		else {
			return 0;
		}
	}

}



// 0 = Cooperate
// 1 = Defect