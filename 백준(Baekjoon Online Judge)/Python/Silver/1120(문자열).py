# 백준 Silver4 - 1120(문자열)
# 문제링크: https://www.acmicpc.net/problem/1120

a,b = input().split() # 문자열 입력

answer = []
for i in range(len(b)-len(a)+1): # b의 길이에서 a의 길이를 빼고 +1
    cnt = 0
    for j in range(len(a)):
        if a[j] != b[i+j]: # 비교했을 때 a와 b가 같지 않은경우
            cnt += 1       # cnt 1씩 증가
    answer.append(cnt)     # answer에 append를 이용해서 추가

print(min(answer)) # answer 중 최소값 출력