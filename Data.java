/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaDeCobranca;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
/**
 *
 * @author jcarl
 */
public class Data {
    public static void main (String [] args )throws ParseException {
       Calendar calendario = Calendar.getInstance();
       Date data = calendario.getTime();
        
       Locale brasil = new Locale("pt","BR");
       Locale eua = Locale.ENGLISH;
        
       DateFormat test1 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
       System.out.println("Data brasileira: " + test1.format(data));       

       DateFormat test2 = DateFormat.getDateInstance(DateFormat.FULL, eua);
       System.out.println("Data americana: " + test2.format(data));

       DateFormat test3 = DateFormat.getDateInstance(DateFormat.MONTH_FIELD, brasil);
       System.out.println("Data brasileira: " + test3.format(data));

       DateFormat test4 = DateFormat.getDateInstance(DateFormat.MONTH_FIELD, eua);
       System.out.println("Data americana: " + test4.format(data));

       DateFormat test5 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, brasil);
       System.out.println("Data brasileira: " + test5.format(data));

       DateFormat test6 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, eua);
       System.out.println("Data americana: " + test6.format(data));

       DateFormat test7 = DateFormat.getDateInstance(DateFormat.SHORT, brasil);
       System.out.println("Data brasileira: " + test7.format(data));

       DateFormat test8 = DateFormat.getDateInstance(DateFormat.SHORT, eua);
       System.out.println("Data americana: " + test8.format(data));
        
    }    
}
