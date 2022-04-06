# 프로그래머스 Lv2 - 큰 수 만들기
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/42883

# 정확성 테스트 케이스 12개 중 12개 성공
# 총점 100.0

def solution(number,k):
    stack = []
    for i in number:
        while len(stack)>0 and stack[-1]<i and k>0:
        # 스택에 원소가 존재하고 마지막 원소가 순회하는 i보다 작고 k가 0보다 크면
            stack.pop()
            k -= 1
            # 마지막 원소를 빼고 k를 1줄인다.
        stack.append(i)
        # 스택에 순회하는 i를 추가한다.
    if k != 0:
       stack = stack[:-k]
       # k가 0이 아니면 k개수를 뺀 나머지를 스택에 저장한다.
    return ''.join(stack)
    # join을 이용해서 stack을 이어붙인다.

number = "1924"
k = 2
print (solution(number,k))
# 출력 결과: 94
