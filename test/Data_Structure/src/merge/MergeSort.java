package merge;

import java.util.Arrays;

public class MergeSort {
	
	//병합 작업에 쓰일 임시 배열.
	private static int[] temp;
	
	//병합 정렬 알고리즘
	
	/**
	 * @param arr - 분할 할 배열
	 * @param s - 분할 시작 위치
	 * @param e - 분할 끝 위
	 */
	
	private static void mergeSort(int[] arr, int s, int e) {
		
		//분할의 중앙점을 찾아야 함.
		int m = (s + e) / 2;
		
		//분할 작업 (더 쪼개지지 않을 때 까지 반복)
		mergeSort(arr, s, m); //왼쪽
		mergeSort(arr, m+1, e); //오른쪽
	}

	public static void sort(int[] arr) {
		temp = new int[arr.length];
		mergeSort(arr, 0, arr.length-1);

	}
	
	public static void main(String[] args) {
		
		int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
		sort(arr);
		
		System.out.println("정렬 후: " + Arrays.toString(arr));
	}


}
