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
    vivod(a)
import os
def getpath(path):
    return os.path.realpath(os.path.join(__file__, '..',path))
def vivod(matr, filename=getpath('barbashinamn_y222_vivod.txt')):
    output=[' '.join(map(str, row)) + '\n' for row in matr ]
    with open(filename, 'w') as file:
        file.writelines(output)
 
    
      
f(a)
            
