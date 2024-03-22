from MilkShake import MilkShake

class MilkShakeDecorator(MilkShake):
    def __init__(self, m):
        self.componente = m

    def monta(self):
        self.componente.monta()



