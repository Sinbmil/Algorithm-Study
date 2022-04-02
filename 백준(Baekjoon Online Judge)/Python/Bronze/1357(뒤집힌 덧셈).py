# 백준 Bronze1 - 1357(뒤집힌 덧셈)
# 문제링크: https://www.acmicpc.net/problem/1357

a,b = input().split()
a = int(a[::-1]) # a 뒤집어주기
b = int(b[::-1]) # b 뒤집어주기
print(int(str(a+b)[::-1])) # a+b 후 뒤집어주기