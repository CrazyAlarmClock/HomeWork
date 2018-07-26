from collections import defaultdict
from pprint import pprint
import re

coock_book_list = []
names = []
lol = []
coock_book = {}
ingredients = []


with open('recipes.txt') as file:

    for i, line in enumerate(file):
        line = line.strip()
        line = line.split("|")
        name = re.search(r'[a-яА-ЯёЁ]', str(line))
        space = re.search(r'\w', str(line))

        if  name and len(line)==1:
            names.append(line)

        elif name and len(line)>1:
            tmp = dict()
            tmp['ingridient_name'] = line[0]
            tmp['quantity'] = line[1]
            tmp['measure'] = line[2]
            coock_book_list.append(tmp)
            print("-----------------------------------")
            ingredients_orig = list(ingredients)
            ingredients_orig.append(coock_book_list)
            coock_book_list1 = list(coock_book_list)
            coock_book_list1.append(coock_book_list)

            print("НАШ ТЕКСТ, inegredients = ")
            pprint(ingredients)
            ingredients.clear()


        elif not space:
            ingredients1 = list(lol)
            lol.append(coock_book_list1)

            print("FINAL{{{{{{{")
            coock_book_list.clear()




pprint(coock_book_list1)








