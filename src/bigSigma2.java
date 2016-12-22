import java.util.ArrayList;


public class bigSigma2 {

	//private static double target = Math.pow(10, 15);
	private static double target = 6;
	
	public static void main(String[] args) {
		
		double bigSigma2 = findBigSigma2(target);
		
		double res = bigSigma2 / Math.pow(10, 9);
		
		//System.out.println(bigSigma2);
		System.out.println(res);	
		
		for (double i = 1; i < 100; i++) {
			System.out.println(findFactors(i));
		}
	}

	private static double findBigSigma2(double target2) {
		
		double prevSmallSigma2 = 0;
		
		for(double i = 1; i <= target; i++) {
			
			ArrayList<Double> setOfFactors = new ArrayList<Double>();
			
			setOfFactors = findFactors(i);
			
			double sigma2 = findSmallSigma2(setOfFactors);
			
			double bigSigma2 = sigma2 + prevSmallSigma2;
			
			if(i == target) return bigSigma2;
			
			prevSmallSigma2 = bigSigma2;
			
		}
		
		return 0;
	}

	private static double findSmallSigma2(ArrayList<Double> setOfFactors) {
		
		double sum = 0;
		
		for (Double factor : setOfFactors) {
			sum += Math.pow(factor, 2);
		}
		
		return sum;
	}

	private static ArrayList<Double> findFactors(double i) {
		
		ArrayList<Double> setOfFactors = new ArrayList<Double>();
		
		for (double j = 1; j <= Math.sqrt(i); j++) {
			if(i % j == 0) { 
				setOfFactors.add(j);
				setOfFactors.add(i/j);
			}
		}
		//setOfFactors.add(i);
		
		return setOfFactors;
	}
	
}
