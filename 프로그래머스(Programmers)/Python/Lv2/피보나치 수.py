# 프로그래머스 Lv2 - 피보나치 수
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12945

# 정확성 테스트 케이스 14개 중 14개 성공
# 총점 100.0

def solution(n):
    answer = [0,1] # answer 리스트에 0,1을 일단 넣어준다.
    for i in range(2,n+1): # 2부터 n까지 
         answer.append((answer[i-1] + answer[i-2]) %1234567)
         # i-1값과 i-2값을 더한 값을 append를 이용해서 answer에 넣어준다.
    return answer[-1]
    # 제일 마지막에 있는 수를 반환한다.

n = 3
print (solution(n))
# 출력 결과: 2