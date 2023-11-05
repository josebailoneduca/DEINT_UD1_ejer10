/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
Lista de paquetes:
 */
package ud1_ejer10.gui.ventanas;

import ud1_ejer10.logica.Logica;

/**
 * Ventana del imitador. Contiene radiobuttons, checkbox y otros inputs en la parte superior
 * cuyo estado es replicado por otros inputs equivalentes e inhabilitados en la parte inferior
 * @author Jose Javier BO
 */
public class VImitador extends javax.swing.JFrame {

    /**
     * Constructor
     * @param nombreUsuarioTitulo  Titulo a poner en la ventana
     */
    public VImitador(String nombreUsuarioTitulo) {
        initComponents();
        initPropio(nombreUsuarioTitulo);
   }
    /**
     * Gestion de la inicializacion. Pone el titulo a la ventana e inicializa
     * el windowsListener que gestiona la aparicion del menu principal cuando esta ventana se cierra
     * @param nombreUsuarioTitulo Nombre de usuario para poner como titulo de la ventana
     */
    private void initPropio(String nombreUsuarioTitulo) {
        this.setTitle("Imitador - Usuario: " + nombreUsuarioTitulo);
        this.addWindowListener(new WindowListenerEjer10());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        origButtonGroup = new javax.swing.ButtonGroup();
        copyButtonGroup = new javax.swing.ButtonGroup();
        panelVolverAlMenu = new javax.swing.JPanel();
        btnVolverAlMenu = new javax.swing.JButton();
        sepVolverVenu = new javax.swing.JSeparator();
        panelAplicacion = new javax.swing.JPanel();
        panelOriginal = new javax.swing.JPanel();
        lbOriginal = new javax.swing.JLabel();
        origRb1 = new javax.swing.JRadioButton();
        origCb1 = new javax.swing.JCheckBox();
        origTexto = new javax.swing.JTextField();
        origComboBox = new javax.swing.JComboBox<>();
        origCb2 = new javax.swing.JCheckBox();
        origRb2 = new javax.swing.JRadioButton();
        origRb3 = new javax.swing.JRadioButton();
        origCb3 = new javax.swing.JCheckBox();
        origSpinner = new javax.swing.JSpinner();
        sepPanelesOrigEspej = new javax.swing.JSeparator();
        panelEspejo = new javax.swing.JPanel();
        lbEspejo = new javax.swing.JLabel();
        copyRb1 = new javax.swing.JRadioButton();
        copyRb2 = new javax.swing.JRadioButton();
        copyRb3 = new javax.swing.JRadioButton();
        copyCb1 = new javax.swing.JCheckBox();
        copyCb2 = new javax.swing.JCheckBox();
        copyCb3 = new javax.swing.JCheckBox();
        copyTexto = new javax.swing.JTextField();
        copyComboBox = new javax.swing.JComboBox<>();
        copySpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

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
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(btnVolverAlMenu)
                .addGap(18, 18, 18))
            .addGroup(panelVolverAlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVolverAlMenuLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(sepVolverVenu)
                    .addContainerGap()))
        );
        panelVolverAlMenuLayout.setVerticalGroup(
            panelVolverAlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVolverAlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverAlMenu)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(panelVolverAlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVolverAlMenuLayout.createSequentialGroup()
                    .addGap(0, 38, Short.MAX_VALUE)
                    .addComponent(sepVolverVenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbOriginal.setText("Original");

        origButtonGroup.add(origRb1);
        origRb1.setText("Opcion 1");
        origRb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origRb1ActionPerformed(evt);
            }
        });

        origCb1.setText("Opcion 4");
        origCb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origCb1ActionPerformed(evt);
            }
        });

        origTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                origTextoKeyReleased(evt);
            }
        });

        origComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        origComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origComboBoxActionPerformed(evt);
            }
        });

        origCb2.setText("Opcion 5");
        origCb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origCb2ActionPerformed(evt);
            }
        });

        origButtonGroup.add(origRb2);
        origRb2.setText("Opcion 2");
        origRb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origRb2ActionPerformed(evt);
            }
        });

        origButtonGroup.add(origRb3);
        origRb3.setText("Opcion 3");
        origRb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origRb3ActionPerformed(evt);
            }
        });

        origCb3.setText("Opcion 6");
        origCb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origCb3ActionPerformed(evt);
            }
        });

        origSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                origSpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelOriginalLayout = new javax.swing.GroupLayout(panelOriginal);
        panelOriginal.setLayout(panelOriginalLayout);
        panelOriginalLayout.setHorizontalGroup(
            panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOriginalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOriginalLayout.createSequentialGroup()
                        .addComponent(origRb1)
                        .addGap(37, 37, 37)
                        .addComponent(origCb1))
                    .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelOriginalLayout.createSequentialGroup()
                            .addComponent(origRb3)
                            .addGap(37, 37, 37)
                            .addComponent(origCb3))
                        .addGroup(panelOriginalLayout.createSequentialGroup()
                            .addComponent(origRb2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(origCb2))))
                .addGap(43, 43, 43)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(origComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(origSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(origTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(lbOriginal)
        );
        panelOriginalLayout.setVerticalGroup(
            panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOriginalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbOriginal)
                .addGap(17, 17, 17)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origCb1)
                    .addComponent(origTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origRb1))
                .addGap(18, 18, 18)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOriginalLayout.createSequentialGroup()
                        .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(origCb2)
                            .addComponent(origComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(origSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOriginalLayout.createSequentialGroup()
                        .addComponent(origRb2)
                        .addGap(19, 19, 19)
                        .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(origRb3)
                            .addComponent(origCb3))))
                .addContainerGap())
        );

        lbEspejo.setText("Espejo");

        copyButtonGroup.add(copyRb1);
        copyRb1.setText("Opcion 1");
        copyRb1.setEnabled(false);

        copyButtonGroup.add(copyRb2);
        copyRb2.setText("Opcion 2");
        copyRb2.setEnabled(false);

        copyButtonGroup.add(copyRb3);
        copyRb3.setText("Opcion 3");
        copyRb3.setEnabled(false);

        copyCb1.setText("Opcion 4");
        copyCb1.setEnabled(false);

        copyCb2.setText("Opcion 5");
        copyCb2.setEnabled(false);

        copyCb3.setText("Opcion 6");
        copyCb3.setEnabled(false);

        copyTexto.setEnabled(false);

        copyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        copyComboBox.setEnabled(false);

        copySpinner.setEnabled(false);

        javax.swing.GroupLayout panelEspejoLayout = new javax.swing.GroupLayout(panelEspejo);
        panelEspejo.setLayout(panelEspejoLayout);
        panelEspejoLayout.setHorizontalGroup(
            panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspejoLayout.createSequentialGroup()
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEspejoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(copyRb1)
                            .addComponent(copyRb3)
                            .addComponent(copyRb2)))
                    .addComponent(lbEspejo))
                .addGap(34, 34, 34)
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copyCb2)
                    .addComponent(copyCb1)
                    .addComponent(copyCb3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copyTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copySpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelEspejoLayout.setVerticalGroup(
            panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspejoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEspejo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEspejoLayout.createSequentialGroup()
                        .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(copyRb1)
                            .addComponent(copyCb1)
                            .addComponent(copyTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(copyCb2)
                            .addComponent(copyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEspejoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(copyRb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(copyRb3)
                            .addComponent(copyCb3)
                            .addComponent(copySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAplicacionLayout = new javax.swing.GroupLayout(panelAplicacion);
        panelAplicacion.setLayout(panelAplicacionLayout);
        panelAplicacionLayout.setHorizontalGroup(
            panelAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAplicacionLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(panelAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sepPanelesOrigEspej, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAplicacionLayout.setVerticalGroup(
            panelAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAplicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sepPanelesOrigEspej, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelVolverAlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelVolverAlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void origRb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origRb2ActionPerformed
        copyRb2.setSelected(true);
    }//GEN-LAST:event_origRb2ActionPerformed

    private void origRb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origRb3ActionPerformed
        copyRb3.setSelected(true);
    }//GEN-LAST:event_origRb3ActionPerformed

    private void origCb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origCb1ActionPerformed
        copyCb1.setSelected(origCb1.isSelected());
    }//GEN-LAST:event_origCb1ActionPerformed

    private void origCb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origCb2ActionPerformed
        copyCb2.setSelected(origCb2.isSelected());
    }//GEN-LAST:event_origCb2ActionPerformed

    private void origCb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origCb3ActionPerformed
        copyCb3.setSelected(origCb3.isSelected());
    }//GEN-LAST:event_origCb3ActionPerformed

    private void origTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_origTextoKeyReleased
        copyTexto.setText(origTexto.getText());
    }//GEN-LAST:event_origTextoKeyReleased

    private void origComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origComboBoxActionPerformed
        copyComboBox.setSelectedIndex(origComboBox.getSelectedIndex());
    }//GEN-LAST:event_origComboBoxActionPerformed

    private void origSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_origSpinnerStateChanged
        copySpinner.setValue(origSpinner.getValue());
    }//GEN-LAST:event_origSpinnerStateChanged

    private void origRb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origRb1ActionPerformed
        copyRb1.setSelected(true);
    }//GEN-LAST:event_origRb1ActionPerformed

    private void btnVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAlMenuActionPerformed
        Logica.volverAlMenuPrincipal();
        this.dispose();
    }//GEN-LAST:event_btnVolverAlMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverAlMenu;
    private javax.swing.ButtonGroup copyButtonGroup;
    private javax.swing.JCheckBox copyCb1;
    private javax.swing.JCheckBox copyCb2;
    private javax.swing.JCheckBox copyCb3;
    private javax.swing.JComboBox<String> copyComboBox;
    private javax.swing.JRadioButton copyRb1;
    private javax.swing.JRadioButton copyRb2;
    private javax.swing.JRadioButton copyRb3;
    private javax.swing.JSpinner copySpinner;
    private javax.swing.JTextField copyTexto;
    private javax.swing.JLabel lbEspejo;
    private javax.swing.JLabel lbOriginal;
    private javax.swing.ButtonGroup origButtonGroup;
    private javax.swing.JCheckBox origCb1;
    private javax.swing.JCheckBox origCb2;
    private javax.swing.JCheckBox origCb3;
    private javax.swing.JComboBox<String> origComboBox;
    private javax.swing.JRadioButton origRb1;
    private javax.swing.JRadioButton origRb2;
    private javax.swing.JRadioButton origRb3;
    private javax.swing.JSpinner origSpinner;
    private javax.swing.JTextField origTexto;
    private javax.swing.JPanel panelAplicacion;
    private javax.swing.JPanel panelEspejo;
    private javax.swing.JPanel panelOriginal;
    private javax.swing.JPanel panelVolverAlMenu;
    private javax.swing.JSeparator sepPanelesOrigEspej;
    private javax.swing.JSeparator sepVolverVenu;
    // End of variables declaration//GEN-END:variables
 
}
