package vista;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JInternalSerpientesYEscaleras extends javax.swing.JInternalFrame{

    public JInternalSerpientesYEscaleras() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlJuego = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        btnJ1 = new javax.swing.JButton();
        btnJ2 = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        escalera = new javax.swing.JLabel();
        escalera2 = new javax.swing.JLabel();
        escalera3 = new javax.swing.JLabel();
        serpiente = new javax.swing.JLabel();
        serpiente2 = new javax.swing.JLabel();
        serpiente3 = new javax.swing.JLabel();
        lblFichaJ1 = new javax.swing.JLabel();
        lblFichaJ2 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl29 = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        pnlJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SERPIENTES Y ESCALERAS");
        pnlJuego.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 270, 20));
        pnlJuego.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 570, 10));
        pnlJuego.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 560, 10));

        btnJ1.setBackground(new java.awt.Color(0, 204, 204));
        btnJ1.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        btnJ1.setText("Lanzar dado j1");
        btnJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ1ActionPerformed(evt);
            }
        });
        pnlJuego.add(btnJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 140, 40));

        btnJ2.setBackground(new java.awt.Color(102, 51, 255));
        btnJ2.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        btnJ2.setText("Lanzar dado j2");
        pnlJuego.add(btnJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 140, 40));

        btnSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.gif"))); // NOI18N
        pnlJuego.add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 50, 40));

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reinicio.gif"))); // NOI18N
        pnlJuego.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 50, 40));

        escalera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escalera.png"))); // NOI18N
        pnlJuego.add(escalera, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 40, -1));

        escalera2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escalera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escalera2.png"))); // NOI18N
        pnlJuego.add(escalera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 210, 210));

        escalera3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escalera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escalera3.png"))); // NOI18N
        pnlJuego.add(escalera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 220, 210));

        serpiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serpiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/serpiente.png"))); // NOI18N
        pnlJuego.add(serpiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 60, 160));

        serpiente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serpiente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/serpiente2.png"))); // NOI18N
        pnlJuego.add(serpiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        serpiente3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serpiente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/serpiente3.png"))); // NOI18N
        pnlJuego.add(serpiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 140));

        lblFichaJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fichaJ1.png"))); // NOI18N
        pnlJuego.add(lblFichaJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 20, 20));

        lblFichaJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fichaJ2.png"))); // NOI18N
        pnlJuego.add(lblFichaJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 20, 20));

        lbl18.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl18.setText("18");
        lbl18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 70, 70));

        lbl4.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("4");
        lbl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 70, 70));

        lbl14.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl14.setText("14");
        lbl14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, 70));

        lbl6.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("6");
        lbl6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 70, 70));

        lbl27.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl27.setText("27");
        lbl27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 70, 70));

        lbl15.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl15.setText("15");
        lbl15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 70, 70));

        lbl7.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("7");
        lbl7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 70, 70));

        lbl3.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("3");
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 70, 70));

        lbl16.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl16.setText("16");
        lbl16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 70, 70));

        lbl29.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl29.setText("29");
        lbl29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 70, 70));

        lblInicio.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setText("INICIO");
        lblInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlJuego.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 70, 70));

        lbl11.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11.setText("11");
        lbl11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 70, 70));

        lbl10.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.setText("10");
        lbl10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 70, 70));

        lbl19.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl19.setText("19");
        lbl19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 70, 70));

        lbl21.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl21.setText("21");
        lbl21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 70, 70));

        lbl5.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("5");
        lbl5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 70, 70));

        lbl20.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl20.setText("20");
        lbl20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 70, 70));

        lbl12.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl12.setText("12");
        lbl12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 70, 70));

        lbl1.setBackground(new java.awt.Color(204, 255, 204));
        lbl1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("1");
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 70, 70));

        lbl2.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("2");
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 70, 70));

        lbl23.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl23.setText("23");
        lbl23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 70, 70));

        lbl17.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl17.setText("17");
        lbl17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 70, 70));

        lbl8.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setText("8");
        lbl8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 70, 70));

        lbl26.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl26.setText("26");
        lbl26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, 70));

        lbl13.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13.setText("13");
        lbl13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 70));

        lbl22.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl22.setText("22");
        lbl22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 70, 70));

        lbl24.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl24.setText("24");
        lbl24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 70, 70));

        lbl9.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setText("9");
        lbl9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 70, 70));

        lbl30.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl30.setText("30");
        lbl30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 70, 70));

        lbl28.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl28.setText("28");
        lbl28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 70, 70));

        lbl25.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl25.setText("25");
        lbl25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuego.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJ1ActionPerformed
    private int posXJ1 = 20, posYJ1 = 380;
    private int posXJ2 = 20, posYJ2 = 410;
    private int posXYAuxJ1[] = {0,0};
    private int posXYAuxJ2[] = {0,0};
    private int posJ1 = 0, posJ2 = 0;
    
    boolean win = false;
    public void setGanador(boolean win){
        this.win = win;
    }
    public boolean getGanador(){
        return win;
    }
    
    public void EnviarPosX(JLabel lblAux, int posX){
        if(lblAux == lblFichaJ1){
            setPosXJ1(posX);
        }
        else{
            setPosXJ2(posX);
        }
    }
    public int traerPosX(JLabel lblAux){
        if(lblAux == lblFichaJ1){
            return getPosXJ1();
        }
        else{
            return getPosXJ2();
        }
    }
    
    public void EnviarPosY(JLabel lblAux, int posY){
        if(lblAux == lblFichaJ1){
            setPosYJ1(posY);
        }
        else{
            setPosYJ2(posY);
        }
    }
    public int traerPosY(JLabel lblAux){
        if(lblAux == lblFichaJ1){
            return getPosYJ1();
        }
        else{
            return getPosYJ2();
        }
    }
    
    public void EnviarPosXYAux(JLabel lblAux, int posXAux, int posYAux){
        if(lblAux == lblFichaJ1){
            setPosXYAuxJ1(posXAux, posYAux);
        }
        else{
            setPosXYAuxJ2(posXAux, posYAux);
        }
    }
    public int[] traerPosXYAux(JLabel lblAux){
        if(lblAux == lblFichaJ1){
            return getPosXYAuxJ1();
        }
        else{
            return getPosXYAuxJ2();
        }
    }

    public JButton getBtnSalida() {
        return btnSalida;
    }

    public void setBtnSalida(JButton btnSalida) {
        this.btnSalida = btnSalida;
    }
    
    public int getPosXJ1() {
        return posXJ1;
    }
    public void setPosXJ1(int posXJ1) {
        this.posXJ1 = posXJ1;
    }

    public int getPosYJ1() {
        return posYJ1;
    }
    public void setPosYJ1(int posYJ1) {
        this.posYJ1 = posYJ1;
    }

    public int[] getPosXYAuxJ1() {
        return posXYAuxJ1;
    }
    public void setPosXYAuxJ1(int posXAux, int posYAux) {
        this.posXYAuxJ1[0] = posXAux;
        this.posXYAuxJ1[1] = posYAux;
    }
    
    public int getPosXJ2() {
        return posXJ2;
    }
    public void setPosXJ2(int posXJ2) {
        this.posXJ2 = posXJ2;
    }

    public int getPosYJ2() {
        return posYJ2;
    }
    public void setPosYJ2(int posYJ2) {
        this.posYJ2 = posYJ2;
    }

    public int[] getPosXYAuxJ2() {
        return posXYAuxJ2;
    }
    public void setPosXYAuxJ2(int posXAux, int posYAux) {
        this.posXYAuxJ2[0] = posXAux;
        this.posXYAuxJ2[1] = posYAux;
    }
    
    public void posicionar(JLabel lblAux, int pos){
        if(lblAux == lblFichaJ1){
            setPosJ1(pos);
        }
        else{
            setPosJ2(pos);
        }
    }
    public int traerPosicion(JLabel lblAux){
        if(lblAux == lblFichaJ1){
            return getPosJ1();
        }
        else{
            return getPosJ2();
        }
    }
    
    public int getPosJ1() {
        return posJ1;
    }
    public void setPosJ1(int posJ1) {
        this.posJ1 = posJ1;
    }

    public int getPosJ2() {
        return posJ2;
    }
    public void setPosJ2(int posJ2) {
        this.posJ2 = posJ2;
    }
    
    public void getMostrarInformacion(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    
    public String setCapturaInformacion(String texto){
        return(JOptionPane.showInputDialog(texto));
    }
    
    public int setCapturaDecision(String texto){
        return(JOptionPane.showConfirmDialog(null, texto, "SALIR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }
    
    public JButton getBtnJ1() {
        return btnJ1;
    }

    public void setBtnJ1(JButton btnJ1) {
        this.btnJ1 = btnJ1;
    }

    public JButton getBtnJ2() {
        return btnJ2;
    }

    public void setBtnJ2(JButton btnJ2) {
        this.btnJ2 = btnJ2;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }

    public JLabel getLbl10() {
        return lbl10;
    }

    public void setLbl10(JLabel lbl10) {
        this.lbl10 = lbl10;
    }

    public JLabel getLbl11() {
        return lbl11;
    }

    public void setLbl11(JLabel lbl11) {
        this.lbl11 = lbl11;
    }

    public JLabel getLbl12() {
        return lbl12;
    }

    public void setLbl12(JLabel lbl12) {
        this.lbl12 = lbl12;
    }

    public JLabel getLbl13() {
        return lbl13;
    }

    public void setLbl13(JLabel lbl13) {
        this.lbl13 = lbl13;
    }

    public JLabel getLbl14() {
        return lbl14;
    }

    public void setLbl14(JLabel lbl14) {
        this.lbl14 = lbl14;
    }

    public JLabel getLbl15() {
        return lbl15;
    }

    public void setLbl15(JLabel lbl15) {
        this.lbl15 = lbl15;
    }

    public JLabel getLbl16() {
        return lbl16;
    }

    public void setLbl16(JLabel lbl16) {
        this.lbl16 = lbl16;
    }

    public JLabel getLbl17() {
        return lbl17;
    }

    public void setLbl17(JLabel lbl17) {
        this.lbl17 = lbl17;
    }

    public JLabel getLbl18() {
        return lbl18;
    }

    public void setLbl18(JLabel lbl18) {
        this.lbl18 = lbl18;
    }

    public JLabel getLbl19() {
        return lbl19;
    }

    public void setLbl19(JLabel lbl19) {
        this.lbl19 = lbl19;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }

    public JLabel getLbl20() {
        return lbl20;
    }

    public void setLbl20(JLabel lbl20) {
        this.lbl20 = lbl20;
    }

    public JLabel getLbl21() {
        return lbl21;
    }

    public void setLbl21(JLabel lbl21) {
        this.lbl21 = lbl21;
    }

    public JLabel getLbl22() {
        return lbl22;
    }

    public void setLbl22(JLabel lbl22) {
        this.lbl22 = lbl22;
    }

    public JLabel getLbl23() {
        return lbl23;
    }

    public void setLbl23(JLabel lbl23) {
        this.lbl23 = lbl23;
    }

    public JLabel getLbl24() {
        return lbl24;
    }

    public void setLbl24(JLabel lbl24) {
        this.lbl24 = lbl24;
    }

    public JLabel getLbl25() {
        return lbl25;
    }

    public void setLbl25(JLabel lbl25) {
        this.lbl25 = lbl25;
    }

    public JLabel getLbl26() {
        return lbl26;
    }

    public void setLbl26(JLabel lbl26) {
        this.lbl26 = lbl26;
    }

    public JLabel getLbl27() {
        return lbl27;
    }

    public void setLbl27(JLabel lbl27) {
        this.lbl27 = lbl27;
    }

    public JLabel getLbl28() {
        return lbl28;
    }

    public void setLbl28(JLabel lbl28) {
        this.lbl28 = lbl28;
    }

    public JLabel getLbl29() {
        return lbl29;
    }

    public void setLbl29(JLabel lbl29) {
        this.lbl29 = lbl29;
    }

    public JLabel getLbl3() {
        return lbl3;
    }

    public void setLbl3(JLabel lbl3) {
        this.lbl3 = lbl3;
    }

    public JLabel getLbl30() {
        return lbl30;
    }

    public void setLbl30(JLabel lbl30) {
        this.lbl30 = lbl30;
    }

    public JLabel getLbl4() {
        return lbl4;
    }

    public void setLbl4(JLabel lbl4) {
        this.lbl4 = lbl4;
    }

    public JLabel getLbl5() {
        return lbl5;
    }

    public void setLbl5(JLabel lbl5) {
        this.lbl5 = lbl5;
    }

    public JLabel getLbl6() {
        return lbl6;
    }

    public void setLbl6(JLabel lbl6) {
        this.lbl6 = lbl6;
    }

    public JLabel getLbl7() {
        return lbl7;
    }

    public void setLbl7(JLabel lbl7) {
        this.lbl7 = lbl7;
    }

    public JLabel getLbl8() {
        return lbl8;
    }

    public void setLbl8(JLabel lbl8) {
        this.lbl8 = lbl8;
    }

    public JLabel getLbl9() {
        return lbl9;
    }

    public void setLbl9(JLabel lbl9) {
        this.lbl9 = lbl9;
    }

    public JLabel getLblFichaJ1() {
        return lblFichaJ1;
    }

    public void setLblFichaJ1(JLabel lblFichaJ1) {
        this.lblFichaJ1 = lblFichaJ1;
    }

    public JLabel getLblFichaJ2() {
        return lblFichaJ2;
    }

    public void setLblFichaJ2(JLabel lblFichaJ2) {
        this.lblFichaJ2 = lblFichaJ2;
    }

    public JButton getBtnReiniciar() {
        return btnReiniciar;
    }

    public void setBtnReiniciar(JButton btnReiniciar) {
        this.btnReiniciar = btnReiniciar;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJ1;
    private javax.swing.JButton btnJ2;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel escalera;
    private javax.swing.JLabel escalera2;
    private javax.swing.JLabel escalera3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblFichaJ1;
    private javax.swing.JLabel lblFichaJ2;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlJuego;
    private javax.swing.JLabel serpiente;
    private javax.swing.JLabel serpiente2;
    private javax.swing.JLabel serpiente3;
    // End of variables declaration//GEN-END:variables

}
