class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int answer[] = new int[2];
        int match = 0;  // 맞춘 번호
		int zero = 0;   // 알아 볼 수 없는 번호
        
		 for(int lotto : lottos){ // 번호를 알아볼 수 없는 경우
			 if(lotto == 0){
				 zero++;
				 }else {
					 for(int lotto2 : win_nums){
						 if(lotto == lotto2){
							 match++;
							 break;
							 }
						 }
					 }
			 }
        
        answer[0] = (match+zero) > 1 ? 7-(match+zero) : 6;    // 최고 등수
        answer[1] = match > 1 ? 7-match : 6;                  // 최저 등수
        return answer;
    }
}