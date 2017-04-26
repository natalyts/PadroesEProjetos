/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasSemana;

import regras.Mensagem;

/**
 *
 * @author jcarl
 */
public class Dia {
    
    public Mensagem getInterfaceSemana(int diasDaSemana) {        
        switch(diasDaSemana)
    {
      case 1: return new MensagemDomingo();
      case 2: return new MensagemSegunda();
      case 3: return new MensagemTerca();
      case 4: return new MensagemQuarta();
      case 5: return new MensagemQuinta();
      case 6: return new MensagemSexta();
      case 7: return new MensagemSabado();
    }
        
  // Dia da semana invalido
    throw new IllegalArgumentException("'" + diasDaSemana + 
                                       "  ");
            
    }
    
    
    

   /* public InterfaceSemana getInterfaceSemana(String interfaceSemana) {
        try {
            // Obter a instancia da classe desejada
            return (InterfaceSemana) Class.forName(interfaceSemana).newInstance();
            
        } catch (Exception exception) {
            // Dia da semana invalido
            throw new IllegalArgumentException("'" + interfaceSemana + 
                    "' É um argumento ilegal para o parâmetro dia da semana!");
        }
    }*/
}




