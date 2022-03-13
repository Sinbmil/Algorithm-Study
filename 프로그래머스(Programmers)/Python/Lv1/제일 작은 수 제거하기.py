# 프로그래머스 Lv1 - 제일 작은 수 제거하기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12935

# 정확성 테스트 케이스 16개 중 16개 성공
# 총점 100.0

def solution(arr):
    answer = []
    if len(arr) != 1: # 배열의 길이가 1이 아닐 때
        arr.remove(min(arr)) # 배열에서 최소값을 제거
        answer = arr # arr배열을 answer로 대입
    else :
        answer = [-1] # 배열의 길이가 1개일 경우 -1을 출력
    return answer

arr = [4,3,2,1]
print (solution(arr))
# 출력 결과: [4,3,2]