N=int(input())
def f(N):
    m=1
    for i in range(1,N+1):
        s=N[i]+N[i+1]
        m=m+s
        #for c in range(i, i+1):
            #s=i+(i+1)
            #m=m+s
    print(m)
f(N)
