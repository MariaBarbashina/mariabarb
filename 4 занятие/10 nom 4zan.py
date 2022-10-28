N=int(input())
K=int(input())
def fibon(N,K):
    a=1
    b=1
    k=0
    z=2
    m=N-K+1
    
    while k<N-2:
        su=a+b
        a=b
        b=su
        z+=su
        k=k+1
    print(z)
            
fibon(N,K)
#честно, не могу понять как ввести К, помогите...
