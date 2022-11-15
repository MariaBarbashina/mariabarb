import os
def getpath(path):
    return os.path.realpath(os.path.join(__file__, '..',path))
def vvod(filename=getpath('barbashinamn_y222_vvod.txt')):
    matr=[]
    with open(filename, 'r') as file:
        for line in file:
            matr.append(line[:-1].split(' '))
    return matr


a=[]
def f(a):
    a = vvod()
    for i in range(len(a[0])):
        for j in range(len(a)):
            print(a[i][j], end=' ')
        print()

    for i in range(len(a[0])):
        for j in range(len(a)):
            if a[i][j]==a[j][i]:
                pass
            else:
                print('матрица несимметрична')
                return
    print('матрица симметрична')
f(a)

