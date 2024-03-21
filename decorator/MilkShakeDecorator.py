from abc import ABC, abstractmethod

class MilkShake(ABC):
    @abstractmethod
    def monta(self):
        pass

class MilkShakeDecorator(MilkShake):
    def __init__(self, componente):
        self.componente = componente

    def monta(self):
        self.componente.monta()




i




public abstract class MilkShakeDecorator extends MilkShake{
    private MilkShake componente;

    public MilkShakeDecorator(MilkShake m){
        this.componente = m;
    }

    public void monta(){
        componente.monta();
    }
}