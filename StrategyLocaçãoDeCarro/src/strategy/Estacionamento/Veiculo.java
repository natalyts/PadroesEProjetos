package strategy.Estacionamento;

import padroes.strategy.Orcamento;


public interface Veiculo {

    public double calcular(Orcamento orcamento);
    
    
    @Override
    public String toString();

    

}


