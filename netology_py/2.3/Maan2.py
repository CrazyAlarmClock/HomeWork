import os
from pprint import pprint
import glob
import re

replicant = ' '
count = 0
input_list = []
true_list = []
check = 1
current_dir = os.path.dirname(os.path.abspath(__file__))
kukushka = set();
if __name__ == '__main__':
    sql = (glob.glob('/Users/pavelmalysev/Documents/GitHub/HomeWork/netology_py/2.3/Migrations/*.sql'))
while check == 1:
    temp = set();
    # input_list.append(input("Введите строку:"))
    c = input("Введите строку:")
    for num, i in enumerate(sql):
        with open(sql[num]) as file:
            for f, line in enumerate(file):
                line = line.strip()
                #true_list.append(line)
                if line == c: #тут беда
                    i.split('/')
                    file_name = i.split('/')[-1]
                    if replicant != file_name:
                        #print(file_name)

                        replicant = file_name
                        count += 1
                        temp.add(file_name);
                        #true_list.append(line)

    if (len(kukushka) == 0):
        kukushka = temp;
    else:
        kukushka = kukushka & temp;
    pprint("______________________________")
    pprint("найдено файлов: {}".len(temp));
    count =0




