def euler16():
    total = 0
    value = 2 ** 1000
    val = str(value)
    for i in range(len(val)):
        total += int(val[i])
    
    print(total)

euler16()