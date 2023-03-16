n=int(input())
def f(n):
    s=0
    for i in range(1, n+1):
        c=i**3
        s+=c
    print(s)
f(n)
