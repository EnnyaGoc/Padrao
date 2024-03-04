class Controle:
    def __init__(self):
        self.comandos = []

    def adicionar(self, comando):
        self.comandos.append(comando)

    def executar(self):
        for comando in self.comandos:
            comando.execute()

    def desfazer(self):
        if self.comandos:
            self.comandos.pop().undo()