def euler1():
    n = 1000
    store = []
    for i in range(n):
        if (i%5 == 0) | (i%3 == 0):
            store.append(i)
    
    total = 0
    for x in store:
        total += x
    
    print(total)
euler1()
    