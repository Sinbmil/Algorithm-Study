# 백준 Bronze2 - 3052(나머지)
# 문제링크: https://www.acmicpc.net/problem/3052

num_list =[]
for i in range(10):
    num = int(input())
    num_list.append(num%42) # 42로 나누었을 때 나머지 append하긴

num_list = set(num_list) # set로 중복제거
print(len(num_list))