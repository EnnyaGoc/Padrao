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

    def reservarViagem(self, data, destino, hotel, carro, cartao, valor):
        self.voo.reservaVoo(data, destino)
        self.hotel.reservaQuarto(hotel, data)
        self.carro.alugaCarro(carro, data)
        self.pagamento.realizarPagamento(cartao, valor)
    
    
        