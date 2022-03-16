# 프로그래머스 Lv1 - 부족한 금액 계산하기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/82612

# 정확성 테스트 케이스 23개 중 23개 성공
# 총점 100.0

def solution(price, money, count):
    sum = 0
    for i in range(1,count+1): # 1부터 count까지
        sum += price*i 
        # sum에 price와 횟수만큼 곱해준 값을 더해주기
        
    money -= sum # money에서 sum을 빼주기

    if money>0: # money가 양수면 0을 출력
        return 0
    else:
        return abs(money) # 음수면 abs로 절대값 해줘서 리턴

price = 3
money = 20
count = 4
print (solution(price,money,count))
# 출력 결과: 10