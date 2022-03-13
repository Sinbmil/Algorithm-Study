# 프로그래머스 Lv1 - 자연수 뒤집어 배열로 만들기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12932

# 정확성 테스트 케이스 13개 중 13개 성공
# 총점 100.0

def solution(n):
    answer = []
    arr = str(n) 
    # 문자열로 강제 타입 변환
    for i in arr: 
        answer.append(int(i)) 
        # answer 배열에 append를 이용해서 정수형태로 하나씩 넣어주기
        
    answer.reverse() 
    # 내림차순으로 정렬하기

    return answer 

n =12345
print (solution(n))
# 출력 결과: [5,4,3,2,1]