# 프로그래머스 Lv1 - 나누어 떨어지는 숫자 배열
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12910

# 정확성 테스트 케이스 16개 중 16개 성공
# 총점 100.0

def solution(arr,divisor):
    answer = []
    for i in arr:
        if i%divisor == 0:
            answer.append(i)
            # arr의 i가 divisor을 나눈 나머지가 0이면 answer에 i를 더해주기
    if len(answer) == 0:
        answer.append(-1)
        # answer의 길이가 0이면 -1을 넣어주기
    else:
        answer.sort()
        # answer 리스트 정렬하기
    return answer

arr = [5,9,7,10]
divisor = 5
print (solution(arr,divisor))
# 출력 결과: [5,10]