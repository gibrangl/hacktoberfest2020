for i in range(0, 5):
    for x in range(0, 5 - i - 1):
        print(end = " ")
    for y in range(0, 1 + i):
        print("*", end=" ")
    print()
