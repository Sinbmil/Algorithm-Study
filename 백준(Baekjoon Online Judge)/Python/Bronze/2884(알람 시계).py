# 백준 Bronze3 - 2884(알람 시계)
# 문제링크: https://www.acmicpc.net/problem/2884

H, M = map(int, input().split()) # 시와 분을 입력

if M < 45 :	# 분단위가 45분보다 작을 때 
    if H == 0 :	# 0시면
        H = 23
        M += 60
    else :	# 0시가 아니면 (0시보다 크면)
        H -= 1	
        M += 60
        
print(H, M-45)	