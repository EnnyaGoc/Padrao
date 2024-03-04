from facade import Facade

class main:

    reserva= Facade()

    reserva.reservarViagem("2024-05-07", "eua", "algumhotel", "14", "porsche")

    reserva.realizarPagamento("454653767566756", 15000.00)