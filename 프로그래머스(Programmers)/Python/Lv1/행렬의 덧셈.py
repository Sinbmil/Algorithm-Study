# 프로그래머스 Lv1 - 행렬의 덧셈
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/12950

# 정확성 테스트 케이스 17개 중 17개 성공
# 총점 100.0

def solution(arr1, arr2):
    answer = arr1
    for i in range(len(arr1)):
        for j in range(len(arr1[i])):
            answer[i][j] = arr1[i][j] + arr2[i][j]
            # 이중 반복문을 이용하여 arr1 배열의 값과 arr2 배열의 값을 더하여 배열로 만들어준다.
    return answer

arr1 = [[1,2],[2,3]]
arr2 = [[3,4],[5,6]]
print (solution(arr1,arr2))
# 출력 결과: [[4,6],[7,9]]
