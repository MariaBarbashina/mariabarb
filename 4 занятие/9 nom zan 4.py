N=int(input())
def fibon(N):
    a=1
    b=1
    k=0
    z=2
    while k<N-2:
        su=a+b
        a=b
        b=su
        z+=su
        k=k+1
    print(z)
            
fibon(N)
