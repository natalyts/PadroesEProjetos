package strategy.Estacionamento;

import padroes.strategy.Orcamento;


public class CarroCategoriaB implements Veiculo {
    
    private double imposto = 20/100;
    private double valor = 35.00;
    
    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getHoras()* valor;
    }
    
   

    @Override
    public String toString() {
        return "Carro  Categoria B";
    }

}
