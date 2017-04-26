package strategy.Estacionamento;

import padroes.strategy.Orcamento;


public class CarroCategoriaC implements Veiculo {
    
    private double imposto = 25/100;
    private double valor = 45.00;
    

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getHoras()* valor;
    }
    
  

    @Override
    public String toString() {
        return "Carro  Categoria C";
    }

}
