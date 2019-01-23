import timeit
import math

def euler12():
    triNum = 1
    total = 0
    while(True):
        total += triNum
        triNum += 1
        count = numberFactors(total)
        if (count > 500):
            print(total)
            break
        


def numberFactors(x):
    num = x
    twoCount = 0
    #get prime factorization
    while (num % 2 == 0):
        twoCount += 1
        num = num/2

    primes = [twoCount]

    for i in range(3, math.ceil(math.sqrt(num)), 2):
        value = 0
        while (num % i == 0):
            value += 1
            num = num/i
        if (value != 0):
            primes.append(value)

    #multiply exponents of each factor+1 by each other and return
    total = 1
    for n in primes:
        total *= n + 1
    return total

        
start = timeit.default_timer()

euler12()

stop = timeit.default_timer()

print (stop - start)
