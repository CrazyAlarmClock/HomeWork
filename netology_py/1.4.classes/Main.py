### не успел дописать поиск имени из 3 задания, днем допишу + еще ошибки 

class Animals:
    photo = "😇"
    voice = "example"
    weight = 0
    eggs = 0
    m1lk = 0
    cut = 0
    eat = 0
    name = "example"
    name2 = "example"

    def tell(self):
        print("Имя: {}, Вес: {} кг, Говорит: {}".format(self.name, self.weight, self.voice), self.photo)

    def feed(self):
        print("Вы покормили - Имя: {}, Вес: {} кг ".format(self.name, self.weight), self.photo)

    def milk(self):
        if self.m1lk == 1:
            print("Вы подоили - Имя: {}, Вес: {} кг ".format(self.name, self.weight), self.photo)
        else: print("Данное живтоное нелья подоить 😕")

    def shear(self):
        if self.cut == 1:
            print("Вы подстригли - Имя: {}, Вес: {} кг ".format(self.name, self.weight), self.photo)
        else: print("Данное живтоное нелья подстричь 😕")

    def collect_eggs(self):
        if self.m1lk == 1:
            print("Вы собрали яйца у - Имя: {}, Вес: {} кг ".format(self.name, self.weight), self.photo)
        else: print("Данное живтоное не несет яйиц😕")


class Goose(Animals):
    weight = 2#kg
    name = "Серый"
    voice = "honk-honk-honk"
    photo = "🦆"
    eggs = 1


class Goose2(Goose):
    weight = 3#kg
    name = "Белый"



class Cow(Animals):
    cow_weight = 40
    weight = 40#kg
    name = "Манька"
    voice = "moo"
    photo = "🐮"
    m1lk = 1


class Sheep(Animals):
    weight = 8  #kg
    name = "Барашек"
    voice = "baaah"
    photo = "🐑"
    cut = 1


class Sheep2(Sheep):
    weight = 9  #kg
    name = "Кудрявый"


class Chicken(Animals):
    weight = 0.4 #kg
    name = "Ко-Ко"
    voice = "cackle and cluck"
    photo = "🐔"
    eggs = 1


class Chicken2(Chicken):
    weight = 0.5#kg
    name = "Кукареку"


class Goat(Animals):
    goat_weight = 6
    weight = 6#kg
    name = "Рога"
    voice = "baaah"
    photo = "🐐"


class Goat2(Goat):
    weight = 6#kg
    name = "Копыта"



class Duck(Animals):
    duck_weight = 0.7 #kg
    weight = 0.7
    name = "Кряква"
    voice = "quack-quack"
    photo = "🦆"
    eggs = 1


animals = Animals()

goose = Goose()
goose2 = Goose2()
cow = Cow()
sheep = Sheep()
sheep2 = Sheep2()
chicken = Chicken()
chicken2 = Chicken2()
goat = Goat()
goat2 = Goat2()
duck = Duck()

def fat():
    count = 0
    max = 0
    list = [goose.weight,
            goose2.weight,
            cow.weight,
            sheep.weight,
            sheep2.weight,
            chicken.weight,
            chicken2.weight,
            goat.weight,
            goat2.weight,
            duck.weight]

    for i in list:
        if i > count:
            count = i
        max+=i

    return round(max,2),count

max,count = fat()
print("Вес всех животных: {} кг, Максимальный вес животого: {}".format(max, count),"кг")