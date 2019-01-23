import math
#This program finds the biggest prime factor of the argument entered into euler3
factors = []
def euler3(n):
    numb = n
    for x in range(3, int(math.sqrt(numb))+1):
        if numb % x == 0:
            check = checkPrime(x)
            if check:
                factors.append(x)
                other = n//x
                if checkPrime(other):
                    factors.append(other)
                    break;
                euler3(other)
            else:
                euler3(x)
            
def checkPrime(n):
    for x in range(2, int(math.sqrt(n)) + 1):
        if n%x == 0:
            return False
    return True
def findBiggest():
    biggest = 0
    for x in factors:
        if x > biggest:
            biggest = x
    return biggest
euler3(600851475143)
print(findBiggest())