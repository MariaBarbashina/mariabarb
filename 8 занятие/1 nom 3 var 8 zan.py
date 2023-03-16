import math
a=int(input())
b=int(input())
x=int(input())
y=int(input())
def f(a,b):
    c1=math.sqrt(a**2+b**2)
    return c1
def f1(x,y):
    c2=math.sqrt(x**2+y**2)
    return c2
#f(a,b)
#f(x,y)
if f(a,b) > f1(x,y):
    print('c1=',f(a,b),'>  c2=',f1(x,y))
elif f(a,b) < f1(x,y):
    print('c1=',f(a,b),'<  c2=',f1(x,y))
else:
    print('c1=',f(a,b),'==  c2=',f1(x,y))
