/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */

package ud1_ejer10.gui.ventanas;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import ud1_ejer10.logica.Logica;

/**
 *Window listener para ejecutar la vuelta al menu principal cuando se cierre la ventana
 * En el evento windowClosed ordena a la logica volver al menu principal.
 * @author Jose Javier Bailon Ortiz
 */
public class WindowListenerEjer10 implements WindowListener{
    
    @Override
    public void windowClosed(WindowEvent e) {
        Logica.volverAlMenuPrincipal();
     }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
      }


    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}//end WindowListenerEjer10
