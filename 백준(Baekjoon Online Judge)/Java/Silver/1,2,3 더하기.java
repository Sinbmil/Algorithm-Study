// 백준 Silver3 - 9095(1,2,3 더하기)
// 문제링크: https://www.acmicpc.net/problem/9095

import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[11]; // n은 양수이며 11보다 작다
		arr[1] = 1;   // (1) -> 1가지
		arr[2] = 2;   // (1+1, 2) -> 2가지
		arr[3] = 4;   // (1+1+1, 1+2, 2+1, 3) -> 4가지 
	
		for(int i =0; i<T; i++) {
			int n = sc.nextInt();
			for(int j=4; j<=n; j++) {
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[n]);
		}
	}	
}
