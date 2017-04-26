package strategy.Estacionamento;

import padroes.strategy.Orcamento;


public class CarroCategoriaA implements Veiculo {
    
    private double imposto = 15/100;
    private double valor = 25.40;
    

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getHoras()* valor;
    }
    
  

    @Override
    public String toString() {
        return "Carro Categoria A";
    }

}
