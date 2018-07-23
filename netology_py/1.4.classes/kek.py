number_in = input();
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

temp1 = [];
pusto = 0;
for i in range(len(documents)):
    try:
        temp = (directories[str(i)]);
        for j in range(len(temp)):

            if (temp[j] == number_in):
                temp1.append(j)
    except:
        pusto += 1;
print(temp1)
# мы должны ввести номер документа и он должен вывести номер полки, на которой находится документ 