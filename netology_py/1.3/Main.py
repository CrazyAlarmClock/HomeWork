number_in = input();
documents = [  ## это документы.
    {"type": "passport", "number": "2207 876234", "name": "Василий Гупкин"},
    {"type": "invoice", "number": "11-2", "name": "Геннадий Покемонов"},
    {"type": "insurance", "number": "10006", "name": "Аристарх Павлов"}
]

directories = {  ## это полки , на которых лежат documents
    '1': ['2207 876234', '11-2'],  ## это номера документа, в конктреной полке.
    '2': ['10006','12'],
    '3': []
}

temp1 = [];
pusto = 0;
for i in rdocuments:
    try:
        temp = (directories[str(i)]);
        for j in temp:

            if temp[j] == number_in:
                kek = j
    except:
        pusto += 1;
print(temp1)
# мы должны ввести номер документа и он должен вывести номер полки, на которой находится документ number_in = input();
documents = [  ## это документы.
    {"type": "passport", "number": "2207 876234", "name": "Василий Гупкин"},
    {"type": "invoice", "number": "11-2", "name": "Геннадий Покемонов"},
    {"type": "insurance", "number": "10006", "name": "Аристарх Павлов"}
]

directories = {  ## это полки , на которых лежат documents
    '1': ['2207 876234', '11-2'],  ## это номера документа, в конктреной полке.
    '2': ['10006'],
    '3': []
}


print(temp1)
# мы должны ввести номер документа и он должен вывести номер полки, на которой находится документ
# Мы берем и отправляем письмо


def shelf(dirs, docs):
    a = 0
    enter_number = str(input("Ввидите число"))
    for i in dirs:
        for j in docs:
            if enter_number == i and dirs["enter_number"]:
                a = j

    return a

