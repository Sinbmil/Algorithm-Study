# 프로그래머스 Lv2 - JadenCase 문자열 만들기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12951

# 정확성 테스트 케이스 18개 중 18개 성공
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
            if cnt == 0:
                answer += i.upper()
                # cnt=0일때 대문자로 만들어서 answer에 더하기
                cnt +=1
                # cnt를 1을 더하면 이제는 0이 아니므로 소문자로 전환
            else:
                answer += i.lower()
                cnt +=1
                # 나머지는 소문자로 만들어서 answer에 더하기
        else:
            answer += i.lower()
            cnt +=1
            # 그 외는 소문자로 answer에 더하기
            
    return answer

s = "3people unFollowed me"
print (solution(s))
# 출력 결과: 3people UnFollowed Me
