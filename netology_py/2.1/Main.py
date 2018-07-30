from collections import defaultdict
from pprint import pprint
import re
# немножко не успел доделатье еще! скоро допшу до конца. изините за такой код :D 
names = []
result =[]
ingredients3 = []
def coockBoock():
    coock_book_list = []
    coock_book = []
    with open('recipes.txt') as file:
        for i, line in enumerate(file):
            line = line.strip()
            line = line.split("|")
            name = re.search(r'[a-яА-ЯёЁ]', str(line))
            space = re.search(r'\w', str(line))
            if name and len(line) == 1:
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
                ingredients3.append(ingredients2)
                ingredients.clear()
                coock_book_list.clear()
        coock_book_all = list(zip(names, ingredients3))
    for i, j in enumerate(coock_book_all):
        coock_book.append(dict(zip(names[i], ingredients3[i:])))
    return [coock_book , names, ingredients3]


def get_shop_list_by_dishes(dishes):
    all_items = coockBoock()
    for i, item in enumerate(all_items[1]):
        if dishes in item:
            pprint(ingredients3[i])

all_items = coockBoock()
pprint(all_items[0])
get_shop_list_by_dishes('Омлет')
