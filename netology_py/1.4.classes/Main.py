### вроде бы все долелал)

class Animals:
    photo = "😇"
    voice = "example"
    weight = 0
    eggs = 0
    m1lk = 0
    cut = 0
    eat = 0
    name = "example"

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
    def __init__(self, n = "test"):
        self.name = n
    weight = 2#kg
    voice = "honk-honk-honk"
    photo = "🦆"
    eggs = 1


class Goose2(Goose):
    def __init__(self, n="test"):
        self.name = n
    weight = 3#kg



class Cow(Animals):
    def __init__(self, n="test"):
        self.name = n
    cow_weight = 40
    weight = 40#kg
    voice = "moo"
    photo = "🐮"
    m1lk = 1


class Sheep(Animals):
    def __init__(self, n="test"):
        self.name = n
    weight = 8  #kg
    voice = "baaah"
    photo = "🐑"
    cut = 1


class Sheep2(Sheep):
    def __init__(self, n="test"):
        self.name = n
    weight = 9  #kg


class Chicken(Animals):
    def __init__(self, n="test"):
        self.name = n
    weight = 0.4 #kg
    voice = "cackle and cluck"
    photo = "🐔"
    eggs = 1


class Chicken2(Chicken):
    def __init__(self, n="test"):
        self.name = n
    weight = 0.5#kg


class Goat(Animals):
    def __init__(self, n="test"):
        self.name = n
    goat_weight = 6
    weight = 6#kg
    voice = "baaah"
    photo = "🐐"


class Goat2(Goat):
    def __init__(self, n="test"):
        self.name = n
    weight = 6#kg



class Duck(Animals):
    def __init__(self, n="test"):
        self.name = n
    duck_weight = 0.7 #kg
    weight = 0.7
    voice = "quack-quack"
    photo = "🦆"
    eggs = 1


animals = Animals()

goose = Goose("Серый")
goose2 = Goose2("Бклый")
cow = Cow("Манька")
sheep = Sheep("Барашек")
sheep2 = Sheep2("Кудрявый")
chicken = Chicken("Кукареку")
chicken2 = Chicken2("Кукареку")
goat = Goat("Рога")
goat2 = Goat2("Копыта")
duck = Duck("Кряква")

def fat():
    hi_weight = 0
    fat_name = 0
    max = 0

    list_weight = [goose2.weight, goose.weight, cow.weight, sheep.weight, sheep2.weight, chicken.weight, chicken2.weight, goat.weight,goat2.weight, duck.weight]
    list_name = [goose2.name, goose.name, cow.name,  sheep.name,  sheep2.name,  chicken.name,  chicken2.name,  goat.name,  goat2.name,  duck.name]

    for j, i in enumerate(list_weight):
        if i > hi_weight:
            hi_weight = i
            fat_name = list_name[j]
        max += i
    return round(max, 2), hi_weight, fat_name

max,hi_weight,fat_name = fat()

goose.tell()
duck.tell()
print("Вес всех животных: {} кг, Максимальный вес животого: {} кг, Имя: {}".format(max, hi_weight, fat_name))

