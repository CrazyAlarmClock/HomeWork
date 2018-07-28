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
if __name__ == '__main__':
    sql = (glob.glob('/Users/pavelmalysev/Documents/GitHub/HomeWork/netology_py/2.3/Migrations/*.sql'))
while check == 1:
    input_list.append(input("Введите строку:"))
    for num, i in enumerate(sql):
        with open(sql[num]) as file:
            for f, line in enumerate(file):
                line = line.strip()
                #true_list.append(line)
                if line == "UPDATE":   #тут беда
                    i.split('/')
                    file_name = i.split('/')[-1]
                    if replicant != file_name:
                        replicant = file_name
                        pprint(file_name)
                        count += 1
                        #true_list.append(line)


    pprint("найдено файлов: {}".format(count))



pprint(input_list)
pprint(len(true_list))

