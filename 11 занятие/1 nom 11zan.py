from tkinter import*
import json
import requests


def saveResult(value):
    file = open("marbar.json", "w")
    file.writelines(json.dumps(value))
def funct():
    username = jsont.get()
    url = f"https://api.github.com/users/{username}"
    user_data = requests.get(url).json()

    keys=['company', 'created_at', 'email', 'id', 'name', 'url']
    result : dict = {}

    for i in range(len(keys)):
        result[keys[i]] = user_data[keys[i]]

    saveResult(result)


    lbl.configure(text = 'Нужные данные заипсаны в файле')

root = Tk()
root.title('Барбашина Мария Назаровна У-222(1)')
root.geometry('1000x1000')
lbl = Label(root,text = 'Напишите имя пользователя github',font = ('Calibri',14))
lbl.grid(column=0,row=0)
btn = Button(root,text = 'открыть',command = funct)
btn.grid(column=2,row=0)
jsont = Entry(root,width=10)
jsont.grid(column=1,row=0)
root.mainloop()
