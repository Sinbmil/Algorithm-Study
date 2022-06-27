// 백준 Silver3 - 3273(두 수의 합)
// 문제링크: https://www.acmicpc.net/problem/3273

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr); // 정렬하기
     
        int target = sc.nextInt();
        
        int sum = 0;
        int cnt = 0;
        int end = num-1;
        int start = 0;

        while(start<end) {
            if (arr[start] + arr[end] == target) {
            	cnt++;
                start++;
                end--;
            } else if (arr[start] + arr[end] < target)
                start++;
            else
                end--;
        }
        System.out.println(cnt);
	}
}