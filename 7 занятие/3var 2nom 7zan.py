x=[]
def f(x):
    for i in range(8):
        print('введите',i,'элемент')
        x.append(int(input()))
    for i in range(len(x)):
        if x[i]<15:
            x[i]*=2
    print(x)
            
f(x)
