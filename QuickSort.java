
/*
Assignment number : 1
File Name : QuickSort.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class QuickSort implements Sorter {

	/**
	 * A quickSort algorithm
	 */
	@Override
	public void sort(double[] ar) {
		quickSort(ar , 0 , ar.length - 1);
	}
	
	/**
	 * a recursive function that works according to the quickSort algorithm
	 * @param ar - the array to be sorted
	 * @param leftIndex -the left most index of the current segment to be sorted
	 * @param rightIndex - the right most index 
	 * 						of the current segment to be sorted
	 */
	public void quickSort(double[] ar, int leftIndex, int rightIndex) {
		double x = ar[chooseMedian(ar, leftIndex, rightIndex)];
		int i = leftIndex;
		int j = rightIndex;
		while (i <= j) {
			while (ar[i] < x) i++;
			while (ar[j] > x) j--;
			if (i <= j) {
				double temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				i++;
				j--;
			}
		}
		if (leftIndex < j) 
			quickSort(ar, leftIndex, j);
		if (i < rightIndex) 
			quickSort(ar, i, rightIndex);
	}
		
	/**
	 * a function that chooses the median element from 3 possible choices.
	 * and sort those 3 elements according to their size.
	 * @param ar - the array that contain those 3 elements
	 * @param leftIndex - the left most index of the segment
	 * @param rightIndex - the right most index of the segment
	 * @return - the index of the median element
	 */
	public int chooseMedian(double[] ar, int leftIndex, int rightIndex) {
		double x = ar[leftIndex];
		double y = ar[rightIndex];
		double z = ar[(int)((leftIndex + rightIndex) / 2)];
		double median = Math.max(Math.min(x,y) ,Math.min(Math.max(x, y), z));
		ar[(int)((leftIndex + rightIndex) / 2)] = median;
		ar[leftIndex] = (Math.min(Math.min(x, y) , z));
		ar[rightIndex] = (Math.max(Math.max(x, y) , z));
		return ((int)((leftIndex + rightIndex) / 2));
	}
	
}
