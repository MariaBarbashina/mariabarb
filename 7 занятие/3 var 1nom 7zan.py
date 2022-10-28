n=int(input('длина массива\n'))
D=[]
def f(D):
    s=0
    for i in range(n):
        print ('введите',i,'элемент')
        D.append(int(input()))
    for i in range(n):
        if i%2!=0:
            s+=D[i]
    print(D, s)
f(D)
                 
                 
                 
        
