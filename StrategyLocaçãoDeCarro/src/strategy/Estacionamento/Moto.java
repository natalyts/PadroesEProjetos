package strategy.Estacionamento;

import padroes.strategy.Orcamento;
import padroes.strategy.CalculaValorAluguel;

public class Moto implements Veiculo {
    private double imposto = 10/100;
    private double valor = 10;
    
    @Override
    public double calcular(Orcamento orcamento) {
    
       return orcamento.getHoras() * valor;
    }
    
    /**
     *
     * @return
     */
   
    
    @Override
    public String toString() {
        return "Moto";
    }
    
}
