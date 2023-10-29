/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
Lista de paquetes:
 */

package ud1_ejer10.gui;

import ud1_ejer10.Main_Ejer10;

/**
 *
 * @author Jose Javier Bailon Ortiz
 */
public class Ejercicio10VentanaPrincipal extends javax.swing.JFrame {

    /** Creates new form Ejercicio10VentanaPrincipal */
    public Ejercicio10VentanaPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInputUsuario = new javax.swing.JPanel();
        lbiNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        lbiApellidos = new javax.swing.JLabel();
        inputApellidos = new javax.swing.JTextField();
        btnDefinirUsuario = new javax.swing.JButton();
        panelUsuarioActual = new javax.swing.JPanel();
        lbiUsuario = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        MenuSuepriorjMenuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbiNombre.setText("Nombre:");
        panelInputUsuario.add(lbiNombre);

        inputNombre.setPreferredSize(new java.awt.Dimension(100, 22));
        panelInputUsuario.add(inputNombre);

        lbiApellidos.setText("Apellidos:");
        panelInputUsuario.add(lbiApellidos);

        inputApellidos.setPreferredSize(new java.awt.Dimension(100, 22));
        panelInputUsuario.add(inputApellidos);

        btnDefinirUsuario.setText("Definir Usuario");
        btnDefinirUsuario.setActionCommand("Definir Usuario");
        panelInputUsuario.add(btnDefinirUsuario);

        lbiUsuario.setText("Usuario actual:");
        panelUsuarioActual.add(lbiUsuario);
        panelUsuarioActual.add(lbUsuario);

        menuArchivo.setText("Archivo");

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemSalir);

        MenuSuepriorjMenuBar.add(menuArchivo);

        jMenu2.setText("Edit");
        MenuSuepriorjMenuBar.add(jMenu2);

        setJMenuBar(MenuSuepriorjMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelUsuarioActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInputUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInputUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelUsuarioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        Main_Ejer10.salir();
    }//GEN-LAST:event_menuItemSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuSuepriorjMenuBar;
    private javax.swing.JButton btnDefinirUsuario;
    private javax.swing.JTextField inputApellidos;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lbiApellidos;
    private javax.swing.JLabel lbiNombre;
    private javax.swing.JLabel lbiUsuario;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JPanel panelInputUsuario;
    private javax.swing.JPanel panelUsuarioActual;
    // End of variables declaration//GEN-END:variables

}//fin Ejercicio10VentanaPrincipal