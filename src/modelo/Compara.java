package modelo;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import vista.*;
import java.util.Observable;
import javax.swing.table.DefaultTableModel;

public class Compara extends Observable{
    
    private Reloj objR;
    private JInternalNumDos frmNDC;
    private PuntajesND frmOND;
    private int numRamdon, i = 1;
    private String MensajeObserver = " ", msg = " ";
    private int numAdivinar;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setNumAdivinar() {
        this.numAdivinar = (int) ((Math.random () * (99 - 10)) + 10);
    }
    
    public Compara(Reloj objR,PuntajesND frmOND, JInternalNumDos frmNDC){
        this.objR = objR;
        this.frmOND = frmOND;
        this.frmNDC = frmNDC;
    }
    
    public int getNumRamdon() {
        return numRamdon;
    }

    public void setNumRamdon() {
        frmNDC.getBtnVerif().setEnabled(true);
        this.numRamdon = (int) ((Math.random () * (99 - 10)) + 10) ;
        if(numRamdon == numAdivinar){
            setNumRamdon(); 
        }
        msg = ".";
    }
    
    public String Comp( int NumComp){
        
        if(NumComp < 10 || NumComp > 99){
            MensajeObserver = "\nERROR: Número digitado invalido...\nIntente de nuevo...";
            frmNDC.getMostrarInformacion(MensajeObserver);
            return MensajeObserver;
        }
        else{
            if(numAdivinar > NumComp){
                MensajeObserver = "\nEl numero es mayor a: "+ NumComp ;
            }
            if(numAdivinar < NumComp){
                MensajeObserver = "\nEl numero es menor a: "+ NumComp ;
            }
            if(numAdivinar == NumComp){
                objR.PararReloj();
                frmNDC.getBtnVerif().setEnabled(false);
                MensajeObserver = "\nHa encontrado el numero \nFelicidades\n El numero era : " + NumComp;
                DefaultTableModel modelo;
                modelo = (DefaultTableModel) frmOND.getjTable2().getModel();
                Object[] fila = new Object[modelo.getColumnCount()];
                fila[0] = "La partida " + i;
                fila[1] = NumComp;
                fila[2] = (objR.toString());
                modelo.addRow(fila);
                frmOND.getjTable2().setModel(modelo);
                i++;
            }
            setChanged();
            notifyObservers(MensajeObserver + "-" + msg);
            return MensajeObserver;
        }   
    }
    
}
