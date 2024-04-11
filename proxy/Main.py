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

Imagine que você esteja desenvolvendo uma aplicação que acessa recursos sensíveis, como informações confidenciais de clientes ou dados críticos da empresa.
 Para garantir a segurança desses dados, é necessário implementar um controle de acesso rigoroso, onde apenas usuários autorizados 
 tenham permissão para acessar esses recursos.

Crie um sistema com um mecanismo de controle de acesso, que permita validar as permissões dos usuários
 antes de conceder o acesso real aos recursos sensíveis. Além disso, é importante evitar a exposição direta
  dos recursos sensíveis para proteger contra acessos não autorizados.
A sua solução deve utilizar o padrão de design Proxy para controlar o acesso esses recursos, atuando como um intermediário 
entre a aplicação e os recursos sensíveis (protection Proxy).
Antes de encaminhar as solicitações devem ser realizadas verificações de permissões dos usuários. Somente usuários que possuem 
um certo nível de permissão pode ter acesso garantido aos recursos. Após acessar o recurso o seu Proxy também deve registrar o acesso realizado, como um log.

Para testar o sistema crie um classe Cliente, em um pacote separado, e simule situações de usuários tendo sucesso e fracasso 
ao tentar acessar algum recurso. Indique com comentários no código o resultado esperado da chamada à cada operação. O log de registro dos acessos pode ser impressão no console.