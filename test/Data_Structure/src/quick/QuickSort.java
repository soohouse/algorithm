package quick;

import java.util.Arrays;

public class QuickSort {
	
	/**
	 * pivot을 기준으로 파티션을 나누기 위한 약할 정렬 메서드
	 * 
	 * @param a -> 정렬할 배열
	 * @param leftmost -> 현재 부분배열의 왼쪽
	 * @param rightmost -> 현재 부분배열의 오른쪽
	 */

	public static void quickSort(int[] a, int leftmost, int rightmost) {
			
			//leftmost가 rightmost보다 크거나 같다면 정렬 할 원소가
			//1개 이하이므로 정렬하지 않고 return 한다.
			if(leftmost >= rightmost) return;
	
		}
	
	/*
	 - 피벗을 기준으로 요소들이 왼쪽과 오른쪽으로 약하게 정렬 된 상태로
	 만들어 준 뒤, 최종적으로 pivot의 위치를 얻는다.
	 
	 - 그리고 나서 해당 피벗을 기준으로 왼쪽 부분리스트와 오른쪽 부분리스트로 나누어
	 분할 정복을 해준다.
	 */

	public static void main(String[] args) {
		
		int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
		//sort(arr);
		
		System.out.println("정렬 후: " + Arrays.toString(arr));
	}

}
