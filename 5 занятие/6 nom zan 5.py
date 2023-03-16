
n=int(input())
def f(n):
    c=0
    b=0
    while n!=0:
        c=c+n
        b+=1
        n=int(input())
    print(c/b)
f(n)
