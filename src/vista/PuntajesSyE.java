package vista;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import java.util.Observable;
import java.util.Observer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Mover;
import modelo.Reloj;

public class PuntajesSyE extends javax.swing.JFrame implements Observer{

    private Reloj objR;
    
    public void RelojC(Reloj objR){
        this.objR = objR;
    }
    
    public PuntajesSyE() {
        initComponents();
    }

    public JTable getjTableMovimientos() {
        return jTableMovimientos;
    }

    public void setjTableMovimientos(JTable jTableMovimientos) {
        this.jTableMovimientos = jTableMovimientos;
    }

    public JTable getTablaGanadores() {
        return tablaGanadores;
    }

    public void setTablaGanadores(JTable tablaGanadores) {
        this.tablaGanadores = tablaGanadores;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMovimientos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaGanadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableMovimientos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTableMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Movimiento"
            }
        ));
        jScrollPane1.setViewportView(jTableMovimientos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Movimientos Realizados", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Partida", "Jugador", "Tiempo"
            }
        ));
        jScrollPane3.setViewportView(tablaGanadores);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 190));

        jTabbedPane3.addTab("Ganador ", jPanel3);

        getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 470, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTableMovimientos;
    private javax.swing.JTable tablaGanadores;
    // End of variables declaration//GEN-END:variables

    
    DefaultTableModel modelo, modelo2;
    int i = 1;
    
    @Override
    public void update(Observable o, Object o1) {
        Mover aux= (Mover)o; 
        modelo = (DefaultTableModel) jTableMovimientos.getModel();
        String Jugador = ""+o1;
        String[] parts = Jugador.split("-");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        Object [] fila = new Object [modelo.getColumnCount()];
        fila[0] = part1;
        fila[1] = part2;
        modelo.addRow(fila);
        jTableMovimientos.setModel(modelo);
        if(part3.equals(".")){
            objR.PararReloj();
            modelo2 = (DefaultTableModel) tablaGanadores.getModel();
            Object [] fila2 = new Object [modelo2.getColumnCount()];
            fila2[0] = "Partida"+ i;
            fila2[1] = part1;
            fila2[2] = (objR.toString());
            modelo2.addRow(fila2);
            tablaGanadores.setModel(modelo2);
            i++;
        }
    }

}
