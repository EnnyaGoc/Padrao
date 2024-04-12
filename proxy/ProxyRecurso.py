class ProxyRecurso:
    def __init__(self, recurso):
        self.recurso = recurso

    def acessar(self, usuario):
        if self.checar_permissao(usuario):
            resultado = self.recurso.acessar()
            self.registrar_acesso(usuario)
            return resultado
        else:
            return "Acesso Negado"

    def checar_permissao(self, usuario):
        return usuario.get('permissao') == 'admin'

    def registrar_acesso(self, usuario):
        print(f"Acesso registrado para o usuário {usuario['nome']} com permissão {usuario['permissao']}")
