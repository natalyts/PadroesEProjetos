
package teste;
import diasSemana.Dia;
import diasSemana.MensagemSegunda;
import diasSemana.MensagemTerca;
import diasSemana.MensagemQuarta;
import diasSemana.MensagemQuinta;
import diasSemana.MensagemSexta;
import diasSemana.MensagemSabado;
import diasSemana.MensagemDomingo;
import java.util.Calendar;

public class Testador {
    public static void main ( String [] args){
    
       Dia dia = new Dia();
        
        Calendar calendario = Calendar.getInstance();
        System.out.println(dia.getInterfaceSemana(calendario.get(Calendar.DAY_OF_WEEK)).exibirMensagem());
        
    }
    
}
