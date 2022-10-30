n=int(input())
def f(n):
    c=0
    maxd=0
    while n!=0:
        x=int(input())
        if n==x and x!=0:
            c+=1
        else:
            maxd=max(maxd, c)
            c=1
            
        n=x
    print(maxd)
f(n)
