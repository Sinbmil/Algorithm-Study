# 프로그래머스 Lv1 - 직사각형 별찍기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12969

# 정확성 테스트 케이스 11개 중 11개 성공
# 총점 100.0

def solution(a,b):
    for i in range(b):
            print("*"*a)

a, b = map(int, input().strip().split(' '))
solution(a,b)
