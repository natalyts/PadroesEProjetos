package strategy.Estacionamento;

import padroes.strategy.Orcamento;


public class Caminhao implements Veiculo {
    
    private double imposto = 30/100;
    private double valor = 122.00;
    private Orcamento orcamento;
   
    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getHoras() * valor;
    }
    

    @Override
    public String toString() {
        return "Caminhão";
    }

   
}
