n=int(input('год'))
def god(n):
    if (n%4==0 or n%400==0) and n%100!=0:
        return 'да'
    else:
        return 'нет'
print(god(n))
