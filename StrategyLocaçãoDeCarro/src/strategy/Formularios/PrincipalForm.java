
package strategy.Formularios;

import padroes.strategy.CalculaValorAluguel;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import padroes.strategy.Orcamento;


public class PrincipalForm extends javax.swing.JPanel {

    
    public PrincipalForm() {
        initComponents();
        othersSets();// inicia com os campos invisivel
       

    }
    
    public void othersSets() {
      labelResultado.setVisible(false);
    //  labelImposto.setVisible(false);
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxVeiculo = new javax.swing.JComboBox<>();
        buttonCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        textHoras = new javax.swing.JFormattedTextField();
        labelResultado = new javax.swing.JLabel();

        jLabel1.setText("Horas:");

        comboBoxVeiculo.setModel(new javax.swing.DefaultComboBoxModel(strategy.Formularios.OpcaoVeiculo.values()));

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Veiculo:");

        label1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label1.setText("Aluguel de Carros");

        jLabel3.setText("Valor Total Aluguel:");

        textHoras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        textHoras.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHorasActionPerformed(evt);
            }
        });
        textHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textHorasKeyPressed(evt);
            }
        });

        labelResultado.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(labelResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(comboBoxVeiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCalcular))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCalcular)
                    .addComponent(textHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelResultado))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed

        Double valor = Double.parseDouble(textHoras.getText().replaceAll(",", ""));

        OpcaoVeiculo opcao = (OpcaoVeiculo) comboBoxVeiculo.getSelectedItem();

        CalculaValorAluguel calculador = new CalculaValorAluguel(valor, opcao.getImposto());
        Double resultado = calculador.execute();

        
        labelResultado.setText(String.valueOf("R$" + resultado ));
      //  labelImposto.setText(calculador.realizarImposto(orcamento, opcao.getImposto()));
        
        labelResultado.setVisible(true); //deixa visivel
        
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void textHorasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textHorasKeyPressed

    }//GEN-LAST:event_textHorasKeyPressed

    private void textHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHorasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JComboBox<String> comboBoxVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JFormattedTextField textHoras;
    // End of variables declaration//GEN-END:variables

    
}
