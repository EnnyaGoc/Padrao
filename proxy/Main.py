#Ênnya Gomes Oliveira Campos
from recurso_sensivel import Recurso
from proxy_recurso import ProxyRecurso
from cliente import Cliente

def main():
    recurso_sensivel = Recurso()
    proxy = ProxyRecurso(recurso_sensivel)

    cliente_admin = Cliente("Ana", "admin")
    cliente_usuario = Cliente("Lucas", "usuario")

    print("Admin Ana:")
    cliente_admin.tentar_acessar_recurso(proxy) #Acesso concedido e log registrado

    print("Usuario Lucas:")
    cliente_usuario.tentar_acessar_recurso(proxy) #Acesso negado

if __name__ == "__main__":
    main()
