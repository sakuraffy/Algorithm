package cn.sakuraffy.divide;

public class SimpleMaxAndMin {
	public static void main(String[] args) {
		int[] arr = new int[]{1,4,6,3,2,9,8,5,7};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}
}