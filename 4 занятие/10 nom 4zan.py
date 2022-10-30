N=int(input())
K=int(input())
def fibon(N,K):
    a=1
    b=1
    k=0
    z=2
    a1=1
    b1=1
    k1=0
    z1=2
    while k<N-2:
        su=a+b
        a=b
        b=su
        z+=su
        k+=1
        while k1<K-3:
            su1=a1+b1
            a1=b1
            z1+=su1
            k1+=1
    print(z-z1)
            
fibon(N,K)
#помогите, получается с погрешностью в +-1...
