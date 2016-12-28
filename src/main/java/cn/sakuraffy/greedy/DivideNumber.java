package cn.sakuraffy.greedy;

import java.util.Scanner;

public class DivideNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		long ret = new DivideNumber().divide(num);
		System.out.println(ret);
	}

	public long divide(int num) {
		switch (num) {
		case 1 : case 2:
			return 1;
		case 3 :
			return 2;
		case 4 :
			return 3;
		default :
			return getDivide(num);
		}
	}

	private long getDivide(int num) {
		int left = 2;
		int mid = 0;
		int right = 2;
		while(num >= right) {
			num -= right;
			right++;
		}
		int count = right-left;
		if(num/count != 0) {
			left += num/count;
			right += num/count;
		}
		if(num%count == 0) {
			right--;
		}else {
			mid = right - num%count;
		}
		long ret = 1;
		for(int i = left; i <= right; i++) {
			if(i != mid) {
				ret *= i;
			}
		}
		return ret;
		
	}
}
