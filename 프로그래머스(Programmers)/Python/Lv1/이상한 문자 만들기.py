# 프로그래머스 Lv1 - 이상한 문자 만들기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12930

# 정확성 테스트 케이스 16개 중 16개 성공
# 총점 100.0

def solution(s):
    answer = ''
    cnt = 0 # 단어 구분을 위한 변수

    for i in s:
        if i == " ": 
        # 공백일 때 그대로 공백을 더해주기
            answer += i
            cnt = 0 
            # 공백후에는 새로운 단어가 나오므로 0으로 초기화 해주기
        elif cnt%2 == 0: 
            answer += i.upper()  # 짝수일 때 대문자로 만들어주기
            cnt += 1
        else:
             answer += i.lower() # 홀수일 때 소문자로 만들어주기
             cnt +=1
    return answer

s = "try hello world"
print (solution (s))
# 출력 결과: TrY HeLlO WoRlD