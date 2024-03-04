from Lampada import Lampada
from Command import LigarLampadaCommand
from Controle import Controle
    # Cliente
    lampada = Lampada()
    ligarLampadaCommand = LigarLampadaCommand(lampada)

    controle = Controle()
    controle.adicionar(ligarLampadaCommand)
    controle.executar()  # Lâmpada ligada.

    controle.desfazer()  # Lâmpada desligada.

if __name__ == "__main__":
    main()



    #Command:
#-Controle q controla os objetos de uma casa.
#-O controle seria o invoker
#-Ele poderia receber varios botoes, e em cada um deles teria um #comando para 
#ser executado
#-O comando precisa saber qual disp ele vai trabalhar
#-O receiver seria o dispositivo