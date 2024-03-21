from milkshake import MilkShake

class Granulado(MilkShake):
    def __init__(self, m):
        super().__init__(m)

    def monta(self):
        super().monta()
        self.add_granulado()

    def add_granulado(self):
        print("adiciona granulado")
