n=int(input())
def f(n):
    d=0
    N=n//2
    c=1
    while c<=N:
        c=c*2
        d+=1
    print(c,d)
        
f(n)
