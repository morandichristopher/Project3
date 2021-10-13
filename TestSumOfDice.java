package labproject3.prob1;

public class TestSumOfDice {

	public static void main(String[] args) {
		
		SumOfDice sumOfDice = new SumOfDice();
		
		sumOfDice.runSimulation();
		int[] results = sumOfDice.getSimulatedResults();
//		int[] results = {0, 0, 3, 5, 7, 4, 1, 4, 6, 8, 4, 6, 2};
		
		// example:
		// results[2] = 2 - 2 occurencs of sum = 2
		// results[3] = 6 - 6 occurrences of sum = 3
		
		// print results as described in Assignment3 - 2 columns.
		System.out.println("sum of dice\t" + "occurrences");
		System.out.println("--------\t --------");
		for(int i=2; i<=12; i++) {
			System.out.print(i + " \t\t");
			
			
			System.out.println(results[i]);
		}
		// print frequency chart
		System.out.println();
		System.out.println("Dice Sums: (100 rolls)");
		System.out.println();
		
		for(int i=2; i<=12; i++) {
			System.out.print(i + ": ");
			
			for(int j=1; j<=results[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}