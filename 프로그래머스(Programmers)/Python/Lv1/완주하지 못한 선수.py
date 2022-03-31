# 프로그래머스 Lv1 - 완주하지 못한 선수
# 문제링크: https://programmers.co.kr/learn/courses/30/lessons/42576

# 정확성 테스트 케이스 5개 중 5개 성공
# 효율성 테스트 케이스 5개 중 5개 성공
# 총점 100.0

def solution(participant, completion):
    answer=""
    participant.sort() # 참가자 정렬
    completion.sort() # 완주자 정렬
    completion.append(0) # 비교하려면 수가 맞아야 하므로 완주자에 0추가
    for i in range(0,len(completion)):
        if participant[i] != completion[i]: # 참가자와 완주자의 i번째가 다를 때
            answer=participant[i] # answer에 참가자 i번째 추가
            return answer

participant = ["leo", "kiki", "eden"]
completion = ["eden", "kiki"]
print (solution(participant,completion))
# 출력 결과: "leo"
