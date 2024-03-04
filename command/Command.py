class Command:
    def execute(self):
        pass

    def undo(self):
        pass


class LigarLampadaCommand(Command):
    def __init__(self, lampada):
        self.lampada = lampada

    def execute(self):
        self.lampada.ligar()

    def undo(self):
        self.lampada.desligar()