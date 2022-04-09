# 백준 Bronze2 - 2675(문자열 반복)
# 문제링크: https://www.acmicpc.net/problem/2675

n = int(input())
for i in range(n):
    num, s = input().split() # split으로 분리하기
    text = ''
    for i in s:
        text += int(num) * i
    print(text)