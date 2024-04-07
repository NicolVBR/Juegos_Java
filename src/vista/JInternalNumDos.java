package vista;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JInternalNumDos extends javax.swing.JInternalFrame {

    public JInternalNumDos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNumVerf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAComp = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnVerif = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADIVINAR UN NÚMERO DE DOS CIFRAS ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtNumVerf.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtNumVerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumVerfActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumVerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 152, 151, -1));

        txtAComp.setColumns(20);
        txtAComp.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtAComp.setRows(5);
        jScrollPane1.setViewportView(txtAComp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 51, 390, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite número");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        btnVerif.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnVerif.setText("Verificar");
        getContentPane().add(btnVerif, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        btnSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.gif"))); // NOI18N
        getContentPane().add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 50, 40));

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reinicio.gif"))); // NOI18N
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 50, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GifMatrix.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumVerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumVerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumVerfActionPerformed

    public JButton getBtnVerif() {
        return btnVerif;
    }

    public void setBtnVerif(JButton btnVerif) {
        this.btnVerif = btnVerif;
    }

    public JTextArea getTxtAComp() {
        return txtAComp;
    }

    public void setTxtAComp(JTextArea txtAComp) {
        this.txtAComp = txtAComp;
    }

    public JTextField getTxtNumVerf() {
        return txtNumVerf;
    }

    public void setTxtNumVerf(JTextField txtNumVerf) {
        this.txtNumVerf = txtNumVerf;
    }
    
    public void getMostrarInformacion(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    
    public String setCapturaInformacion(String texto){
        return(JOptionPane.showInputDialog(texto));
    }
    
    public int setCapturaDecision(String texto){
        return(JOptionPane.showConfirmDialog(null, texto, "SALIR CUENTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }

    public JButton getBtnReiniciar() {
        return btnReiniciar;
    }

    public void setBtnReiniciar(JButton btnReiniciar) {
        this.btnReiniciar = btnReiniciar;
    }

    public JButton getBtnSalida() {
        return btnSalida;
    }

    public void setBtnSalida(JButton btnSalida) {
        this.btnSalida = btnSalida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnVerif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAComp;
    private javax.swing.JTextField txtNumVerf;
    // End of variables declaration//GEN-END:variables
}
