// 백준 Silver5 - 1789(수들의 합)
// 문제링크: https://www.acmicpc.net/problem/1789

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long sum = 0;
		int startNum = 0;
		
		for(int i=1; ; i++) {
			if(sum > num)	
				break;
			sum += i;
			startNum ++;
		}
		System.out.println(startNum-1);
	}
}
