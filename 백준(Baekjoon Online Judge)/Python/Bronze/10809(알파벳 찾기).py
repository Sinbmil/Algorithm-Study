# 백준 Bronze2 - 10809(알파벳 찾기)
# 문제링크: https://www.acmicpc.net/problem/10809

S = input()
abc ='abcdefghijklmnopqrstuvwxyz'

for i in abc:
    if i in S:
        print(S.index(i), end= ' ')
    else:
        print( -1, end =' ')