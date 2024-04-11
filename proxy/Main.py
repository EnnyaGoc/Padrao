from resource import RealResource, ProxyResource
from user import User

# Testando o sistema
if __name__ == "__main__":
    # Criando recursos e proxy para eles
    real_resource = RealResource()
    proxy_resource = ProxyResource(real_resource)

    # Criando usuários com diferentes níveis de permissão
    user1 = User("Alice", 1)  # Permissão baixa
    user2 = User("Bob", 2)    # Permissão média
    user3 = User("Charlie", 3) # Permissão alta

    # Tentando acessar recursos com diferentes usuários
    proxy_resource.access_resource(user1)  # Acesso negado para Alice
    proxy_resource.access_resource(user2)  # Acesso concedido para Bob
    proxy_resource.access_resource(user3)  # Acesso concedido para Charlie
