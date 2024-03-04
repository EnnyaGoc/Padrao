from Cafeteira import Cafeteira
from Command import GerenciarCafeteiraCommand
from Controle import Controle
    # Cliente
    
    if __name__ == "__main__":
    
    cafeteira = Cafeteira()
    gerenciarCafeteiraCommand = GerenciarCafeteiraCommand(cafeteira)

    controle = Controle()
    controle.adicionar(gerenciarCafeteiraCommand)
    controle.executar()  # Lâmpada ligada.

    controle.desfazer()  # Lâmpada desligada.






    #Command:
#-Controle q controla os objetos de uma casa.
#-O controle seria o invoker
#-Ele poderia receber varios botoes, e em cada um deles teria um #comando para 
#ser executado
#-O comando precisa saber qual disp ele vai trabalhar
#-O receiver seria o dispositivo

#Nesse caso, o padrão Command permite a parametrização das operações da cafeteira pois
# permite que eu forneça métodos para alterar a ação da cafeteira, podendo fornecer outros métodos
# conforme a adiçao de outros dispositivos.
# Ao criar uma instância a partir da classe GerenciarCafeteiraCommand, 
# está acontecendo a parametrização da ligação da cafeteira


#O command também dá suporte a histórico e reversão de ações nesse códgio po
# a classe Controle tem uma lista de comandos (array) e tem métodos para executar e desfazer
#ações, tudo isso aumenta a flexibilidade.