// 백준 Silver5 - 1475(방 번호)
// 문제링크: https://www.acmicpc.net/problem/1475

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = 0;
		int[] arr = new int[10]; // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 담기
		int number = num;
		
		while(number>0) {         // num이 0보다 클 때까지
			int k =number%10;     
			if(k==6 || k==9) { // 6이나 9일때 arr[9] 증가
				arr[9]++;
			}
			else {
				arr[k]++;     // arr[k] 증가
			}
			number /= 10;
		}
		
		int max = 0;         // 0~8까지의 숫자중 최대값 변수
		for(int i=0; i<arr.length-1; i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
		}
		
		int six_nine = 0;  // 6 또는 9
		
		if(arr[9]%2 == 0) {  // 짝수 홀수 구분
			six_nine = arr[9]/2;
		}
		else {
			six_nine = arr[9]/2+1;
		}

		ans = (int) Math.max(max, six_nine); // 둘 중의 최대값 구하기
		if(num==0) 
			ans = 1;
		System.out.println(ans);
    }
}
