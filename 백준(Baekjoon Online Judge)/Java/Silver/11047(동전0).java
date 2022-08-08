// 백준 Silver4 - 11047(동전0)
// 문제링크: https://www.acmicpc.net/problem/11047

import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		int coin[] = new int[N];
		for(int i =0; i<coin.length; i++) {
			coin[i] = sc.nextInt();
		}
		
		for(int i=N-1; i>=0; i--) {
			if(coin[i]<=K) {
				cnt += (K/coin[i]);
				K=K%coin[i];
			}
		}
		System.out.println(cnt);
	}	
}
