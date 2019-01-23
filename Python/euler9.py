import math

def euler9():
    for i in range(1, 500):
        for j in range(1, 500):
            c = math.sqrt((i*i) + (j*j))
            if ((i + j + c) == 1000):
                result = int(i*j*c)
                print("Result: ", result)
                return

euler9()