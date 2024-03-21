from milkshake import MilkShake

class Morango(MilkShake):
    def __init__(self, m):
        super().__init__(m)

    def monta(self):
        super().monta()
        self.add_morango()

    def add_morango(self):
        print("adiciona morango")
