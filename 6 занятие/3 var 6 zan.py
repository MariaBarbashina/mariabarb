s=input('введите строку')
def f(s):
    t=0
    s1=''
    for i in range(len(s)):
        if s[i]=='.':
            t=s.count('.')
            s1=s.replace('.','')
            print(s1, t)
            break
            
        
f(s)
