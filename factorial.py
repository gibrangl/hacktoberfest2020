n = int(input("Enter a no you want factorial of: "))
fac = 1
# for i in range(1,n+1):
#     fac = fac * i


while n >= 1:
    fac = fac * n
    n -= 1


print(fac)
