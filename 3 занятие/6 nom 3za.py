str1=int(input('строка1'))
k1=int(input('колонка1'))
str2=int(input('строка2'))
k2=int(input('колонка2'))
def xx(str1, k1):
    return (str1+k1)%2
def yy(str2, k2):
    return (str2+k2)%2
if (xx(str1, k1)==0 and yy(str2, k2)==0) or (xx(str1, k1)==1 and yy(str2, k2)==1):
    print ('да')
else:
    print('нет')
