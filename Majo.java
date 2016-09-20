abstract class Majo extends Prisoner{

	public Majo(String name){
		super(name);
	}

	public int decision() {
		double oppAvg = getOppAvg();
		if (oppAvg > 0.5){
			return 1;
		}
		else {
			return 0;
		}
	}

}



// 0 = Cooperate
// 1 = Defect