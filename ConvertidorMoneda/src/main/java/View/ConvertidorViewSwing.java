/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConvertidorController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;  
import java.awt.event.*;  


public class ConvertidorViewSwing extends JFrame implements InterfazView  {
    private ConvertidorController controlador;
    private JButton convertirAPesos;
    private JButton convertirADolares;
    private JTextField cantidad;
    private JLabel resultado;

    public ConvertidorViewSwing() {
        super("Conversor de Pesos y Dolares");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        cantidad = new JTextField(8);
        JPanel panelaux = new JPanel();
        panelaux.add(cantidad);
        panelPrincipal.add(panelaux, BorderLayout.NORTH);
        resultado = new JLabel("Indique una cantidad y pulse uno de los botones");
        JPanel panelaux2 = new JPanel();
        panelaux2.add(resultado);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        convertirAPesos = new JButton("A pesos");
        convertirAPesos.setActionCommand(APESOS);
        convertirADolares = new JButton("A dolares");
        convertirADolares.setActionCommand(ADOLAR);
        JPanel botonera = new JPanel();
        botonera.add(convertirAPesos);
        botonera.add(convertirADolares);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);

    }

    @Override
    public void setControlador(ConvertidorController c) {
        controlador = c;
        convertirAPesos.addActionListener(this.controlador);
        convertirADolares.addActionListener(this.controlador);
    }

    @Override
    public void arranca() {
        pack();// coloca los componentes
        setLocationRelativeTo(null);// centra la ventana en la pantalla
        setVisible(true);// visualiza la ventana
    }

    @Override
    public double getCantidad() {
        try {
            return Double.parseDouble(cantidad.getText());
        } catch (NumberFormatException e) {
            return 0.0D;
        }
    }

    @Override
    public void escribeCambio(String s) {
        resultado.setText(s);
    }
    
}
