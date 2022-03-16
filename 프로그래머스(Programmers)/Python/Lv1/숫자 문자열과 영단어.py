# 프로그래머스 Lv1 - 숫자 문자열과 영단어
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/81301

# 정확성 테스트 케이스 10개 중 10개 성공
# 총점 100.0

def solution(s):
    number = {'zero':0, 'one':1, 'two':2, 'three':3, 'four':4, 'five':5,
              'six':6, 'seven':7, 'eight':8, 'nine':9}
              # 각 숫자마다 딕셔러니화 해주기
    for i in number: # i부터 number까지
        s = s.replace(i,str(number[i])) 
        # 존재하면 replace를 통해서 대체해주기
    return int(s) # int화 해주기

s = "one4seveneight"
print (solution(s))
# 출력 결과: 1478