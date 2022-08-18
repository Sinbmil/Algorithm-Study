//백준 Silver2 - 1654(랜선 자르기)
//문제링크: https://www.acmicpc.net/problem/1654

import java.util.*;

public class Main {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
	 int K = sc.nextInt(); // 이미 가지고 있는 랜선의 개수
         long N = sc.nextLong(); // 필요한 랜선의 개수
         long arr[] = new long[K];
         long max = 0;
         
         for(int i=0; i<K; i++) {
        	 arr[i] = sc.nextLong();
             max = Math.max(max, arr[i]);
         }
         //이분탐색
         long left = 1; //랜선길이는 최솟값 1로 설정
         long right = max;
         while (left<=right) {
        	 long mid = (left+right)/2;
        	 long sum = 0;
        	 for(int i=0; i<K; i++) { // 자른 개수 합
        		 sum += (arr[i]/mid);
        	 }
        	 if (sum>=N) { //더 많은 랜선 나온 경우 더 크게 잘라야됨
        		 left = mid+1;
        	 } else {
        		 right = mid-1;
        	 }
         }
         System.out.println(right);
	}
}
