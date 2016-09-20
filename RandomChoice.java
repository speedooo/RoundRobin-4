import java.util.Random;

class RandomChoice extends Prisoner{

	public RandomChoice(){
		super("Random");
	}

	public int decision() {
		if ( randomFloat() < 0.5 ){
			return 1;
		}
		else {
			return 0;
		}
	}

	private float randomFloat(){
		int min = 0;
		int max = 1;
		Random randFloat = new Random();
		float randomFloat = randFloat.nextFloat() * (max - min) + min;
		return randomFloat;
	}

}
