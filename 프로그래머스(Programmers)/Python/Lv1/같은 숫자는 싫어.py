# 프로그래머스 Lv1 - 같은 숫자는 싫어
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12906

# 정확성 테스트 케이스 17개 중 17개 성공
# 효율성 테스트 케이스 4개 중 4개 성공
# 총점 100.0

def solution(arr):
    answer = []
    answer.append(arr[0]) 
    #answer에 초기값을 arr의 첫 인덱스를 넣어주기
    for i in range(1,len(arr)): 
        # 2번째 인덱스부터 마지막까지 비교
        if arr[i] != arr[i-1]: 
        #연속적으로 똑같지 않으면 answer에 삽입하기
            answer.append(arr[i])
    return answer
    
arr = [1,1,3,3,0,1,1]
print (solution(arr))
# 출력 결과: [1,3,0,1]
