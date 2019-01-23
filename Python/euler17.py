def euler17():
    total = 0
    for i in range(1000):        
        val = getNums(i, len(str(i)))
        print(i, ": ", val)
        total += val
        print(total)
    total += 11                     # for word 'one thousand'
    print(total)

def getNums(n, len):
    val = 0
    if (len == 1):
        val = number(str(n)[0])
    elif (n > 9 and n < 20):
        val = getTeens(str(n)[1])
    elif (n > 19 and n < 100):
        val = getTensPlace(str(n)[0])
        val += number(str(n)[1])
    elif (len > 2):
        val = number(str(n)[0])
        if (str(n)[1] == '1'):
            val += getTeens(str(n)[2])
        else:
            val += getTensPlace(str(n)[1])
            val += number(str(n)[2])
        val += 7                    #for word hundred
        if (n % 100 != 0):
            val += 3                #if multiple of 100 doesn't need word 'and'
    else:
        print("something didn't work")
    return val
    

def getTeens(x):
    if (x == '0'):
        return 3
    elif (x == '1'):
        return 6
    elif (x == '2'):
        return 6
    elif (x == '3'):
        return 8
    elif (x == '4'):
        return 8
    elif (x == '5'):
        return 6
    elif (x == '6'):
        return 7
    elif (x == '7'):
        return 9
    elif (x == '8'):
        return 8
    elif (x == '9'):
        return 8

def getTensPlace(x):
    if (x == '0'):
        return 0
    elif (x == '2'):
        return 6
    elif (x == '3'):
        return 6
    elif (x == '4'):
        return 5
    elif (x == '5'):
        return 5
    elif (x == '6'):
        return 5
    elif (x == '7'):
        return 7
    elif (x == '8'):
        return 6
    elif (x == '9'):
        return 6

def number(arg):
    if (arg == '0'):
        return 0
    elif (arg == '1'):
        return 3
    elif (arg == '2'):
        return 3
    elif (arg == '3'):
        return 5
    elif (arg == '4'):
        return 4
    elif (arg == '5'):
        return 4
    elif (arg == '6'):
        return 3
    elif (arg == '7'):
        return 5
    elif (arg == '8'):
        return 5
    elif (arg == '9'):
        return 4

euler17()