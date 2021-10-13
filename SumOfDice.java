package labproject3.prob1;

public class SumOfDice {
	private int[] occurrences = new int[13];
	// int[] diceSums = new int[11];
	
	public int[] getSimulatedResults() {
		return occurrences;
	}
	
	/**
	 * Simulate rolling 2 die 100 times and set the occurrence of each sum.
	 * 
	 */
	
	public void runSimulation() {
		/** for(int i = 0; i < 11; i++) {
			diceSums[i] = 0;
		}
		**/
		for(int i=0; i<100; i++) {
			int roll1 = rollDice();
			int roll2 = rollDice();
			
			int sum = 0;
			
			
			//sum up both rolls, and increment the current value of occurences.
			
			sum = roll1+ roll2;
			occurrences[sum]++;
			
		}
	}
	
	/**
	 * Simulate the roll of a single die.
	 * 
	 * @return integer between 1 and 6
	 */
	private int rollDice() {
		int max = 6;
		int min = 1;
		int range = max - min + 1;
		
		int result = (int) (Math.random() * range) + min;
		
		return result;
	}
}
