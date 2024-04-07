package vista;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Juegos extends javax.swing.JFrame {

    public Juegos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcSerpyEsc = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opcSnake = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        opcNumC = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opcSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(900, 900));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jMenu1.setText("Juegos");

        opcSerpyEsc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoSyE.gif"))); // NOI18N
        opcSerpyEsc.setText("Serpientes y escaleras");
        jMenu1.add(opcSerpyEsc);
        jMenu1.add(jSeparator1);

        opcSnake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoSnake.gif"))); // NOI18N
        opcSnake.setText("Snake");
        jMenu1.add(opcSnake);
        jMenu1.add(jSeparator2);

        opcNumC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoEN.gif"))); // NOI18N
        opcNumC.setText("Encontrar un número");
        jMenu1.add(opcNumC);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        opcSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.gif"))); // NOI18N
        opcSalir.setText("Salir");
        jMenu2.add(opcSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getMostrarInformacion(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    
    public String setCapturaInformacion(String texto){
        return(JOptionPane.showInputDialog(texto));
    }
    
    public int setCapturaDecision(String texto){
        return(JOptionPane.showConfirmDialog(null, texto, "SALIR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }
    
    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuItem getOpcSalir() {
        return opcSalir;
    }

    public void setOpcSalir(JMenuItem opcSalir) {
        this.opcSalir = opcSalir;
    }

    public JMenuItem getOpcSerpyEsc() {
        return opcSerpyEsc;
    }

    public void setOpcSerpyEsc(JMenuItem opcSerpyEsc) {
        this.opcSerpyEsc = opcSerpyEsc;
    }

    public JMenuItem getOpcNumC() {
        return opcNumC;
    }

    public void setOpcNumC(JMenuItem opcNumC) {
        this.opcNumC = opcNumC;
    }

    public JMenuItem getOpcSnake() {
        return opcSnake;
    }

    public void setOpcSnake(JMenuItem opcSnake) {
        this.opcSnake = opcSnake;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem opcNumC;
    private javax.swing.JMenuItem opcSalir;
    private javax.swing.JMenuItem opcSerpyEsc;
    private javax.swing.JMenuItem opcSnake;
    // End of variables declaration//GEN-END:variables
}
