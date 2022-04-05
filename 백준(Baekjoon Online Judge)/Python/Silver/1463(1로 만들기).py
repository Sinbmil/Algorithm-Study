# 백준 Silver3 - 1463(1로 만들기)
# 문제링크: https://www.acmicpc.net/problem/1463

n = int(input())
dp = [0]*(n + 1)	
# dp에 계산된 값을 저장한다.

for i in range(2, n+1):
    dp[i] = dp[i-1]+1
    # 1을 빼준 이유는 계산할 나누기가 1을 뺀 값보다 작거나 큼에 따라 어차피 교체되기 때문이다.
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i//3]+1) 
    if i % 2 == 0:
        dp[i] = min(dp[i], dp[i//2]+1)
    ## 1을 더하는 것은 dp는 결과가 아닌 계산한 횟수를 저장하는 것이기 때문이다.
print(dp[n])