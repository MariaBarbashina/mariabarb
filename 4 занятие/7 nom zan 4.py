n=int(input())
def f(n):
    s=1
    c=0
    for i in range(1, n+1):
        s=s*i
        c=c+s
    print(c)
f(n)
