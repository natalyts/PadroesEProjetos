package padroes.strategy;

import strategy.Formularios.PrincipalForm;
import javax.swing.JFrame;


public class Start {

    
    public static void main(String[] args) {
        startAplication();
    }
    
    public static void startAplication() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new PrincipalForm());
        frame.pack();
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }

}
