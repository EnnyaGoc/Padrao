# Implementação da classe ProxyResource
class ProxyResource(Resource):
    def __init__(self, real_resource):
        self.real_resource = real_resource

    def access_resource(self, user):
        if user.permission_level >= 2:  # Exemplo de verificação de permissão
            self.real_resource.access_resource(user)
            print("Registro de acesso ao recurso realizado para o usuário:", user)
        else:
            print("Acesso negado para o usuário:", user)
