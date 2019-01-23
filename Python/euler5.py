def euler5():
    focus = 1
    works = False
    while not works:
        for x in range(2, 21):
            works = True
            if (focus % x) != 0:
                works = False
                focus *= lcm(focus, x)
                break 
    print(focus)

def lcm(n, k):
    done = False
    num = n
    i = 1
    while not done:
        if (num*i) % k != 0:
            i += 1
            continue
        return i

euler5()