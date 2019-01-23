def euler4():
    largest = 0
    for x in range(100, 1000):
        for i in range(100, 1000):
            if isPalindrome(x*i) and (x*i) > largest:
                largest = x*i
    print(largest)

def isPalindrome(n):
    target = str(n)
    for x in range(0, (len(target)//2)):
        opp = len(target) - x - 1
        if target[x] == target[opp]:
            continue
        else:
            return False
            return True

euler4()
