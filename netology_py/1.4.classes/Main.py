#### чуть-чуть опоздал, простите! ночью допишу, просто бьыл пару дней назад на хакатоне и весь график сбился 🤯


class Animals:
    photo = "😇"
    voice = "example"
    weight = 0
    eggs = False
    milk = False
    cut = False
    eat = False
    name = "example"
    name2 = "example"

    def tell(self):
        print("Имя: {}, Вес: {} кг, Говорит: {}".format(self.name, self.weight, self.voice), self.photo)

    def feed(self):
        print("Вы покормили: Имя: {}, Вес: {} кг, ".format(self.name, self.weight), self.photo)

    def milk(self):
        pass

    def shear(self):
        pass

    def collect_eggs(self):
        pass


class Goose(Animals):
    weight = 2#kg
    name= "Серый"
    voice = "honk-honk-honk"
    photo = "🦆"
    cut = False
    eggs = True
    milk =False


class Goose2(Animals):
    weight = 3#kg
    name= "Белый"
    voice = "honk-
    cut = False
    milk =False
    eggs = True


class Cow(Animals):
    cow_weight = 40
    weight = 40#kg
    name = "Манька"
    voice = "moo"
    photo = "🐮"
    cut = False
    milk = True



class Sheep(Animals):
    weight = 8  #kg
    name = "Барашек"
    voice = "baaah"
    photo = "🐑"
    cut = True
    milk = False




class Sheep2(Animals):
    weight = 9  #kg
    name = "Кудрявый"
    voice = "baaah"
    photo = "🐑"
    cut = True
    milk = False

class Chicken(Animals):
    weight = 0.4 #kg
    name = "Ко-Ко"
    voice = "cackle and cluck"
    photo = "🐔"
    eggs = True
    cut = False
    milk = False


class Chicken2(Animals):
    weight = 0.5#kg
    name = "Кукареку"
    voice = "cackle and cluck"
    photo = "🐔"
    eggs = True
    milk = False
    cut = False


class Goat(Animals):
    goat_weight = 6
    weight = 6#kg
    name = "Рога"
    voice = "baaah"
    milk = False
    photo = "🐐"
    cut = False

class Goat2(Animals):
    weight = 6#kg
    name = "Копыта"
    voice = "baaah"
    photo = "🐐"
    cut = False
    milk = False


class Duck(Animals):
    duck_weight = 0.7 #kg
    weight = 0.7
    name = "Кряква"
    voice = "quack-quack"
    photo = "🦆"
    cut = False
    eggs = True
    milk = False


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

goose2.tell()