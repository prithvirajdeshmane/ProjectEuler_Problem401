package NonRecEasyCalc;
import java.util.ArrayList;


public class bigSigma2 {

	private static double target = Math.pow(10, 15);
	//private static double target = 6;
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		double bigSigma2 = findBigSigma2(target);
		
		System.out.println(bigSigma2);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime - startTime)/60000 + "min");
		
	}

	private static double findBigSigma2(double target) {
		
		double prevBigSigma2 = 0;
		
		for(double i = 1; i <= target; i++) {
			System.out.println(i);
			double sigma2 = smallSigma2(i);
			
			double bigSigma2 = (sigma2 + prevBigSigma2) % Math.pow(10, 9);
			
			if(i == target) 
				return bigSigma2;
			
			prevBigSigma2 = bigSigma2;
		}
		
		return 0;
	}
	
	
	private static double smallSigma2(double n) {
		
		double smallSigma2 = 0;
		
		for (double i = 1; i <= Math.ceil(n/2); i++) {
			if(n % i == 0) {
				smallSigma2 += Math.pow(i, 2);
			}
		}
		
		if(n != 1.0) {
			smallSigma2 += Math.pow(n, 2);
		}

		return smallSigma2;
	}
		
}
