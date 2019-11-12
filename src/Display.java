
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display {

    private JFrame ventana;
    private JButton botonBinomial, botonPoisson, botonHiper;
    private JPanel panel;
    private Graphics g;

    public Display() {
        configBotones();
        configVentana();
        configPanel();
    }

    private void configVentana() {

        this.ventana = new JFrame();
        this.ventana.setTitle("Calculo de probabilidad - Estadistica");
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setSize(400, 400);
        this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ventana.setResizable(false);
        this.ventana.setVisible(true);
    }

    private void configPanel() {
        this.panel = new JPanel();
        this.panel.setBackground(Color.DARK_GRAY);
        this.panel.add(botonBinomial);
        this.panel.add(botonPoisson);
        this.panel.add(botonHiper);
        this.ventana.add(this.panel);
    }

    private void configBotones() {
        this.botonBinomial = new JButton("Binomial");
        this.botonHiper = new JButton("Hipergeometrica");
        this.botonPoisson = new JButton("Poisson");

        botonBinomial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Binomial.calcular();
            }
        });
        botonPoisson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Poisson.calcular();
            }
        });
        botonHiper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HiperGeometrica.calcular();
            }
        });
    }


}
