# Interface Resource
class Resource:
    def access_resource(self, user):
        pass


# Implementação da classe RealResource
class RealResource(Resource):
    def access_resource(self, user):
        print("Acesso concedido ao recurso para o usuário:", user)
