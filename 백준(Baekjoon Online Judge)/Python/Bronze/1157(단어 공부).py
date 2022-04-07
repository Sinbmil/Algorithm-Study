# 백준 Bronze1 - 1157(단어 공부)
# 문제링크: https://www.acmicpc.net/problem/1157

word = input().upper() # 단어를 대문자로 바꿔주기
word_list= list(set(word)) # set을 사용해 중복 값 제거

cnt=[]
for i in word_list:
    count = word.count
    cnt.append(count(i)) # count 숫자를 리스트에 append

if cnt.count(max(cnt))>1: # count 숫자 최대값이 중복되면 물음표 출력
    print("?")
else:
    print(word_list[(cnt.index(max(cnt)))]) # 많이 사용된 알파벳 출력