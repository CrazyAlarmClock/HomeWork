#### чуть-чуть опоздал, простите! ночью допишу, просто бьыл пару дней назад на хакатоне и весь график сбился 🤯


class Animals:
    photo = "😇"
    voice = "example"
    weight = 0
    eat = False
    name = "example"
    name2 = "example"

    def tell(self):
        print("Имя: {}, Вес:{} кг, Говорит: {}".format(self.name, self.weight, self.voice), self.photo)

    def feed(self):
        self.feed = True
        print("мы покормили животное?",self.feed)

    def milk(self):
        pass

    def cut(self):
        pass

    def collect_eggs(self):
        pass


class Goose(Animals):
    weight = 2#kg
    name= "Серый"
    voice = "honk-honk-honk"
    photo = "🦆"

class Goose2(Animals):
    weight = 3#kg
    name= "Белый"
    voice = "honk-honk-honk"
    photo = "🦆"


class Cow(Animals):
    cow_weight = 40
    weight = 40#kg
    name = "Манька"
    voice = "moo"
    photo = "🐮"


class Sheep(Animals):
    weight = 8  #kg
    name = "Барашек"
    voice = "baaah"
    photo = "🐑"


class Sheep2(Animals):
    weight = 9  #kg
    name = "Кудрявый"
    voice = "baaah"
    photo = "🐑"

class Chicken(Animals):
    weight = 0.4 #kg
    name = "Ко-Ко"
    voice = "cackle and cluck"
    photo = "🐔"


class Chicken2(Animals):
    weight = 0.5#kg
    name = "Кукареку"
    voice = "cackle and cluck"
    photo = "🐔"


class Goat(Animals):
    goat_weight = 6
    weight = 6#kg
    name = "Рога"
    voice = "baaah"
    photo = "🐐"

class Goat2(Animals):
    weight = 6#kg
    name = "Копыта"
    voice = "baaah"
    photo = "🐐"


class Duck(Animals):
    duck_weight = 0.7 #kg
    weight = 0.7
    name = "Кряква"
    voice = "quack-quack"
    photo = "🦆"


animals = Animals()

goose = Goose()
cow = Cow()
sheep = Sheep()
chicken = Chicken()
goat = Goat()
duck = Duck()

cow.tell()