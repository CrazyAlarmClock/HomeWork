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
            ingredients = coock_book_list[:]







        elif not space:
            ingredients2 = ingredients[:]
            lol.append(ingredients2)

            ingredients.clear()
            coock_book_list.clear()




pprint(names)
pprint(lol)









