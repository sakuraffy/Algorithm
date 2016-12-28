package cn.sakuraffy.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Sakuraffy
 * @date 2016-12-25 19:11
 * @desc 利用贪心算法，解决找零问题
 */
public class Change {
	public final static int[] change = new int[]{100,50,20,10,5,1};
	
	public int[] getChange(int num) {
		int len = change.length;
		int[] count = new int[len];
		// 记录每次遍历的开始
		int tmp = 0;
		while(num > 0) {
			for(int i = tmp; i < len; i++) {
				if(num >= change[i]) {
					num -= change[i];
					count[i]++;
					tmp = i;
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int[] count = new Change().getChange(num);
		System.out.println(Arrays.toString(count));
	}
}
