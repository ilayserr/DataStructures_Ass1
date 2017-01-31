
/*
Assignment number : 1
File Name : RadixSort.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class RadixSort implements Sorter {
	
	/**
	 * A radixSort algorithm
	 */
	@Override
	public void sort(double[] ar) {
		int maxD = AlgorithmComparison.NUMBER_OF_DIGITS;
		for (int i = 0; i < maxD; i++) {
			countingSort(ar, maxD , i);
		}
	}
	
	/**
	 * a function that return the digit i places from the right of the dot.
	 * @param num - the number to work on
	 * @param i - represent the location of the digit to be extracted
	 * @return - the digit requested
	 */
	public int getDigit (double num, int i) {
		int temp = (int)(num * 
					Math.pow(10, AlgorithmComparison.NUMBER_OF_DIGITS - i));
		return temp % 10;
	}
	
	/**
	 * an countingSort algorithm 
	 * @param ar - the array to be sorted
	 * @param d - the maximal number of digits in a specific number
	 * @param index - the location of the digit comparing to the dot.
	 */
	public void countingSort (double [] ar, int d, int index) {
		
		double [] result = new double [ar.length];
		int [] count = new int [d];
		
		for (int i = 0; i < result.length; i++) {
			count[getDigit(ar[i] , index)]++;
		}
		
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		
		for (int i = ar.length - 1; i >= 0; i--) {
			result[count[getDigit(ar[i], index)] - 1] = ar[i];
			count[getDigit(ar[i], index)]--;		
		}
	
		for (int i = 0; i < ar.length; i++) {
			ar[i] = result[i];
		}
	}
}

