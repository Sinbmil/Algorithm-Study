# 백준 Bronze2 - 2920(음계)
# 문제링크: https://www.acmicpc.net/problem/2920

num = list(map(int, input().split()))
 
if num == sorted(num): # 오름차순 정렬
    print('ascending')
elif num == sorted(num, reverse=True): # 내림차순 정렬
    print('descending')
else:
    print('mixed') # 그 외