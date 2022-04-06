// 백준 Bronze2 - 2309(일곱 난쟁이)
// 문제링크: https://www.acmicpc.net/problem/2309

import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[9];
		int sum = 0;
		int fake1 = 0, fake2=0;
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt(); // 난쟁이 키 입력
			sum += arr[i]; // sum:난쟁이 키들의 합계
		}
		
		Arrays.sort(arr); // 오름차순으로 정렬하기
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(sum - arr[i]-arr[j] == 100){
				//9명의 키의 합에서 2명을 뺐을 때 100이 될 때
				//그 수를 fake1과 fake2에 넣어준다.
					fake1 = i;
					fake2 = j;
					break;
				}
			}
		}

		
		for(int i = 0; i<arr.length; i++) { // 진짜 난쟁이 키 출력
			if(i == fake1 || i == fake2)    // i가 fake1이거나 fake2 경우 생략
				continue;
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
