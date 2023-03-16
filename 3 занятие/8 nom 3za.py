n=int(input())
c=int(input())
b=int(input())
def bi(n,c,b):
    if n==c and c==b:
        return '3'
    elif n==c or c==b or b==n:
        return '2'
    else:
        return '0'
print(bi(n,c,b))
