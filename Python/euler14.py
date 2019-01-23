
dict = {}

def euler14():
    chainLength = 0
    top = 0
    topNum = 0
    for i in range(2, 1000000):
        print(i)
        chainLength = chainLen(i)
        if (chainLength > topNum):
            topNum = chainLength
            top = i
        dict[str(i)] = chainLength
        chainLength = 0
    print(top)


def chainLen(x):
    chainLength = 0
    target = x
    flag = False
    while(target != 1):
        chainLength, flag = checkDict(target, chainLength)
        if (flag):
            break
        if (target % 2 == 0):
            target = target/2
            chainLength += chainLen(target)
            target = 1
        else:
            target = 3*target + 1
            chainLength += chainLen(target)
            target = 1
        chainLength += 1
    return chainLength


def checkDict(x, chainLength):
    flag = False
    if str(x) in dict:
        print("works")
        chainLength += dict[str(x)]
        flag = True
    return chainLength, flag

euler14()