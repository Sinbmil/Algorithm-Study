// 백준 Silver4 - 1920(수 찾기)
// 문제링크: https://www.acmicpc.net/problem/1920

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 숫자 개수
	
		int A[] = new int[num];

		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A); // A 정렬
		
		int num2 = sc.nextInt();
		
		for(int i =0; i<num2; i++) {
			int ans=0, low=0, high=num-1;
			int key = sc.nextInt();
			while(low<=high) {
				int mid = (low+high)/2;
				if(A[mid]==key) {
					ans=1;
					break;
				}
				  if(A[mid]>key) 
					  high = mid-1;
                                  else 
                	                  low = mid+1;
			}
			System.out.println(ans);
		}
	}
}
