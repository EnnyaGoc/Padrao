class Command:
    def execute(self):
        pass

    def undo(self):
        pass


class GerenciarCafeteiraCommand(Command):
    def __init__(self, cafeteira):
        self.cafeteira = cafeteira

    def execute(self):
        self.cafeteira.ligar()

    def undo(self):
        self.cafeteira.desligar()