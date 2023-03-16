#4 nom
a=int(input())
b=int(input())
l=int(input())
N=int(input())

def ras(a, b, l, N):
    return (a*N*2-a)+((b*(N-1))*2)+2*l
print(ras(a, b, l, N))
