# 프로그래머스 Lv1 - 없는 숫자 더하기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/86051

# 정확성 테스트 케이스 9개 중 9개 성공
# 총점 100.0

def solution(numbers):
    answer = 0
    for i in range(0,10): # 0부터 9까지
        if i not in numbers: # numbers 리스트의 존재하지 않을 때
            answer +=i # i의 값을 answer에 더해주기
    return answer

numbers = [1,2,3,4,6,7,8,0]
print (solution(numbers))
# 출력 결과: 14