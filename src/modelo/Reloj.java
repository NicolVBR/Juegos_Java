package modelo;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import vista.FormularioRelojDig;
import java.util.Date;
import java.util.Observable;

public class Reloj extends Observable implements Runnable {

    FormularioRelojDig frmR;
    Thread hiloR = new Thread(this);
    int hr, min, seg;
    Date date;

    public Reloj(int hr, int min, int seg, FormularioRelojDig frmR) {
        this.hr = hr;
        this.min = min;
        this.seg = seg;
        this.frmR = frmR;
    }

    public Reloj() {
        this.hr = 0;
        this.min = 0;
        this.seg = 0;
        frmR = new FormularioRelojDig();
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    @Override
    public void run() {
        String tiempo = "";
        while (true) {
            tiempo = "";
            if (hr < 10) {
                tiempo += "0" + hr;
            } else {
                tiempo += hr;
            }
            tiempo += " : ";
            if (min < 10) {
                tiempo += "0" + min;
            } else {
                tiempo += min;
            }
            tiempo += " : ";
            if (seg < 10) {
                tiempo += "0" + seg;
            } else {
                tiempo += seg;
            }
            seg++;

            setChanged();
            notifyObservers(tiempo);
            clearChanged();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            if (seg == 60) {
                min++;
                seg = 0;
                if (min == 60) {
                    min = 0;
                    hr++;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (seg < 10) {
                return  hr + ":" + min + ":0" + (seg-1);
            } else {
                return  hr + ":" + min + ":" + (seg-1);
            }
        
    }
    

    public void IniciarReloj() {
        addObserver(frmR);
        hiloR.start();
    }

    public void PararReloj() {
        addObserver(frmR);
        hiloR.stop();
    }
}
