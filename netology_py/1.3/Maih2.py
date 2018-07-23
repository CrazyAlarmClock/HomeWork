#!/usr/bin/env python
# -*- coding: utf-8 -*-

documents = [
    {"type": "passport", "number": "2207 876234", "name": "Василий Гупкин"},
    {"type": "invoice", "number": "11-2", "name": "Геннадий Покемонов"},
    {"type": "insurance", "number": "10006", "name": "Аристарх Павлов"}
]

directories = {
    '1': ['2207 876234', '11-2'],
    '2': ['10006'],
    '3': []
}


def people(names):
    enter_number = str(input("Ввидите число"))
    for name in names:
        if enter_number == name['number']:
            print(name['name'])

        else:
            print("данный номер документа не найден ")
    return names


# people(documents)


def list(names):
    for name in names:
        print('{} "{}" "{}"'.format(name['type'], name['number'], name['name']))
    return names


# list(documents)


def lol (dirs):
    ss = str(input())
    for i, num in enumerate(dirs):
        if ss == dirs['1']:
            a = dirs['1']
            print(a)
        else: print("kek")

lol(directories)