# 프로그래머스 Lv2 - 최댓값과 최솟값
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12939

# 정확성 테스트 케이스 12개 중 12개 성공
# 총점 100.0

def solution(s):
    arr = list(map(int, s.split(' '))) # 공백을 기준으로 분리하고 int형 리스트로 만들어주기
    return str(min(arr)) + " " + str(max(arr)) # 최소값과 최대값 반환

s = "1 2 3 4"
print (solution(s))
# 출력 결과: "1 4"