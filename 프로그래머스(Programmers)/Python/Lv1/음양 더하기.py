# 프로그래머스 Lv1 - 음양 더하기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/76501

# 정확성 테스트 케이스 9개 중 9개 성공
# 총점 100.0

def solution(absolutes, signs):
    answer = 0
    for i in range(len(absolutes)): # absolutes의 길이까지
        if signs[i]: #signs[i]인 경우 true가 됨
            answer += absolutes[i]
            # answer에 absolutes[i]를 더하기
        else:
            answer -= absolutes[i]
            # False인 경우 answer에 absolutes[i]를 빼기
    return answer

absolutes = [4,7,12]
signs = [True,False,True]
print (solution(absolutes,signs))