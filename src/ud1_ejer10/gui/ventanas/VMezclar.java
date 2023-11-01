/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
Lista de paquetes:
 */
package ud1_ejer10.gui.ventanas;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import ud1_ejer10.logica.Logica;

/**
 * Pantalla principal de la aplicacion. 
 * Contiene:
 *  - dos campos para nombres
 *  - boton mezclar
 *  - boton reiniciar
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class VMezclar extends javax.swing.JFrame {

    /**
     * Pantalla principal
     * @param mezcladoraNombres  Referencia a la logica de negocio(controlador)
     */
    public VMezclar(String nombreUsuario) {
        initComponents();
        initPropio(nombreUsuario);

    }
    private void initPropio(String nombreUsuario) {
        this.setTitle("Mezcladora de nombres - Usuario: "+ nombreUsuario);
        this.resetInterface();
        this.addWindowListener(new WindowListenerEjer10());
    }
    /*
     * Metodos propios 
     */
    /**
     * Controla el aviso de error
     */
    public void avisoError() {
        //creacion y muestra de la pantlla de error
        JOptionPane.showMessageDialog(this, "Los nombres de la pareja deben contener como mínimo 4 letras, si no, no habrá amor.","Error", JOptionPane.ERROR_MESSAGE);
        //desactivar la parte de la ventana referente a la muestra de resultado
        desactivarResultado();
    }

    /**
     * Reinicia la interface y actualiza la hora
     */
    public void resetInterface() {
        this.activarIntroducion();
        this.desactivarResultado();
        this.ponerHora();
    }

    /**
     * Activa los campos de introduccion de nombres y el boton de mezclar
     */
    public void activarIntroducion() {
        this.inputNombre1.setText("");
        this.inputNombre1.setEnabled(true);
        this.inputNombre2.setText("");
        this.inputNombre2.setEnabled(true);
        this.btnMezclar.setEnabled(true);
    }

    /**
     * Desactiva los campos de introduccion y el boton de mezclar
     */
    public void desactivarIntroduccion() {
        this.inputNombre1.setEnabled(false);
        this.inputNombre2.setEnabled(false);
        this.btnMezclar.setEnabled(false);
    }

    /**
     * Activa los campos de resultado
     */
    public void activarResultado(String resultado) {
        this.desactivarIntroduccion();
        this.textoResultado.setEnabled(true);
        this.btnReiniciar.setEnabled(true);
        this.textoResultado.setText(resultado);
    }

    /**
     * Desactiva los campos de resultado
     */
    public void desactivarResultado() {
        this.textoResultado.setText("");
        this.textoResultado.setEnabled(false);
        this.btnReiniciar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();
        lbNombre1 = new javax.swing.JLabel();
        inputNombre1 = new javax.swing.JTextField();
        lbNombre2 = new javax.swing.JLabel();
        inputNombre2 = new javax.swing.JTextField();
        btnMezclar = new javax.swing.JButton();
        lbResultado = new javax.swing.JLabel();
        jScrollPaneTexto = new javax.swing.JScrollPane();
        textoResultado = new javax.swing.JTextArea();
        btnReiniciar = new javax.swing.JButton();
        lbSonLas = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        panelVolverAlMenu = new javax.swing.JPanel();
        btnVolverAlMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pantalla Main");
        setAlwaysOnTop(true);
        setResizable(false);

        panelSuperior.setBackground(new java.awt.Color(0, 102, 51));

        lbTitulo.setFont(new java.awt.Font("Caladea", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Mezcladora de nombres de pareja");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSuperiorLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        lbNombre1.setText("Ingresa el primer nombre:");

        inputNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombre1ActionPerformed(evt);
            }
        });

        lbNombre2.setText("Ingresa el segundo nombre:");

        inputNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombre2ActionPerformed(evt);
            }
        });

        btnMezclar.setText("Mezclar");
        btnMezclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMezclarActionPerformed(evt);
            }
        });

        lbResultado.setText("Estos son los posibles nombres mezclados:");

        textoResultado.setEditable(false);
        textoResultado.setColumns(20);
        textoResultado.setLineWrap(true);
        textoResultado.setRows(3);
        textoResultado.setEnabled(false);
        textoResultado.setMinimumSize(new java.awt.Dimension(200, 20));
        textoResultado.setOpaque(false);
        textoResultado.setPreferredSize(new java.awt.Dimension(312, 52));
        jScrollPaneTexto.setViewportView(textoResultado);

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setEnabled(false);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        lbSonLas.setText("Son las:");

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbResultado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                        .addComponent(btnMezclar)
                        .addGap(68, 68, 68)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addComponent(jScrollPaneTexto)
                        .addContainerGap())
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addComponent(lbSonLas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReiniciar)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre1)
                    .addComponent(lbNombre2))
                .addGap(145, 145, 145))
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMezclar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbSonLas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnVolverAlMenu.setText("Volver al menú principal");
        btnVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAlMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVolverAlMenuLayout = new javax.swing.GroupLayout(panelVolverAlMenu);
        panelVolverAlMenu.setLayout(panelVolverAlMenuLayout);
        panelVolverAlMenuLayout.setHorizontalGroup(
            panelVolverAlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVolverAlMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolverAlMenu))
        );
        panelVolverAlMenuLayout.setVerticalGroup(
            panelVolverAlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVolverAlMenuLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(btnVolverAlMenu))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelVolverAlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVolverAlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombre1ActionPerformed

    private void inputNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombre2ActionPerformed

    /**
     * Acciiones ejecutadas al pulsar el boton Mezclar
     * @param evt Evento recibido
     */
    private void btnMezclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMezclarActionPerformed
        // recoger datos
        String nombre1 = inputNombre1.getText();
        String nombre2 = inputNombre2.getText();
        // enviarlos a logica negocio
        String mezcla = Logica.mezclarMezcla(nombre1, nombre2);
        if (mezcla == null)
            avisoError();
         else
            activarResultado(mezcla);
    }//GEN-LAST:event_btnMezclarActionPerformed

    /**
     * Accion ejecutada al pulsar el boton Reiniciar
     * @param evt  Evento recibido
     */
    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        this.resetInterface();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAlMenuActionPerformed
        Logica.volverAlMenuPrincipal();
        this.dispose();
    }//GEN-LAST:event_btnVolverAlMenuActionPerformed


    //muestra la hora en la ventana principal
    private void ponerHora(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        
        this.lbHora.setText(sdf.format(date));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMezclar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVolverAlMenu;
    private javax.swing.JTextField inputNombre1;
    private javax.swing.JTextField inputNombre2;
    private javax.swing.JScrollPane jScrollPaneTexto;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbNombre2;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbSonLas;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelVolverAlMenu;
    private javax.swing.JTextArea textoResultado;
    // End of variables declaration//GEN-END:variables

}
