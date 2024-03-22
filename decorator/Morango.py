from MilkShakeDecorator import MilkShakeDecorator

class Morango(MilkShakeDecorator):
    def __init__(self, m):
        super().__init__(m)

    def monta(self):
        super().monta()
        self.addMorango()

    def addMorango(self):
        print("- adiciona morango")
