# 백준 Bronze2 - 1373(2진수 8진수)
# 문제링크: https://www.acmicpc.net/problem/1373

num = input() # 숫자 입력
res1 = int(num,2) # 2진수를 10진수로 바꾸기
res2 = format(res1,'o') # 10진수를 8진수로 바꾸기
print (res2)