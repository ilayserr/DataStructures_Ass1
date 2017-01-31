
/*
Assignment number : 1
File Name : MergeSort.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class MergeSort implements Sorter {

	/**
	 * A mergeSort algorithm
	 */
	@Override
	public void sort(double[] ar) {
		mergeSort(ar, 0, ar.length - 1);
	}
	
	/**
	 * a recursive function that works according to the mergeSort algorithm
	 * @param ar - the array to be sorted
	 * @param low - the left most index of the current segment to be sorted
	 * @param high - the right most index of the current segment to be sorted
	 */
	public void mergeSort(double [] ar ,int  low ,int high) {
		int middle;
		if (low < high) {
			middle = (int)((low + high) / 2);
			mergeSort(ar, low, middle);
			mergeSort(ar, middle + 1, high);
			merge(ar, low, middle, high);
		}	
	}
	
	/**
	 * A function that follows the mergeSort algorithm and sort the current
	 * segment
	 * @param ar - the array to be sorted
	 * @param leftIndex -the left most index of the current segment to be sorted
	 * @param middle - the middle index between the left and the right
	 * @param rightIndex - the right most index 
	 * 						of the current segment to be sorted
	 */
	public void merge(double[] ar, int leftIndex, int middle, int rightIndex) {
		int n1 = middle - leftIndex + 1;
		int n2 = rightIndex - middle;
		double [] left = new double [n1 + 1];
		double [] right = new double [n2 + 1];
		for (int i = 0; i < n1; i++) { 
			left[i] = ar[leftIndex + i];
		}
		for (int i = 0; i < n2; i++) {
			right[i] = ar[middle + 1 + i];
		}
		int i = 0;
		int j = 0;
		left[n1] = Double.MAX_VALUE;
		right[n2] = Double.MAX_VALUE;
		for (int k = leftIndex; k <= rightIndex; k++) {
			if (left[i] < right[j]) {
				ar[k] = left[i];
				i++;
			} else {
				ar[k] = right[j];
				j++;
			}
		}				
	} 
}
