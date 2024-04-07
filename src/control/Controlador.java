package control;

//Nicol Valentina Barajas Rivera - 20201578070
//Javier Santiago Ramirez Marin - 20201578032

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;

public class Controlador implements ActionListener {

    private Juegos frmJ;
    //-----------SERPIENTES Y ESCALERAS-----------//
    private JInternalSerpientesYEscaleras internalSyE;
    private PuntajesSyE frmPuntSyE;
    Mover J1, J2;
    //-----------SNAKE-----------//
    PuntosSnake frmPS;
    PanelSnake PnlS;
    JInternalSnake internalSnake;
    Thread objH;
    Caminar objC;
    //-----------ENCONTRAR UN NÚMERO-----------//
    private PuntajesND frmPND;
    private Compara objN;
    private JInternalNumDos internalND;
    //----------- RELOJ DIGITAL -----------//
    private Reloj objR;
    private FormularioRelojDig frmR;

    public Controlador() {
        this.frmJ = new Juegos();
        //----------- RELOJ DIGITAL -----------//
        this.frmR = new FormularioRelojDig();
        //-----------SERPIENTES Y ESCALERAS-----------//
        this.internalSyE = new JInternalSerpientesYEscaleras();
        frmPuntSyE = new PuntajesSyE();
        frmJ.getEscritorio().add(internalSyE);
        frmJ.getOpcSerpyEsc().addActionListener(this);
        internalSyE.getBtnSalida().addActionListener(this);
        internalSyE.getBtnReiniciar().addActionListener(this);
        internalSyE.getBtnJ1().addActionListener(this);
        internalSyE.getBtnJ2().addActionListener(this);
        //-----------SNAKE-----------//
        frmJ.getOpcSnake().addActionListener(this);
        frmPS = new PuntosSnake();
        internalSnake = new JInternalSnake();
        internalSnake.setBounds(0,0,870,800);
        PnlS = new PanelSnake(750, 15);
        frmJ.getEscritorio().add(internalSnake);
        this.internalSnake.add(PnlS);
        PnlS.setBounds(10, 10, 750, 750);
        PnlS.setOpaque(false);
        PanelFondo fondo = new PanelFondo(750, 15);
        this.internalSnake.add(fondo);
        fondo.setBounds(10, 10, 750, 750);
        PnlS.requestFocus(true);
        internalSnake.getBtnSalida().addActionListener(this);
        internalSnake.getBtnReiniciar().addActionListener(this);
        //-----------ENCONTRAR UN NÚMERO-----------//
        frmPND = new PuntajesND();
        internalND = new JInternalNumDos();
        frmJ.getEscritorio().add(internalND);
        internalND.getBtnVerif().addActionListener(this);
        frmJ.getOpcNumC().addActionListener(this);
        internalND.getBtnReiniciar().addActionListener(this);
        internalND.getBtnSalida().addActionListener(this);
        //-----------OTRAS OPCIONES-----------//
        frmJ.getOpcSalir().addActionListener(this);
    }

