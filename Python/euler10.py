import math

def euler10():
    answer = 2
    primeList = [i for i in range(3, 2000000, 2)]
    for n in range(len(primeList)):
        if (primeList[n] == 0):
             continue
        for x in range(n + primeList[n], len(primeList), primeList[n]):
            primeList[x] = 0

    for x in primeList:
        answer += x
    print(answer)

euler10()




