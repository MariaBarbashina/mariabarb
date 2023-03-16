x=int(input())
y=int(input())
def f(x,y):
    c=1
    while x<y:
        x=x+(x*0.1)
        c+=1
    print(c)
        
f(x,y)