    public void iniciar() {
        frmJ.setVisible(true);
        frmJ.setLocationRelativeTo(null);
        //----------- RELOJ DIGITAL -----------//
        frmR.setVisible(true);
        frmR.setLocation(100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //----------------------------------------------------------------------SERPIENTES Y ESCALERAS----------------------------------------------------------------------//
        if (e.getSource().equals(frmJ.getOpcSerpyEsc())) {
            objR = new Reloj(0, 0, 0, frmR);
            objR.IniciarReloj();
            frmPuntSyE.RelojC(objR);
            internalSyE.setVisible(true);
            internalSyE.getBtnJ1().setEnabled(true);
            internalSyE.getBtnJ2().setEnabled(false);
            frmPuntSyE.setVisible(true);
            frmPuntSyE.setLocation(1400, 100);
        }
        if (e.getSource().equals(internalSyE.getBtnJ1())) {
            Mover dado1 = new Mover();
            dado1.setNumRamdom();
            internalSyE.getLblFichaJ1().setName("Jugador 1");
            J1 = new Mover(internalSyE.getLblFichaJ1(), internalSyE, dado1.getNumRamdom());
            J1.addObserver(frmPuntSyE);
            J1.getHilo().start();
            internalSyE.getBtnJ1().setEnabled(false);
            internalSyE.getBtnJ2().setEnabled(true);
        }
        if (e.getSource().equals(internalSyE.getBtnJ2())) {
            Mover dado2 = new Mover();
            dado2.setNumRamdom();
            internalSyE.getLblFichaJ2().setName("Jugador 2");
            J2 = new Mover(internalSyE.getLblFichaJ2(), internalSyE, dado2.getNumRamdom());
            J2.addObserver(frmPuntSyE);
            J2.getHilo().start();
            internalSyE.getBtnJ1().setEnabled(true);
            internalSyE.getBtnJ2().setEnabled(false);
        }
        if (e.getSource().equals(internalSyE.getBtnSalida())) {
            int resp = frmJ.setCapturaDecision("¿Desea salir del juego Serpientes y escaleras?...");
            if (resp == 0) {
                internalSyE.setVisible(false);
                frmPuntSyE.setVisible(false);
                objR.PararReloj();
                internalSyE.getLblFichaJ1().setBounds(20, 380, 20, 20);
                internalSyE.getLblFichaJ2().setBounds(20, 410, 20, 20);
                J1.resetInfo();
            }

        }
        if (e.getSource().equals(internalSyE.getBtnReiniciar())) {
            int resp2 = frmJ.setCapturaDecision("¿Desea reiniciar el juego?...");
            if (resp2 == 0) {
                objR.PararReloj();
                internalSyE.getLblFichaJ1().setBounds(20, 380, 20, 20);
                internalSyE.getLblFichaJ2().setBounds(20, 410, 20, 20);
                J1.resetInfo();
                objR = new Reloj(0, 0, 0, frmR);
                objR.IniciarReloj();
                frmPuntSyE.RelojC(objR);
                internalSyE.getBtnJ1().setEnabled(true);
                internalSyE.getBtnJ2().setEnabled(false);
            }
        }
        //----------------------------------------------------------------------SNAKE----------------------------------------------------------------------//
        if (e.getSource().equals(frmJ.getOpcSnake())) {
            objC = new Caminar(PnlS);
            objC.reiniParts(15);
            objH = new Thread(objC);
            objR = new Reloj(0, 0, 0, frmR);
            objR.IniciarReloj();
            frmPS.RelojC(objR);
            frmPS.setVisible(true);
            frmPS.setLocation(1400, 100);
            internalSnake.setVisible(true);
            PnlS.requestFocus(true);
            objH.start();
            objC.addObserver(frmPS);
        }
        if (e.getSource().equals(internalSnake.getBtnSalida())) {
             int resp = frmJ.setCapturaDecision("¿Desea salir del juego Snake?...");
            if (resp == 0) {
                objR.PararReloj();
                internalSnake.setVisible(false);
                frmPS.setVisible(false);
                frmPS.getTxtAPuntos().setText("");
                objH.stop();
                PnlS.requestFocus(true);
            }
            else{
                PnlS.requestFocus(true);
            }
        }
        if (e.getSource().equals(internalSnake.getBtnReiniciar())) {
             int resp2 = frmJ.setCapturaDecision("¿Desea reiniciar el juego?...");
            if (resp2 == 0) {
                frmPS.getTxtAPuntos().setText("");
                objR.PararReloj();
                objH.stop();
                objC = new Caminar(PnlS);
                objC.reiniParts(15);
                objH = new Thread(objC);
                objH.start();
                objC.addObserver(frmPS);
                objR = new Reloj(0, 0, 0, frmR);
                objR.IniciarReloj();
                frmPS.RelojC(objR);
                PnlS.requestFocus(true);
            }
            else{
                PnlS.requestFocus(true);
            }
        }
        //----------------------------------------------------------------------ENCONTRAR UN NÚMERO----------------------------------------------------------------------//
        if (e.getSource().equals(frmJ.getOpcNumC())) {
            objR = new Reloj(0, 0, 0, frmR);
            objR.IniciarReloj();
            objN = new Compara(objR, frmPND, internalND);
            internalND.setVisible(true);
            frmPND.setVisible(true);
            frmPND.setLocation(1400, 100);
            objN.addObserver(frmPND);
            objN.setNumRamdon();
            objN.setNumAdivinar();
            internalND.getTxtAComp().setText(objN.Comp(objN.getNumRamdon()));
        }
        if (e.getSource().equals(internalND.getBtnVerif())) {
            if(internalND.getTxtNumVerf().getText().equals("")){
                internalND.getMostrarInformacion("ERROR: No ha digitado número...");
            }
            else{
                objN.setMsg(" ");
                internalND.getTxtAComp().setText(objN.Comp(Integer.parseInt(internalND.getTxtNumVerf().getText())));
                internalND.getTxtNumVerf().setText("");
                internalND.getTxtNumVerf().requestFocus();
            }
        }
        if (e.getSource().equals(internalND.getBtnReiniciar())) {
            int resp2 = frmJ.setCapturaDecision("¿Desea reiniciar el juego?...");
            if (resp2 == 0) {
                objR.PararReloj();
                frmPND.getjTextArea1().setText("");
                objR = new Reloj(0, 0, 0, frmR);
                objR.IniciarReloj();
                objN = new Compara(objR, frmPND, internalND);
                objN.addObserver(frmPND);
                objN.setNumRamdon();
                objN.setNumAdivinar();
                internalND.getTxtAComp().setText(objN.Comp(objN.getNumRamdon()));
            }
        }
        if (e.getSource().equals(internalND.getBtnSalida())) {
            int resp = frmJ.setCapturaDecision("¿Desea salir del juego Encontrar un número?...");
            if (resp == 0) {
                objR.PararReloj();
                internalND.setVisible(false);
                frmPND.setVisible(false);
                frmPND.getjTextArea1().setText("");
            }
        }
        //----------------------------------------------------------------------OTRAS OPCIONES----------------------------------------------------------------------//
        if (e.getSource().equals(frmJ.getOpcSalir())) {
            int resp = frmJ.setCapturaDecision("¿Desea salir del programa?...");
            if (resp == 0) {
                System.exit(0);
            }
        }
    }
}
