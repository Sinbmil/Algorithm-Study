// 백준 Silver4 - 1978(소수 찾기)
// 문제링크: https://www.acmicpc.net/problem/1978

import java.util.*;
public class Test {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // 숫자 개수
	    int num;
	    int count = 0;  // 소수 개수
	    int i,j;
		
	    for(i=0; i<n; i++){
	        num = sc.nextInt();
	        for(j=2; j<=1000; j++){
                    if(num%j == 0)
		        break;
	        }
	        if(num == j)
		    count++; // 소수면 count 1증가
	    }
	    System.out.println(count);
    }
}
