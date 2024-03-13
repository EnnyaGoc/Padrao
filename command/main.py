#Ennya Gomes Oliveira Campos
from Cafeteira import Cafeteira
from Command import GerenciarCafeteiraCommand
from Controle import Controle

    
    if __name__ == "__main__":
    
    cafeteira = Cafeteira()
    gerenciarCafeteiraCommand = GerenciarCafeteiraCommand(cafeteira)

    caixa_de_som = CaixaDeSom()
    gerenciarCaixaDeSomCommand = GerenciarCaixaDeSomCommand(caixa_de_som)
    aumentarVolumeCommand = AumentarVolumeCommand(caixa_de_som)
    diminuirVolumeCommand = DiminuirVolumeCommand(caixa_de_som)

    controle = Controle()
    controle.adicionar(gerenciarCafeteiraCommand)

    controle.adicionar(gerenciarCaixaDeSomCommand)
    controle.adicionar(aumentarVolumeCommand)
    controle.adicionar(diminuirVolumeCommand)

    controle.executar()  
    controle.desfazer()  

    


   

#Nesse caso, o padrão Command permite a parametrização das operações da cafeteira e da caixa de som pois
# permite que eu forneça métodos para alterar a ação desses dispositivos, podendo fornecer outros métodos conforme a adiçao de outros dispositivos.
# Ao criar uma instância a partir das classes GerenciarCafeteiraCommand e GerenciarCaixaDeSomCommand, 
# está acontecendo a parametrização da ligação da cafeteira e da caixa de som


#O command também dá suporte a histórico e reversão de ações nesse código pois a classe Controle tem uma lista de comandos (array) e tem métodos para executar e desfazer ações, tudo isso aumenta a flexibilidade.