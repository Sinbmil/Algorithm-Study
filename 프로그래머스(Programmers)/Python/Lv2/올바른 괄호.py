# 프로그래머스 Lv2 - 올바른 괄호
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12909

# 정확성 테스트 케이스 18개 중 18개 성공
# 효율성 테스트 케이스  2개 중  2개 성공
# 총점 100.0

def solution(s):
    answer = True
    arr = []   # 올바른 괄호인지 판단할 리스트
  
    for i in s:
        if i == '(':  # 현재 괄호가 '('이면 arr에 넣어주기
            arr.append(i) 
        else: # 현재 괄호가 ')'이면
            if arr == []: # 비어있으면 False 반환
                answer = False
                break
            else:
                arr.pop() # arr의 맨끝에 괄호를 빼기

    if arr != []: # 비어있지 않으면 False 반환
        answer = False

    return answer

s = "(())()"
print (solution(s))
# 출력 결과: true
