/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ud1_ejer10.gui.dialogos;

/**
 * Dialogo Acerda De...
 * @author Jose Javier BO
 */
public class DMinisterioAcercaDe extends javax.swing.JDialog {

    /**
     * Creates new form DAcercaDe
     */
    public DMinisterioAcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        panelTextos = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbDesc1 = new javax.swing.JLabel();
        lbText2 = new javax.swing.JLabel();
        lbText3 = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        lbVendor = new javax.swing.JLabel();
        lbHomepage = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de...");
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ud1_ejer10/gui/img/logo.png"))); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Ejemplo de aplicacion SWING");

        lbDesc1.setText("Aplicacion sencilla utilizando beans de SWING");

        lbText2.setText("con elementos de formularios, ventanas, ");

        lbText3.setText("dialogos y menús.");

        lbVersion.setText("Version:         1.0");

        lbVendor.setText("Vendor:         Jose J. Bailón Ortiz");

        lbHomepage.setText("Homepage:  https://imagenprogramada.com");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTextosLayout = new javax.swing.GroupLayout(panelTextos);
        panelTextos.setLayout(panelTextosLayout);
        panelTextosLayout.setHorizontalGroup(
            panelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextosLayout.createSequentialGroup()
                .addGroup(panelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrar))
                    .addGroup(panelTextosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbVendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHomepage, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(lbDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(separador))))
                .addContainerGap())
        );
        panelTextosLayout.setVerticalGroup(
            panelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDesc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbText3)
                .addGap(10, 10, 10)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVersion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbVendor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHomepage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar))
        );

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelTextos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTextos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Accion del boton cerrar
     * @param evt 
     */
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lbDesc1;
    private javax.swing.JLabel lbHomepage;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbText2;
    private javax.swing.JLabel lbText3;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVendor;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelTextos;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
