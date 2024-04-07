 package modelo;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import java.util.ArrayList;
import java.util.List;
import vista.PanelSnake;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Caminar extends Observable implements Runnable {

    PanelSnake PnlS;
    boolean Estado = true;
    int Puntos = 0;
    
    public void reiniParts(int Cant){
        Estado = true;
        Puntos = 0;
        this.PnlS=PnlS;
        PnlS.setCant(Cant);
        List<int[]> snake;
        snake = PnlS.getSnake();
        snake = new ArrayList<>();
        int[] a = {(Cant / 2 - 1), (Cant / 2 - 1)};
        int[] b = {(Cant / 2), (Cant / 2 - 1)};
        snake.add(a);
        snake.add(b);
        GenerarComida();
        PnlS.setSnake(snake);
    }

    public Caminar(PanelSnake PnlS) {
        this.PnlS = PnlS;
    }

    @Override
    public void run() {
        while (Estado) {
            Avanzar();
            PnlS.repaint();
            try {
                Thread.sleep(400);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(Caminar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void Avanzar() {
        String MensajeObserver = "";
        PnlS.IgualarDir();
        int[] ultimo = PnlS.getSnake().get(PnlS.getSnake().size() - 1);
        int agregarX = 0;
        int agregarY = 0;
        boolean Existe = false;
        switch (PnlS.getDireccion()) {
            case ("D"): {
                agregarX = 1;
                break;
            }
            case ("I"): {
                agregarX = -1;
                break;
            }
            case ("AR"): {
                agregarY = -1;
                break;
            }
            case ("AB"): {
                agregarY = 1;
                break;
            }
        }
        int[] nuevo = {Math.floorMod(ultimo[0] + agregarX, PnlS.getCant()), Math.floorMod(ultimo[1] + agregarY, PnlS.getCant())};

        for (int[] parS : PnlS.getSnake()) {
            if ((nuevo[0] == parS[0]) && (nuevo[1] == parS[1])) {
                Existe = true;
                break;
            }
        }
        if (Existe) {
            setChanged();
            MensajeObserver =(Puntos + "-"+ Puntos) ;
            notifyObservers(MensajeObserver); 
            JOptionPane.showMessageDialog(  PnlS, "Haz perdido");
            parar();
        }
        else if ((nuevo[0] == PnlS.getComida()[0]) && (nuevo[1] == PnlS.getComida()[1])) {
            PnlS.getSnake().add(nuevo);
            GenerarComida();
            setChanged();
            Puntos++;
            MensajeObserver =(Puntos + "-.") ;
            notifyObservers(MensajeObserver); 
        }
        else {
            PnlS.getSnake().add(nuevo);
            PnlS.getSnake().remove(0);
        }
    }
    public void GenerarComida() {
        boolean existe = false;
        int a = (int) (Math.random() * PnlS.getCant());
        int b = (int) (Math.random() * PnlS.getCant());

        for (int[] par : PnlS.getSnake()) {
            if ((par[0] == a) && (par[1] == b)) {
                existe = true;
                GenerarComida();
                break;
            }
        }

        if (!existe) {
            PnlS.getComida()[0] = a;
            PnlS.getComida()[1] = b;
        }
    }

    
    public void parar() {
        this.Estado = false;
    }

}
