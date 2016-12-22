package RecursiveSolution;

public class bigSigma2Recursive {

	private static double target = 6;
	//private static double target = Math.pow(10, 15);
	
	public static void main(String[] args) {
		
		double SIGMA2 = bigSigma2(target);
		
		//double res = SIGMA2 / Math.pow(10, 9);
		
		System.out.println(SIGMA2);
	}
	
	private static double bigSigma2(double n) {
		
		if(n == 1) return 1;
		
		return (smallSigma2(n) + bigSigma2(n-1));
	}
	
	private static double smallSigma2(double n) {
		
		double smallSigma2 = 0;
		
		for (double i = 1; i <= Math.ceil(n/2); i++) {
			if(n % i == 0) {
				smallSigma2 += Math.pow(i, 2);
			}
		}
		
		smallSigma2 += Math.pow(n, 2);
		
		return smallSigma2;
	}

}
