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


class GerenciarCaixaDeSomCommand(Command):
    def __init__(self, caixa_de_som):
        self.caixa_de_som = caixa_de_som

    def execute(self):
        self.caixa_de_som.ligar()

    def undo(self):
        self.caixa_de_som.desligar()


class AumentarVolumeCommand(Command):
    def __init__(self, caixa_de_som):
        self.caixa_de_som = caixa_de_som

    def execute(self):
        self.caixa_de_som.aumentar_volume()

    def undo(self):
        pass


class DiminuirVolumeCommand(Command):
    def __init__(self, caixa_de_som):
        self.caixa_de_som = caixa_de_som

    def execute(self):
        self.caixa_de_som.diminuir_volume()

    def undo(self):
        pass
