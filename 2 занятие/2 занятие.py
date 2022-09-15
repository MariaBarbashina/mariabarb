#3 nom 2zan
import math
x=3.74*10**(-2)
y=-0.825
z=0.16*10**2
c=math.sin(x+y)**2
v=abs((x-(2*y))/(1+x**2*y**2))
q=math.cos(math.atan(1/z))**2
s=(((1+c)/v)*x**(abs(y)))+q
print(round(s,5))
