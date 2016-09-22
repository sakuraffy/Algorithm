package cn.sakuraffy.divide;

import java.util.Arrays;

public class MergeSort {
		public void sort(int arr[], int start, int end) {
			if(start < end) {
				int mid = (start + end) / 2;
				//分解
				sort(arr,start,mid);
				sort(arr,mid+1,end);
				//合并
				merge(arr,start,mid,end);
			}
		}
		
		public void merge(int arr[], int start, int mid, int end) {
			//接收参数，并定义两组起始点
			int start1 = start;
			int start2 = mid + 1;
			int end1 = mid;
			int end2 = end;
			int[] temp = new int[arr.length];
			int k = 0;
			//逐一比较 
			while(start1 <= end1 && start2 <= end2) {
				if(arr[start1] < arr[start2]) {
					temp[k++] = arr[start1++];
				}else {
					temp[k++] = arr[start2++];
				}
			}
			//将多的一组直接落下来 
			while(start1 <= end1) {
				temp[k++] = arr[start1++];
			}		
			while(start2 <= end2) {
				temp[k++] = arr[start2++];
			}
			//将当前排好序的数组合并到前面排好序的数组中
			for(int i = 0; i < k; i++) {
				arr[i + start] = temp[i];
			}
			
		}
		
		public static void main(String[] args) {
			int[] arr = new int[]{2,4,7,5,8,1,3,6};
			MergeSort ms = new MergeSort();
			ms.sort(arr, 0, arr.length-1);
			System.out.println(Arrays.toString(arr));
		}
	}