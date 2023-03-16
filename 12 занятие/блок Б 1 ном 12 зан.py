
def gen():
    maxa=0
    a=int(input())
    if a==0:
        return 0
    else:
        maxa=max(a,gen())
        return maxa
print(gen())
    
