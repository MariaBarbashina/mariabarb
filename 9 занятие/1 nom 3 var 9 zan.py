
n=int(input())
a=[]
def f(a):
    for i in range(n):
        b=[]
        for j in range(n):
            print('введите [', i,',',j, ']эелемент')
            b.append(int(input()))
        a.append(b)
    for i in range(n):
        for j in range(n):
            print(a[i][j], end=' ')
        print()

    for i in range(n):
        for j in range(n):
            if a[i][j]==a[j][i]:
                print('матрица симметрична')
            else:
                print('матрица несимметрична')
f(a)
