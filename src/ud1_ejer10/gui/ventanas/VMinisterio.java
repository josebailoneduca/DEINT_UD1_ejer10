/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ud1_ejer10.gui.ventanas;

import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import ud1_ejer10.dto.Encuesta;
import ud1_ejer10.gui.dialogos.DMinisterioAcercaDe;
import ud1_ejer10.gui.dialogos.DMinisterioEncuesta;
import ud1_ejer10.gui.tableModels.EncuestasTableModel;
import ud1_ejer10.logica.Logica;

 

/**
 * Jframe VPrincipal con la ventana principal de la aplicacion, el menu y la tabla de encuestas introducidas
 * @author Bailon
 */
public class VMinisterio extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    public VMinisterio(String nombreUsuario) {
        initComponents();
        initPropio(nombreUsuario);
       
    }
        private void initPropio(String nombreUsuario) {
        this.setTitle("App Ministerio - Usuario: " + nombreUsuario);
        this.addWindowListener(new WindowListenerEjer10());
         actualizarTabla();
    }
    
    
    /**
     * Actualiza la tabla conformando su modelo e introduciendo los datos
     * necesarios
     */
    private void actualizarTabla(){
        
        //establecer el modelo como modelo de la tabla
        this.tabla.setModel(new EncuestasTableModel(Logica.getEncuestas()));
        //definir la tabla como no editable
        this.tabla.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabla = new javax.swing.JPanel();
        scrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();
        menuEncuesta = new javax.swing.JMenu();
        menuItemRealizarEncuesta = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encuestas");
        setIconImage(new ImageIcon("./src/ud1_ejer5/gui/img/logo.png").getImage());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollTabla.setViewportView(tabla);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        menuArchivo.setMnemonic('a');
        menuArchivo.setText("Archivo");

        menuItemSalir.setMnemonic('v');
        menuItemSalir.setText("Volver al menu principal");
        menuItemSalir.setToolTipText("Cierra la ventana y vuelve al menu principal");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemSalir);

        barraMenu.add(menuArchivo);

        menuEncuesta.setMnemonic('e');
        menuEncuesta.setText("Encuesta");

        menuItemRealizarEncuesta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemRealizarEncuesta.setMnemonic('e');
        menuItemRealizarEncuesta.setText("Realizar Encuesta");
        menuItemRealizarEncuesta.setToolTipText("Abre el formulario para hacer la encuesta");
        menuItemRealizarEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRealizarEncuestaActionPerformed(evt);
            }
        });
        menuEncuesta.add(menuItemRealizarEncuesta);

        barraMenu.add(menuEncuesta);

        menuAyuda.setMnemonic('y');
        menuAyuda.setText("Ayuda");

        menuItemAcercaDe.setMnemonic('a');
        menuItemAcercaDe.setText("Acerca de...");
        menuItemAcercaDe.setToolTipText("Informacion sobre el programa");
        menuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuItemAcercaDe);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Accion del menu salir
     * @param evt 
     */
    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
         Logica.volverAlMenuPrincipal();
        this.dispose();
    }//GEN-LAST:event_menuItemSalirActionPerformed

    /**
     * Accion del menu Acerca de
     * @param evt 
     */
    private void menuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercaDeActionPerformed
           DMinisterioAcercaDe dialogo = new DMinisterioAcercaDe(this, true);
           dialogo.setLocationRelativeTo(this);
           dialogo.setVisible(true);
    }//GEN-LAST:event_menuItemAcercaDeActionPerformed

    /**
     * Accion del menu Realizar Encuesta
     * @param evt 
     */
    private void menuItemRealizarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRealizarEncuestaActionPerformed
        //abrir el dialogo de rellenar una encuesta
        DMinisterioEncuesta dEncuesta = new DMinisterioEncuesta(this, true);
        dEncuesta.setLocationRelativeTo(this);
        dEncuesta.setVisible(true);
        //actualizar los datos de la tabla tras el cierre del dialogo de encuesta
        this.actualizarTabla();
    }//GEN-LAST:event_menuItemRealizarEncuestaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEncuesta;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemRealizarEncuesta;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
