#Ênnya Gomes Oliveira Campos
from BaseChocolate import BaseChocolate
from Chantilly import Chantilly
from Morango import Morango
from Mm import Mm
from Granulado import Granulado
from BaseMorango import BaseMorango

def main():
    ms1 = BaseChocolate()
    c = Chantilly(ms1)
    mor = Morango(c)
    mm = Mm(mor)
    g = Granulado(mm)
    g.monta()

# Valor final do ms1:
#Fazendo milkshake de chocolate...
#- adiciona chantilly
#- adiciona morango
#- adiciona m&m
#- adiciona granulado

    ms2 = BaseMorango()
    cm = Chantilly(ms2)
    mm2 = Mm(cm)
    mm2.monta()

# Valor final do ms2:
#Fazendo milkshake de morango...
#- adiciona chantilly
#- adiciona m&m

if __name__ == "__main__":
    main()
