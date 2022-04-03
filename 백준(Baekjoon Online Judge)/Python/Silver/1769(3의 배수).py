# 백준 Silver5 - 1769(3의 배수)
# 문제링크: https://www.acmicpc.net/problem/1769

num = input()
cnt = 0 # 횟수를 알려주는 변수

while len(num)>1: # num 길이가 1보다 클 때까지 반복
    cnt+=1 # cnt 1 증가
    answer=0
    for i in num:
        answer+=int(i) # answer에 num 한 글자씩 int로 변환해서 더해주기
    num =str(answer) # 더해진 answer를 num에 대입

print(cnt) # 횟수 출력

if int(num)%3 ==0: # 3의 배수면 YES출력 아니면 NO출력
      print("YES")
else:
       print("NO")