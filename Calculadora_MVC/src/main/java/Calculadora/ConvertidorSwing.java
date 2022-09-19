/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import static Calculadora.InterfazView.SUMA;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;



/**
 *
 * @author JuanS
 */
public class ConvertidorSwing extends javax.swing.JInternalFrame implements InterfazView {

    private ConvertidorController controlador;

    public ConvertidorSwing() {
        super("Calculadora");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        btnSuma = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnPoten = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivi = new javax.swing.JButton();
        btnRadi = new javax.swing.JButton();
        lblResul = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setTitle("CALCULADORA");
        setVisible(true);

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });

        lblA.setText("A");

        lblB.setText("B");

        btnSuma.setText("SUMA");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnMulti.setText("MULTIPLICACIÓN");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnPoten.setText("POTENCIACIÓN");
        btnPoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenActionPerformed(evt);
            }
        });

        btnResta.setText("RESTA");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDivi.setText("DIVISIÓN");
        btnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });

        btnRadi.setText("RADICACIÓN");
        btnRadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiActionPerformed(evt);
            }
        });

        lblResul.setText("RESULTADO");

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblB)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPoten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtA))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRadi, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtB))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lblResul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA)
                    .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma)
                    .addComponent(btnResta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMulti)
                    .addComponent(btnDivi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPoten)
                    .addComponent(btnRadi))
                .addGap(18, 18, 18)
                .addComponent(lblResul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        controlador.actionPerformed(new ActionEvent(this, 0, SUMA));
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        controlador.actionPerformed(new ActionEvent(this, 0, RESTA));
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        controlador.actionPerformed(new ActionEvent(this, 0, MULTI));
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
        controlador.actionPerformed(new ActionEvent(this, 0, DIVI));
    }//GEN-LAST:event_btnDiviActionPerformed

    private void btnPotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenActionPerformed
        controlador.actionPerformed(new ActionEvent(this, 0, POTEN));
    }//GEN-LAST:event_btnPotenActionPerformed

    private void btnRadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiActionPerformed
        controlador.actionPerformed(new ActionEvent(this, 0, RADI));
    }//GEN-LAST:event_btnRadiActionPerformed

    @Override
    public void setControlador(ConvertidorController c) {
        this.controlador =  c;
        btnSuma.addActionListener(this.controlador);
        btnResta.addActionListener(this.controlador);
        btnMulti.addActionListener(this.controlador);
        btnDivi.addActionListener(this.controlador);
        btnPoten.addActionListener(this.controlador);
        btnRadi.addActionListener(this.controlador);
    }

    @Override
    public void arranca() {
        JFrame frame = new JFrame();
        JDesktopPane dp = new JDesktopPane();
        frame.getContentPane().add(dp);
        JPanel p = new JPanel();
        this.add(p);
        this.setClosable(false);
        dp.add(this);
        frame.setSize(420,390);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        this.setSize(400, 350);

    }

    @Override
    public double getA() {
        String s = null;
        try{
            s = txtA.getText();
            if(s.equals("Pi")){
                return Double.parseDouble("3.1416");
            }else if(s.equals("E")){
                return Double.parseDouble("2.7182");
            }
            return Double.parseDouble(txtA.getText());
        } catch (NumberFormatException e){
            return 0.0D;
        }
    }

    @Override
    public double getB() {
        String s = null;
        try{
            s = txtB.getText();
            if(s.equals("Pi")){
                return Double.parseDouble("3.1416");
            }else if(s.equals("E")){
                return Double.parseDouble("2.7182");
            }
            return Double.parseDouble(txtB.getText());
        } catch (NumberFormatException e){
            return 0.0D;
        }
    }
        
    @Override
    public void escribeResultado(String s) {
        lblResul.setText(s);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPoten;
    private javax.swing.JButton btnRadi;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblResul;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    // End of variables declaration//GEN-END:variables
}
