class RoundRobinTester {

	public static void main(String[] args){
		RoundRobin r1 = new RoundRobin();
		r1.run(250);
		r1.displayTable();
	}
}

// 0 = Cooperate
// 1 = Defect