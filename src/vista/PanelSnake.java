package vista;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import modelo.Caminar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class PanelSnake extends JPanel implements KeyListener{

    Color colorSnake = Color.MAGENTA;
    Color colorComida = Color.ORANGE;
    int tamMax, tam, Cant, res;
    List<int[]> snake = new ArrayList<>();
    int[] comida = new int[2];
    Caminar objC = new Caminar(this);
    String direccion = "D";
    String direccionProx = "D";
    
    public PanelSnake(int tamMax, int Cant) {
        addKeyListener(this);
        //comida = new int[2];
        this.tamMax = tamMax;
        this.Cant = Cant;
        this.tam = tamMax / Cant;
        this.res = tamMax % Cant;
        int[] a = {(Cant / 2 - 1), (Cant / 2 - 1)};
        int[] b = {(Cant / 2), (Cant / 2 - 1)};
        snake.add(a);
        snake.add(b);
        objC.GenerarComida();
    }

    @Override
    public void paint(Graphics p) {
        super.paint(p);
        p.setColor(colorSnake);
        //Pintor de serpiente
        for (int[] par : snake) {
            p.fillRect((res / 2 + par[0] * tam), (par[1] * tam), (tam - 1), (tam - 1));
        }
        //pintor de comida
        p.setColor(colorComida);
        p.fillRect((res / 2 + comida[0] * tam), (comida[1] * tam), (tam - 1), (tam - 1));
    }

    public void CambiarDir(String Dir) {
        if((this.direccion.equals("D") || this.direccion.equals("I")) && (Dir.equals("AR") || Dir.equals("AB"))){
            this.direccionProx = Dir;
        }
//        if((this.direccion.equals("AR") || this.direccion.equals("AB")) && (Dir.equals("I") || Dir.equals("D"))){
//            this.direccionProx = Dir;
//        }
    }
    public void IgualarDir() {
        this.direccion = direccionProx;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case (KeyEvent.VK_LEFT): {
                CambiarDir("I");
                break;
            }
            case (KeyEvent.VK_RIGHT): {
                CambiarDir("D");
                break;
            }
            case (KeyEvent.VK_UP): {
                CambiarDir("AR");
                break;
            }
            case (KeyEvent.VK_DOWN): {
                CambiarDir("AB");
                break;
            }
            default: {
                break;
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }

    public int getTamMax() {
        return tamMax;
    }
    public void setTamMax(int tamMax) {
        this.tamMax = tamMax;
    }

    public int getTam() {
        return tam;
    }
    public void setTam(int tam) {
        this.tam = tam;
    }

    public List<int[]> getSnake() {
        return snake;
    }
    public void setSnake(List<int[]> snake) {
        this.snake = snake;
    }

    public int[] getComida() {
        return comida;
    }
    public void setComida(int[] comida) {
        this.comida = comida;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public int getCant() {
        return Cant;
    }
    public void setCant(int Cant) {
        this.Cant = Cant;
    }
}
