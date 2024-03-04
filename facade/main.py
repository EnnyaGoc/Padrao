from facade import Facade

class main:

    reserva = Facade()

    reserva.reservarViagem("2024-05-07", "eua", "algumhotel", "14", "porsche", "454653767566756", 15000.00)


    #o padroa Facade facilita a intereçao do cliente pois
    #nesse caso, fornece uma interface simples e unificada para 
    #as reservas e o pagamento.
    #o cliente só interage com a classe Facade

    #Oferece tb uma unica interface reservarViagem que encapsula os subsistemas.