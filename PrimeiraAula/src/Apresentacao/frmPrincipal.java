package Apresentacao;

public class frmPrincipal extends javax.swing.JFrame
{

    public frmPrincipal()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrimeiroNumero = new javax.swing.JLabel();
        txfPrimeiroNumero = new javax.swing.JTextField();
        lblSegundoNumero = new javax.swing.JLabel();
        txfSegundoNumero = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnSubtrair = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Somar dois números");

        lblPrimeiroNumero.setText("Digite o primeiro número:");

        lblSegundoNumero.setText("Digite o segundo número:");

        txfSegundoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSegundoNumeroActionPerformed(evt);
            }
        });

        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrimeiroNumero)
                    .addComponent(txfSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrimeiroNumero)
                .addGap(6, 6, 6)
                .addComponent(txfPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblSegundoNumero)
                .addGap(6, 6, 6)
                .addComponent(txfSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfSegundoNumeroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txfSegundoNumeroActionPerformed
    {//GEN-HEADEREND:event_txfSegundoNumeroActionPerformed
        
    }//GEN-LAST:event_txfSegundoNumeroActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomarActionPerformed
    {//GEN-HEADEREND:event_btnSomarActionPerformed
        Double n1 = 0.0, n2= 0.0, resultado = 0.0;
        n1 = Double.parseDouble(txfPrimeiroNumero.getText());
        n2 = Double.parseDouble(txfSegundoNumero.getText());
        resultado = n1 + n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubtrairActionPerformed
    {//GEN-HEADEREND:event_btnSubtrairActionPerformed
        Double n1 = 0.0, n2= 0.0, resultado = 0.0;
        n1 = Double.parseDouble(txfPrimeiroNumero.getText());
        n2 = Double.parseDouble(txfSegundoNumero.getText());
        resultado = n1 - n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplicarActionPerformed
    {//GEN-HEADEREND:event_btnMultiplicarActionPerformed
        Double n1 = 0.0, n2= 0.0, resultado = 0.0;
        n1 = Double.parseDouble(txfPrimeiroNumero.getText());
        n2 = Double.parseDouble(txfSegundoNumero.getText());
        resultado = n1 * n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDividirActionPerformed
    {//GEN-HEADEREND:event_btnDividirActionPerformed
        Double n1 = 0.0, n2= 0.0, resultado = 0.0;
        n1 = Double.parseDouble(txfPrimeiroNumero.getText());
        n2 = Double.parseDouble(txfSegundoNumero.getText());
        resultado = n1 / n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnDividirActionPerformed

    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JLabel lblPrimeiroNumero;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegundoNumero;
    private javax.swing.JTextField txfPrimeiroNumero;
    private javax.swing.JTextField txfSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
