

/*
Assignment number : 1
File Name : RandSelect.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/


public class RandSelect implements Selector{
	
	/**
	 * A randSelect algorithm
	 */
	@Override
	public double select(double[] ar, int i) {
		return randSelect(ar ,0 ,ar.length - 1 ,i);
	}
	
	/**
	 * a recursive function the follows the randSelect algorithm
	 * and returns the number in the i's rank
	 * @param ar - the array to be searched in
	 * @param leftIndex - the left most index in the current segment
	 * @param rightIndex - the right most index in the current segment
	 * @param i - the rank to be searched
	 * @return - the number in the i's rank
	 */
	double randSelect (double [] ar ,int leftIndex,int rightIndex, int i) {
		if (leftIndex == rightIndex) return ar[leftIndex];
		int q = partition(ar, leftIndex, rightIndex);
		int k = q - leftIndex + 1;
		if (i == k) return ar[q];
		if (i < k) return randSelect(ar, leftIndex, q - 1, i);
		else return randSelect(ar, q + 1, rightIndex, i - k);
		
	}
	
	/**
	 * splitting the array to numbers smaller then the element in the right
	 * index and bigger then the element in the right index
	 * @param ar - the array to work on
	 * @param leftIndex - the left most index of the segment
	 * @param rightIndex - the right most index of the segment
	 * @return the index of the splitting pivot
	 */
	int partition(double [] ar, int leftIndex, int rightIndex) { 
	    double x = ar[rightIndex];
	    int i = leftIndex;
	    for (int j = leftIndex; j <= rightIndex - 1; j++)
	    {
	        if (ar[j] <= x)
	        {
	            swap(ar ,i, j);
	            i++;
	        }
	    }
	    swap(ar ,i, rightIndex);
	    return i;
	}
	
	/**
	 * a function that makes a swap between two numbers 
	 * @param ar - the array
	 * @param x - the first number index
	 * @param y - the second number index
	 */
	void swap(double[] ar , int x, int y) {
	    double temp = ar[x];
	    ar[x] = ar[y];
	    ar[y] = temp;
	}
	
}
