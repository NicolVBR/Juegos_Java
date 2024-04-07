package vista;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import javax.swing.JButton;

public class JInternalSnake extends javax.swing.JInternalFrame {
    
    PanelSnake Snake;
    
    public JInternalSnake() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReiniciar = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 790));

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reinicio.gif"))); // NOI18N

        btnSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 844, Short.MAX_VALUE)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 720, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    // End of variables declaration//GEN-END:variables
}
