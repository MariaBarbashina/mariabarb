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
def output(a, output='Барбашина_МН_У222_vvod.txt'):
    with fst('w', output):
        fst.push(a[i])
def input(input='Барбашина_МН_У222_vvod.txt'):
    with ist('r', input):
        ist.pop()
        ist.format
output(a, output='Барбашина_МН_У222_vvod.txt')
input(input='Барбашина_МН_У222_vvod.txt')
f(a)

