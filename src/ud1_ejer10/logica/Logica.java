/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Lista de paquetes:
 */
package ud1_ejer10.logica;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import ud1_ejer10.gui.ventanas.VImitador;
import ud1_ejer10.gui.ventanas.VMezclar;
import ud1_ejer10.gui.ventanas.VPrincipal;

/**
 *
 * @author Jose Javier Bailon Ortiz
 */
public class Logica {

    private static VPrincipal ventanaPrincipal;
    
    
    
    //METODOS DE MEZCLAR ######################################################
    /**
     * Iniciar la ventana de mezclar
     * @param usuarioPrincipal Usuario a poner en el titulo de la ventana
     * @return  true si el es nombre de usuario valido false si no lo es
     */
    public static boolean mezclarInicio(String usuarioPrincipal) {
        //comprobar validez de usuario
        if (!nombreUsuarioValido(usuarioPrincipal)){
            return false;
        }
        
        //crear ventana de app de mezcla        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               VMezclar ventanaMezclar = new VMezclar(usuarioPrincipal);
                ventanaMezclar.setLocationRelativeTo(null);
                ventanaMezclar.setVisible(true);
            }
       });
        //ocultar ventana principal
       ventanaPrincipal.setVisible(false);
       return true;
    }
 
    
        /**
     * Mezcla los nombres 4 veces y los manda a la pantalla principal
     *
     * @param nombre1 Primer nombre a usar en la mezcla
     * @param nombre2 Segundo nombre a usar en la mezcla
     */
    public static String mezclarMezcla(String nombre1, String nombre2) {
        //validacion
        if (!mezclarValidar(nombre1) || !mezclarValidar(nombre2)) {
            
            return null;
        }
        //Genera un resultado con 4 nombres mezclados

        String resultado
                = mezclarMezclaNombres(nombre1, nombre2) + ", "
                + mezclarMezclaNombres(nombre1, nombre2) + ", "
                + mezclarMezclaNombres(nombre1, nombre2) + ", "
                + mezclarMezclaNombres(nombre1, nombre2);

        return resultado;
    }

    /**
     * Mezcla dos nombres diviediendolos en tramos que acaben en vocal
     * y mezclandolos
     *
     * @param nombre1 Primer nombre
     * @param nombre2 Segundo nombre
     * @return Mezcla de los nombres
     */
    private static String mezclarMezclaNombres(String nombre1, String nombre2) {
        //preparacion de datos para la mezcla
        nombre1 = nombre1.toLowerCase();
        nombre2 = nombre2.toLowerCase();
        String resultado = "";
        Random r = new Random();
        int indice1 = 0;
        int indice2 = 0;
        String[] v = {"a", "e", "i", "o", "u"};
        List<String> vocales = Arrays.asList(v);

        //Mezclar los tramos de los nombres
        while (indice1 != nombre1.length() || indice2 != nombre2.length()) {
            float azar = r.nextFloat();
            boolean segmentoEncontrado = false;
            //coger tramo de primer nombre
            if (azar < 0.5) {
                //deteccion del tramo que acaba en vocal o en el final de palabra
                while (!segmentoEncontrado && indice1 != nombre1.length()) {
                    String caracter = nombre1.substring(indice1, indice1 + 1);
                    resultado += caracter;
                    indice1++;
                    if (vocales.contains(caracter)) {
                        segmentoEncontrado = true;
                    }
                }
            //coger tramo de segundo nombre
            } else {
                //deteccion del tramo que acaba en vocal o en el final de palabra
                while (!segmentoEncontrado && indice2 != nombre2.length()) {
                    String caracter = nombre2.substring(indice2, indice2 + 1);
                    resultado += caracter;
                    indice2++;
                    if (vocales.contains(caracter)) {
                        segmentoEncontrado = true;
                    }
                }
            }
        }
        //poner en mayuscula la primera letra
        String primeraLetra = resultado.substring(0,1);
        resultado=primeraLetra.toUpperCase()+resultado.substring(1,resultado.length());
        //devolucion del resultado
        return resultado;
    }

    /**
     * Valida un nombre para ser usado
     *
     * @param nombre El nombre a validar
     * @return True si no es nulo y tiene 4 o mas caracteres. False en otro caso
     */
    private static boolean mezclarValidar(String nombre) {
        if (nombre == null || nombre.length() < 4) 
            return false;
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void iniciaAppMinisterio(String usuarioPrincipal) {
        System.out.println("app ministerio");
    }

    public static void iniciaRegistroDeportivo(String usuarioPrincipal) {
        System.out.println("registro deportivo");
    }

    
    
    
    
    
     //METODOS DE IMITADOR ######################################################
    
    public static boolean imitadorInicio(String usuarioPrincipal) {
               //comprobar validez de usuario
        if (!nombreUsuarioValido(usuarioPrincipal)){
            return false;
        }
        
        //crear ventana de app de mezcla        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VImitador ventanaImitador = new VImitador(usuarioPrincipal);
                ventanaImitador.setLocationRelativeTo(null);
                ventanaImitador.setVisible(true);
            }
       });
        //ocultar ventana principal
       ventanaPrincipal.setVisible(false);
       return true;
    }

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaPrincipal = new VPrincipal();
                ventanaPrincipal.setLocationRelativeTo(null);
                ventanaPrincipal.setVisible(true);
            }
        });
    }

 

    /**
     * Devuelve si el nombre de usuario es valido
     * @param nombreUsuario el nombre a comprobar
     * @return True si no es nulo y tiene algun caracter no vacio
     */
    private static boolean nombreUsuarioValido(String usuarioPrincipal) {
        return (usuarioPrincipal!=null && usuarioPrincipal.strip().length() >0);
    }

    public static void volverAlMenuPrincipal() {
        ventanaPrincipal.setVisible(true);
    }



}
