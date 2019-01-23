def euler2():
    x = 1
    total = 0
    copy = 0
    past = 0
    while x < 4000000:
        copy = x
        if x%2 == 0:
            total += x
        x = x + past
        past = copy
    print(total)

euler2()
        
        