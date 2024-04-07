package vista;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import modelo.Caminar;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import modelo.Reloj;

public class PuntosSnake extends javax.swing.JFrame implements Observer {
    
    private Reloj objR;
    
    public PuntosSnake() {
        initComponents();
    }
      
    public void RelojC(Reloj objR){
        this.objR = objR;
    }

    public JTextArea getTxtAPuntos() {
        return txtAPuntos;
    }

    public void setTxtAPuntos(JTextArea txtAPuntos) {
        this.txtAPuntos = txtAPuntos;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAPuntos = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        txtAPuntos.setColumns(20);
        txtAPuntos.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        txtAPuntos.setRows(5);
        jScrollPane1.setViewportView(txtAPuntos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Puntos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Partida", "Puntos", "Tiempo"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registros Ganadores/Perdedores", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAPuntos;
    // End of variables declaration//GEN-END:variables
    
    int i = 1;
    DefaultTableModel modelo;
    @Override
    public void update(Observable o, Object arg) {
        Caminar aux = (Caminar) o;
        String PuntosS = "" + arg;
        String[] parts = PuntosS.split("-");
        String part1 = parts[0];
        String part2 = parts[1];
        this.txtAPuntos.setText("" + part1);
        if (part2.equals(part1)) {
            modelo = (DefaultTableModel) jTable1.getModel();
            Object[] fila = new Object[modelo.getColumnCount()];
            fila[0] = "La partida " + i;
            fila[1] = part2;
            fila[2] = (objR.toString());
            modelo.addRow(fila);
            jTable1.setModel(modelo);
            i++;
            objR.PararReloj();
        }
    }
}
