Considere um sistema complexo de reservas de viagens online, onde os clientes podem reservar voos, hotéis e alugar carros para suas viagens. O sistema é composto por diversos subsistemas, como processamento de pagamentos, verificação de disponibilidade de voos e quartos de hotel, além de gestão de reservas.
O desafio é simplificar o processo de reserva para os clientes, proporcionando uma interface única e intuitiva. Proporcione uma solução utilizando o padrão de design Facade para criar uma fachada que esconda a complexidade dos subsistemas, permitindo que os clientes realizem suas reservas sem lidar diretamente com os detalhes internos do sistema. Dentro da sua proposta, explique como o padrão Facade facilita a interação do cliente.


from voo import Voos
from hotel import Hoteis
from carro import Carros
from pagamento import Pagamentos  


class Facade:
    def __init__(self):
        self.voo = Voos()
        self.hotel = Hoteis()
        self.carro = Carros()
        self.pagamento = Pagamentos()

    def reservarViagem(self, data, destino, hotel, dia, carro, cartao, valor):
        self.voo.reservaVoo(data, destino)
        self.hotel.reservaQuarto(hotel, dia)
        self.carro.alugaCarro(carro, dia)
        self.pagamento.realizarPagamento(cartao, valor)
    
    
        