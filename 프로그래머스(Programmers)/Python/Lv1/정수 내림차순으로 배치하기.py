# 프로그래머스 Lv1 - 정수 내림차순으로 배치하기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12933

# 정확성 테스트 케이스 16개 중 16개 성공
# 총점 100.0

def solution(n):
    answer = list(str(int(n))) #문자열을 정수형태의 리스트로 바꿔주기
    answer.sort(reverse = True) # 내림차순으로 정렬하기
    return int("".join(answer)) # join으로 리스트를 합치고 정수형태로 반환

n = 118372
print (solution (n ))
# 출력 결과: 873211