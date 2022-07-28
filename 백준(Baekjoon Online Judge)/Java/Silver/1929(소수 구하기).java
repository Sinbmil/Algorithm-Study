// 백준 Silver3 - 1929(소수 구하기)
// 문제링크: https://www.acmicpc.net/problem/1929

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int num1 = sc.nextInt();   // 첫 번째 숫자 입력
       	 	int num2 = sc.nextInt();   // 두 번째 숫자 입력
        	boolean flag[] = new boolean[num2+1];
        	flag[0] = flag[1] = true;  // 0과 1은 소수에서 제외
        
        	// 에라토스테네스의 체 사용
        	for(int i=2; i<=num2; i++) {
        		if(flag[i] == false) {
        			if(i>=num1)
        				System.out.println(i);
        			for(int j= i+i; j<=num2; j+=i)
        				flag[j] = true;
        		}
        	}
    }
}
