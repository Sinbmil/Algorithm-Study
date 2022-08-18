// 백준 Silver4 - 1065(한수)
// 문제링크: https://www.acmicpc.net/problem/1065

import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //숫자 N입력
		int cnt = 0;          //한수 개수 카운트
		
		for (int i=1; i<=N; i++) { 
			if (i <= 99) { //1~99까지는 모두 한수이므로 카운트 증가
				cnt += 1;
			} else if (i <= 999) { //100부터는 조건을 확인해서 한수 조건을 충족하면 +1
				String[] num = Integer.toString(i).split(""); //각 자리수를 자정할 문자열 배열 생성.
				//백의자리 십의자리 일의자리를 각각 a, b, c라고 생각하고 b-a == c-b 이면 한수이므로 +1
				if ((Integer.parseInt(num[1]) - Integer.parseInt(num[0])) == (Integer.parseInt(num[2])- Integer.parseInt(num[1]))) { 
					cnt += 1;
				}
			}
		}
		System.out.println(cnt);
    }
}
