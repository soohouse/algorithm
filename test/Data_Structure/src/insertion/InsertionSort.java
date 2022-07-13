package insertion;

import java.util.Arrays;

public class InsertionSort {
	
		public static void sort(int[] arr) {
			
		for(int i=1; i<arr.length; i++) {
			int targetNum = arr[i];
			
			int j = i - 1;
			
			//타겟으로 잡은 숫자가 이전 요소의 값보다 크기 전까지 반복.
			//targetNum이 작다면 계속해서 숫자를 오른쪽으로 밀어야 한다.
			while(j >= 0 && targetNum < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			//반복문을 탈출한다면 j는 맨 앞의 요소(0번 인덱스) 보다 앞을 지목하고 있습니다. (-1)
			//하지만 targetNum이 왼쪽에 있는 숫자보다 클 수도 있겠죠?
			//그렇기 때문에 j번째 요소보다 한칸 뒤쪽에 와야 합니다.
			arr[j+1] = targetNum;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
		sort(arr);
		
		System.out.println("정렬 후: " + Arrays.toString(arr));


	}

}
