n=int(input())

def f(n):
    for i in range(1, n+1):
        for c in range(1, i+1):
            print(c, sep="", end="")
        print(" ")
f(n)
