/*
Assignment number : 1
File Name : InsertionSort.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/


public class InsertionSort implements Sorter{
	
	/**
	 * An insertion sort algorithm
	 */
	@Override
	public void sort(double[] ar) {
		for (int i = 1; i < ar.length; i++) {
			double x = ar[i];
			int j = i - 1;
			while ((j >= 0) && (ar[j] > x)) {
				ar[j + 1] = ar[j];
				j--;
			}
			ar[j + 1] = x;
		}	
	}
}
