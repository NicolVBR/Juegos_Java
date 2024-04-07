package modelo;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import java.util.Observable;
import javax.swing.JLabel;
import vista.*;

public class Mover extends Observable  implements Runnable{
    Thread hilo;
    int posicionX , posicionY, numRamdom;
    JLabel lblAux;
    JInternalSerpientesYEscaleras internalSyE;
    int posXYAux[] = {0, 0};
    int pos, posAux, posAux2;
    
    public Mover(JLabel lblAux, JInternalSerpientesYEscaleras frmSyE, int ramdon){
        this.lblAux = lblAux;
        this.internalSyE = frmSyE;
        this.numRamdom = ramdon;
        this.hilo = new Thread(this);
    }
    
    public Mover() {     
    }
    
    public int getNumRamdom() {
        return numRamdom;
    }

    public void setNumRamdom() {
        this.numRamdom = (int) (Math.random () * ((6-1) +1)) + 1;
    }
    
    public Thread getHilo() {
        return hilo;
    }

    public void setHilo(Thread hilo) {
        this.hilo = hilo;
    }
    
    
    public void posiciones(int pos){
        if(pos == 1){
            internalSyE.EnviarPosX(lblAux, 100);
            internalSyE.EnviarPosY(lblAux, 380);
        }
        if(pos == 2){
            internalSyE.EnviarPosX(lblAux, 180);
            internalSyE.EnviarPosY(lblAux, 380);
        }
        if(pos == 10){
            internalSyE.EnviarPosX(lblAux, 260);
            internalSyE.EnviarPosY(lblAux, 300);
        }
        if(pos == 3){
            internalSyE.EnviarPosX(lblAux, 260);
            internalSyE.EnviarPosY(lblAux, 380);
            pos = 10;
        }
        if(pos == 4){
            internalSyE.EnviarPosX(lblAux, 340);
            internalSyE.EnviarPosY(lblAux, 380);
        }
        if(pos == 15){
            internalSyE.EnviarPosX(lblAux, 260);
            internalSyE.EnviarPosY(lblAux, 220);
        }
        if(pos == 5){
            internalSyE.EnviarPosX(lblAux, 420);
            internalSyE.EnviarPosY(lblAux, 380);
            pos = 15;
        }
        if(pos == 6){
            internalSyE.EnviarPosX(lblAux, 500);
            internalSyE.EnviarPosY(lblAux, 380);
        }
        if(pos == 19){
            internalSyE.EnviarPosX(lblAux, 500);
            internalSyE.EnviarPosY(lblAux, 140);
            pos = 6;
        }
        if(pos == 7){
            internalSyE.EnviarPosX(lblAux, 500);
            internalSyE.EnviarPosY(lblAux, 300);
        }
        if(pos == 8){
            internalSyE.EnviarPosX(lblAux, 420);
            internalSyE.EnviarPosY(lblAux, 300);
        }
        if(pos == 9){
            internalSyE.EnviarPosX(lblAux, 340);
            internalSyE.EnviarPosY(lblAux, 300);
        }
        if(pos == 11){
            internalSyE.EnviarPosX(lblAux, 180);
            internalSyE.EnviarPosY(lblAux, 300);
        }
        if(pos == 12){
            internalSyE.EnviarPosX(lblAux, 100);
            internalSyE.EnviarPosY(lblAux, 300);
        }
        if(pos == 22){
            internalSyE.EnviarPosX(lblAux, 260);
            internalSyE.EnviarPosY(lblAux, 140);
            pos = 12;
        }
        if(pos == 27){
            internalSyE.EnviarPosX(lblAux, 260);
            internalSyE.EnviarPosY(lblAux, 60);
        }
        if(pos == 13){
            internalSyE.EnviarPosX(lblAux, 100);
            internalSyE.EnviarPosY(lblAux, 220);
            pos = 27;
        }
        if(pos == 14){
            internalSyE.EnviarPosX(lblAux, 180);
            internalSyE.EnviarPosY(lblAux, 220);
        }
        if(pos == 16){
            internalSyE.EnviarPosX(lblAux, 340);
            internalSyE.EnviarPosY(lblAux, 220);
        }
        if(pos == 29){
            internalSyE.EnviarPosX(lblAux, 420);
            internalSyE.EnviarPosY(lblAux, 60);
            pos = 16;
        }
        if(pos == 17){
            internalSyE.EnviarPosX(lblAux, 420);
            internalSyE.EnviarPosY(lblAux, 220);
        }
        if(pos == 18){
            internalSyE.EnviarPosX(lblAux, 500);
            internalSyE.EnviarPosY(lblAux, 220);
        }
        if(pos == 20){
            internalSyE.EnviarPosX(lblAux, 420);
            internalSyE.EnviarPosY(lblAux, 140);
        }
        if(pos == 21){
            internalSyE.EnviarPosX(lblAux, 340);
            internalSyE.EnviarPosY(lblAux, 140);
        }
        if(pos == 23){
            internalSyE.EnviarPosX(lblAux, 180);
            internalSyE.EnviarPosY(lblAux, 140);
        }
        if(pos == 24){
            internalSyE.EnviarPosX(lblAux, 100);
            internalSyE.EnviarPosY(lblAux, 140);
        }
        if(pos == 25){
            internalSyE.EnviarPosX(lblAux, 100);
            internalSyE.EnviarPosY(lblAux, 60);
        }
        if(pos == 26){
            internalSyE.EnviarPosX(lblAux, 180);
            internalSyE.EnviarPosY(lblAux, 60);
        }
        if(pos == 28){
            internalSyE.EnviarPosX(lblAux, 340);
            internalSyE.EnviarPosY(lblAux, 60);
        }
        if(pos == 30){
            internalSyE.EnviarPosX(lblAux, 500);
            internalSyE.EnviarPosY(lblAux, 60);
        }
        if(pos > 30){
            pos -= numRamdom;
            internalSyE.posicionar(lblAux, pos);
            internalSyE.getMostrarInformacion("Valor del dado mayor al número necesario...\n Intente de nuevo");
            posiciones(pos);
        }
        if(lblAux == internalSyE.getLblFichaJ2()){
            internalSyE.EnviarPosY(lblAux, (internalSyE.traerPosY(lblAux)+30));
        }
        internalSyE.posicionar(lblAux, pos);
    }
    
