// 백준 Silver1 - 1629(곱셈)
// 문제링크: https://www.acmicpc.net/problem/1629

import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		System.out.println(pow(a,b,c));
	}
	
	private static long pow(long a, long b, long c) {
		
		// 제곱이 1인 경우
		if(b==1) 
			return a%c;
		
		// 지수의 절반 값 구하기
		long temp = pow(a,b/2,c);
		
		// 지수가 홀수인 경우
		if(b%2==1) {
			// 먼저 나머지를 취하고 계속해서 곱함
			return temp*temp%c*a%c;
		}else {
			// 짝수인 경우
			return temp*temp%c;
		}
	}	
}
