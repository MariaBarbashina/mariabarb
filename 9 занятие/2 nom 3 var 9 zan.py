
n=int(input())
m=int(input())
a=[]
def f(a):
    for i in range(n):
        b=[]
        for j in range(m):
            print('введите [', i,',',j, ']эелемент')
            b.append(int(input()))
        a.append(b)
        
    for i in range(n):
        for j in range(m):
            print(a[i][j], end=' ')
        print()
        
    maxValue = 0
    for i in range(n):
        for j in range(m):
            if a[i][j] > maxValue:
                 maxValue = a[i][j]

    a[0][0] = maxValue
            
    print(a, end=' ')
        
f(a)
            
