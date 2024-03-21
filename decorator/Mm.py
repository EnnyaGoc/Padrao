from milkshake import MilkShake

class Mm(MilkShake):
    def __init__(self, m):
        super().__init__(m)

    def monta(self):
        super().monta()
        self.add_mm()

    def add_mm(self):
        print("adiciona m&m")