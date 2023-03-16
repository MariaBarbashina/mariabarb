#3

h=0
def vr(n):
    if 0<n<=59:
        return n
    if n>59:
        return n%60
def ch(n):
    if 0<n<=59:
        return 0
    if n>59:
        return n%(60*24)//60
    
print(ch(1500), vr(1500))
