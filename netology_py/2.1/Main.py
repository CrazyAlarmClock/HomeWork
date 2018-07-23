from collections import defaultdict
from pprint import pprint
import re

coock_book = []
coock_book_list = []
names = []
ingredients = []

with open('recipes.txt') as file:
    for i, line in enumerate(file):
        line = line.strip()
        line = line.split('|')
        coock_book_list.append(line)

# print(coock_book_list)

for j, i in enumerate(coock_book_list):

    if len(i) >= 2:
        tmp = dict()
        tmp['ingridient_name'] = i[0]
        tmp['quantity'] = i[1]
        tmp['measure'] = i[2]
        ingredients.append(tmp)

    elif not('')  in i and not ('3') in i and not ('3') in i and not ('4') in i and not ('5') in i and not ('6') in i and not ('7') in i and not ('8') in i and not ('9') in i:
         names.append(i)


# keys[i]: values[i] for i in range(len(keys))

# pprint(ingredients)
dictionary = dict(zip(names, ingredients))
pprint(dictionary)
