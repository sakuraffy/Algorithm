package cn.sakuraffy.divide;

public class DivMaxAndMin {
		public static class Num {
			private int max;
			private int min;
			public final int getMax() {
				return max;
			}
			public final void setMax(int max) {
				this.max = max;
			}
			public final int getMin() {
				return min;
			}
			public final void setMin(int min) {
				this.min = min;
			}
			
		}

		public Num getNum(int[] arr, int start, int end) {
			Num num = new Num();
			if(start == end) {
				num.setMax(arr[start]);
				num.setMin(arr[start]);
			}else if(start == end-1) {
				if(arr[start] < arr[end]) {
					num.setMax(arr[end]);
					num.setMin(arr[start]);
				}else {
					num.setMin(arr[end]);
					num.setMax(arr[start]);
				}
			}else {
				int mid = (start + end) / 2;
				Num num1 = getNum(arr, start, mid);
				Num num2 = getNum(arr, mid+1, end);
				int max = num1.getMax() > num2.getMax() ? num1.getMax() : num2.getMax();
				int min = num1.getMin() < num2.getMin() ? num1.getMin() : num2.getMin();
				num.setMax(max);
				num.setMin(min);
			}
			return num;
		}
		
		public static void main(String[] args) {
			int[] arr = new int[]{1,4,6,3,2,9,8,5,7};
			DivMaxAndMin dmam = new DivMaxAndMin();
			Num num = dmam.getNum(arr,0,arr.length-1);
			System.out.println("min = " + num.getMin());
			System.out.println("max = " + num.getMax());
		}
		
	}