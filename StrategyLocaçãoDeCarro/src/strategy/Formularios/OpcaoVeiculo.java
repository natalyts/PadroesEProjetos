package strategy.Formularios;

import strategy.Estacionamento.CarroCategoriaB;
import strategy.Estacionamento.Moto;
import strategy.Estacionamento.Veiculo;
import strategy.Estacionamento.Caminhao;
import strategy.Estacionamento.CarroCategoriaA;
import strategy.Estacionamento.CarroCategoriaC;


public enum OpcaoVeiculo {
     Moto(new Moto()), 
     CarroCategoriaA(new CarroCategoriaA()), 
     CarroCategoriaB(new CarroCategoriaB()), 
     CarroCategoriaC(new CarroCategoriaC()),
     Caminhão(new Caminhao());

    private final Veiculo imposto;

    private OpcaoVeiculo(Veiculo opcao) {
        this.imposto = opcao;
    }

    public Veiculo getImposto() {
        return this.imposto;
    }
    
    @Override
    public String toString() {
        return this.imposto.toString();
    }

}
