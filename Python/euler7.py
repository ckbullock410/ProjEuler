import math

def euler7(n):
    count = 3
    focus = 5
    while(count < n+1):
        if (isPrime(focus)):
            count += 1
        focus += 2
    print(focus-2)

def isPrime(x):
    result = True
    myList = [i for i in range(3, math.ceil(math.sqrt(x)) + 1, 2)]
    
    for n in myList:
        if ((x % n) == 0):
            result = False
    return result


euler7(10001)