a=int(input())
b=int(input())
def f(a,b):
    for i in range(a, b-1,-1):
        if i%2!=0:
            print(i, end=";")
f(a,b)
