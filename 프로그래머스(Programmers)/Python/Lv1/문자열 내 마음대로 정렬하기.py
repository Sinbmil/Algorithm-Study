# 프로그래머스 Lv1 - 문자열 내 마음대로 정렬하기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12915

# 정확성 테스트 케이스 12개 중 12개 성공
# 총점 100.0

def solution(strings, n):
    answer = []
    for i in range(len(strings)): 
        strings[i] = strings[i][n] + strings[i] 
        # strings[i]에 strings[i][n]을 맨 앞에다가 더한다.

    strings.sort() # 정렬하기

    for j in range(len(strings)):
        answer.append(strings[j][1:])
        # answer에 strings[j][1:]를 append한다.
        # 1부터 넣으므로 맨 앞글자를 제외된다.
    return answer

strings = ["sun", "bed", "car"]
n = 1
print(solution(strings,n))
# 출력 결과: ["car", "bed", "sun"]
