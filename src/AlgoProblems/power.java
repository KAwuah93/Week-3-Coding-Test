package AlgoProblems;

public class power {
	public static void main(String[] args) {
		
		System.out.println(powerExp(9,27));
		
	}
	
	static int powerExp(int base, int raise){
		
		if(raise == 0) return 1;
		else if (raise % 2 == 0) return powerExp(base, raise/2) * powerExp(base, raise/2);
		else return (base * powerExp(base, raise / 2) * powerExp(base, raise / 2));
	
	}

}
