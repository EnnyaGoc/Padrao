from MilkShakeDecorator import MilkShakeDecorator

class Chantilly(MilkShakeDecorator):
    def __init__(self, m):
        super().__init__(m)

    def monta(self):
        super().monta()
        self.add_chantilly()

    def add_chantilly(self):
        print("- adiciona chantilly")

