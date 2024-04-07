package vista;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import java.awt.*;
import javax.swing.JPanel;

public class PanelFondo extends JPanel {

    int tamMax, tam, Cant, res;

    public PanelFondo(int tamMax, int Cant) {
        this.tamMax = tamMax;
        this.Cant = Cant;
        this.tam = tamMax / Cant;
        this.res = tamMax % Cant;
    }

    @Override
    public void paint(Graphics p) {
        super.paint(p);
        p.setColor(java.awt.Color.lightGray);
        for (int i = 0; i < Cant; i++) {
            for (int j = 0; j < Cant; j++) {
                p.fillRect((res / 2 + i * tam), (j * tam), (tam - 1), (tam - 1));
            }

        }

    }
}
