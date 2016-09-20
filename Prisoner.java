abstract class Prisoner {

	protected String name;
	protected int totalScore;
	protected int roundScore;
	protected int numBouts;
	protected int thisPrev;
	protected int oppPrev;
	protected int score;

	protected int oppRoundScore;

	public Prisoner(String name){
		this.name = name;
	}

	public void finishedGame(){
		numBouts = 0;
		totalScore += roundScore;
		roundScore = 0;
		oppPrev = 0;
	}

	public void playBout(int score){
		this.score = score;
		roundScore += score;
		numBouts ++;
		oppRoundScore();
	}

	public double getAverage(){
		return roundScore/numBouts;
	}

	private void oppRoundScore(){
		oppRoundScore += getOppPrev();
	}

	public int getOppPrev(){
		if ( score == 5 || score == 3) {
			oppPrev = 0;
		}
		else {
			oppPrev = 1;
		}
		return oppPrev;
	}

	public double getOppAvg(){
		double oppAvg;
		if (numBouts == 0){
			oppAvg = 0;
		}
		else{
			oppAvg = oppRoundScore/numBouts;
		}
		return oppAvg;
	}

	public int getNumBouts(){
		return numBouts;
	}

	public String displayTable(){
		return name + ": " + totalScore;
	}

	public abstract int decision();

	public String toString(){
		return "Name: " + name;
	}
}