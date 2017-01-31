
/*
Assignment number : 1
File Name : RandomArrayFactory.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class RandomArrayFactory {
	
	public static double [] getRandomArray(int size) {
		double [] arr = new double[size];
		for (int i = 0; i < size; i++) {
			double num = Math.random();
			String temp = Double.toString(num);
			if (temp.length() > 12)
			temp = temp.substring(0, 12);
			arr[i] = Double.parseDouble(temp);
		}
		return arr;
	}
}
