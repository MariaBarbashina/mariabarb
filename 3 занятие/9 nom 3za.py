n=int(input())
m=int(input())
k=int(input())
def f(n,m):
    if ((k%n==0)or(k%m==0)) and k<n*m:
        return 'да'
    else:
        return 'нет'
print (f(n,m))
