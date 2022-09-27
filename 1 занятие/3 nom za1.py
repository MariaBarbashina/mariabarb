age=int(input('введите возраст'))
name=str(input('введите имя'))
if 0<age<75:
    print('True')
if (age>=16 and name != 'Иван'):
    print('поздравляем вы поступили во ВГУИТ')
if age>=16 and name=='Иван':
    print('Иванам нельзя')
if age<16 and name!='Иван':
    print('сначала нужно закончить школу')
if age<16 and name=='Иван':
    print('Вы не подходите по всем параметрам')

a=0
if age<16:
    a=18-age
    print('Вам учиться в школе еще', a)
