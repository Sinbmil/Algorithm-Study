// 백준 Silver5 - 1427(소트인사이드)
// 문제링크: https://www.acmicpc.net/problem/1427

import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// int형 배열로 변환
		int arr[] = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		
		// Integer형 배열로 변환
		Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		// 내림차순 정렬
		Arrays.sort(arr2, Comparator.reverseOrder());
		for (int i : arr2) {
	        System.out.print(i + "");
	    }
    }
}
