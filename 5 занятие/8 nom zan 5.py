n=int(input())
def f(n):
    c=0
    while n!=0:
        x=int(input())
        if n==x and x!=0:
            c+=1
        n=x
    print(c)
f(n)