    private void esperar(int espera){
        try{
            Thread.sleep(espera);
        }catch(Exception e){}
    }
    
    public void moverDerecha(int posX, int posY){
        for(int i = posX;i <= internalSyE.traerPosX(lblAux);i++){
            this.lblAux.setBounds(i, posY, 20, 20);
            esperar(7);
        }
    }
    public void moverIzquierda(int posX, int posY){
        for(int i = posX;i >= internalSyE.traerPosX(lblAux);i--){
            this.lblAux.setBounds(i, posY, 20, 20);
            esperar(7);
        }
    }
    public void moverArriba(int posX, int posY){
        for(int i = posY;i <= internalSyE.traerPosY(lblAux);i++){
            this.lblAux.setBounds(posX, i, 20, 20);
            esperar(7);
        }
    }
    public void moverAbajo(int posX, int posY){
        for(int i = posY;i >= internalSyE.traerPosY(lblAux);i--){
            this.lblAux.setBounds(posX, i, 20, 20);
            esperar(7);
        }
    }
    
    
    public void run(){
        String Mensaje, win = " ";
        pos = (internalSyE.traerPosicion(lblAux)+numRamdom);
        internalSyE.posicionar(lblAux, pos);
        internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
        posXYAux = internalSyE.traerPosXYAux(lblAux);
        posAux2 = pos;
        posiciones(pos);
        if(pos == 1 || pos == 2 || pos == 3 || pos == 4 || pos == 5 || pos == 6 ||
           pos == 13 || pos == 14 || pos == 15 || pos == 16 || pos == 17 || pos == 18 ||
           pos == 25 || pos == 26 || pos == 27 || pos == 28 || pos == 29 || pos == 30){
            posAux = internalSyE.traerPosicion(lblAux);
            if(pos >= 13 && pos <= 18 && (pos-numRamdom) < 13 && posAux != 5){
                pos = 12;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverIzquierda(posXYAux[0], posXYAux[1]);
                esperar(700);
                pos = 13;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverArriba(posXYAux[0], posXYAux[1]);
                esperar(700);
                pos = posAux;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverDerecha(posXYAux[0], posXYAux[1]);
                esperar(500);
            }
            if(pos >= 25 && pos <= 30 && (pos-numRamdom) < 25 && posAux2 != 13){
                pos = 24;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverIzquierda(posXYAux[0], posXYAux[1]);
                esperar(700);
                pos = 25;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverArriba(posXYAux[0], posXYAux[1]);
                esperar(700);
                pos = posAux;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverDerecha(posXYAux[0], posXYAux[1]);
                esperar(500);
            }
            moverDerecha(posXYAux[0], posXYAux[1]);
            if(pos == 5){
                pos = posAux;
                posiciones(pos);
                this.lblAux.setBounds(internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux), 20, 20);
            }
            if(pos == 13){
                pos = posAux;
                posiciones(pos);
                this.lblAux.setBounds(internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux), 20, 20);
            }
            if(pos == 3){
                pos = posAux;
                posiciones(pos);
                this.lblAux.setBounds(internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux), 20, 20);
            }
            if(pos == 29){
                pos = posAux;
                posiciones(pos);
                this.lblAux.setBounds(internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux), 20, 20);
            }
            if(pos == 30){
                win = ".";
                internalSyE.getMostrarInformacion("El jugador " + lblAux.getName().toString() + " ha ganado el juego");
                internalSyE.getBtnJ1().setEnabled(false);
                internalSyE.getBtnJ2().setEnabled(false);
                internalSyE.posicionar(lblAux, 30);
                internalSyE.setGanador(true);
            }
        }
        if(pos == 7 || pos == 8 || pos == 9 || pos == 10 || pos == 11 || pos == 12 ||
           pos == 19 || pos == 20 || pos == 21 || pos == 22 || pos == 23 || pos == 24){
            if(pos >= 7 && pos <= 12 && (pos-numRamdom) < 7){
                posAux = internalSyE.traerPosicion(lblAux);
                pos = 6;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverDerecha(posXYAux[0], posXYAux[1]);
                esperar(700);
                pos = 7;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverArriba(posXYAux[0], posXYAux[1]);
                esperar(700);
                pos = posAux;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverIzquierda(posXYAux[0], posXYAux[1]);
                esperar(500);
            }
            if(pos >= 19 && pos <= 24 && (pos-numRamdom)<19){
                posAux = internalSyE.traerPosicion(lblAux);
                pos = 18;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverDerecha(posXYAux[0], posXYAux[1]);
                esperar(700);
                pos = 19;
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverArriba(posXYAux[0], posXYAux[1]);
                esperar(700);
                if(posAux2 == 22){
                    pos = posAux2;
                }
                else{
                    pos = posAux;
                }
                posiciones(pos);
                internalSyE.EnviarPosXYAux(lblAux, internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux));
                posXYAux = internalSyE.traerPosXYAux(lblAux);
                moverIzquierda(posXYAux[0], posXYAux[1]);
                esperar(500);
            }
            moverIzquierda(posXYAux[0], posXYAux[1]);
            if(pos == 22){
                pos = internalSyE.traerPosicion(lblAux);
                esperar(200);
                posiciones(pos);
                this.lblAux.setBounds(internalSyE.traerPosX(lblAux), internalSyE.traerPosY(lblAux), 20, 20);
            }
        }
        setChanged();
        Mensaje = (lblAux.getName().toString() + "-" + pos + "-" + win);
        notifyObservers(Mensaje);
    }
    
    public void resetInfo(){
        internalSyE.setPosXJ1(20);
        internalSyE.setPosYJ1(380);
        internalSyE.setPosXJ2(20);
        internalSyE.setPosYJ2(410);
        internalSyE.setPosXYAuxJ1(0, 0);
        internalSyE.setPosXYAuxJ2(0, 0);
        internalSyE.setPosJ1(0);
        internalSyE.setPosJ2(0);
    }
}