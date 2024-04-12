class Cliente:
    def __init__(self, nome, permissao):
        self.nome = nome
        self.permissao = permissao

    def tentar_acessar_recurso(self, proxy):
        resultado = proxy.acessar({'nome': self.nome, 'permissao': self.permissao})
        print(resultado)
