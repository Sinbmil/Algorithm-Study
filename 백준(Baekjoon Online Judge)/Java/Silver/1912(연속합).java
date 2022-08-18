// 백준 Silver2 - 1912(연속합)
// 문제링크: https://www.acmicpc.net/problem/1912

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int ans = 0;
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			sum += arr[i];
			if(sum<0)
				sum = 0;
			ans = Math.max(ans,sum);
		}
		
		if(ans==0) { // 모든 원소가 음수인 경우
			Arrays.sort(arr);
			System.out.println(arr[arr.length-1]);
		}else {
			System.out.println(ans);
		}
	}
}
