def euler6():
    hold1 = sumSquares(100)
    hold2 = squareSums(100)
    answer = hold2 - hold1
    print(answer)

def sumSquares(x):
    result = 0
    for i in range(0, x+1):
        result += i*i
    return result

def squareSums(x):
    result = 0
    for i in range(0, x+1):
        result += i
    result *= result
    return result

euler6()