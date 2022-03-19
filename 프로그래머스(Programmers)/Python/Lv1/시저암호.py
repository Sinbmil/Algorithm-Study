# 프로그래머스 Lv1 - 시저 암호
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12926

# 정확성 테스트 케이스 13개 중 13개 성공
# 총점 100.0

def solution(s, n):
    answer = []
    arr = list(s) 
    # 리스트 형태로 바꿔주기
    for i in arr: 
        if i == ' ':
            answer.append(chr(ord(i)))
            # i가 공백이라면 그대로 공백을 answer에 넣어주기
        else:
            if i.isupper() ==1:
                # i가 대문자가 맞다면
                if ord(i)+n>90:
                    answer.append(chr(ord(i)+n-26))
                    # ord(i)+n의 값이 Z의 아스키코드 90을 초과하면 26을 빼준다음 넣어주기 
                else:
                    answer.append(chr(ord(i)+n))
                    # ord(i)+n의 값이 Z의 아스키코드 90을 초과하지 않으면 그대로 더한 값을 넣어주기
            else:
                # i가 소문자가 맞다면
                if ord(i)+n>122:
                    answer.append(chr(ord(i)+n-26))
                     # ord(i)+n의 값이 z의 아스키코드 122를 초과하면 26을 빼준다음 넣어주기   
                else:
                    answer.append(chr(ord(i)+n))  
                     # ord(i)+n의 값이 z의 아스키코드 122를 초과하지 않으면 그대로 더한 값을 넣어주기
    return "".join(answer)
    # join을 통해서 리스트를 합치기

s = "a B z"
n = 4
print (solution(s,n))
# 출력 결과: "e F d"

