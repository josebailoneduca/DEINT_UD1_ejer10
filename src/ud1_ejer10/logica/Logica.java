/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Lista de paquetes:
 */
package ud1_ejer10.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import ud1_ejer10.dto.DatosLogin;
import ud1_ejer10.dto.Encuesta;
import ud1_ejer10.dto.Hijo;
import ud1_ejer10.gui.ventanas.VPrincipal;
import ud1_ejer10.gui.ventanas.VRegistroAcceso;

/**
 *
 * @author Jose Javier Bailon Ortiz
 */
public class Logica {

    
    //ATRIBUTOS
    
    //Referencia a la ventana principal
    private static VPrincipal ventanaPrincipal;
    
    //Lista de encuestas de la app de ministerio
    private static ArrayList<Encuesta> encuestas = new ArrayList<Encuesta>();
    
    
    
    
    //DATOS DE LOGIN en app de registro deportivo admin,1234
    private static DatosLogin datosLogin=new DatosLogin("admin","1234");
    
    
     // Lista de hijos de la matricula
    private static ArrayList<Hijo> hijos = new ArrayList<Hijo>();
    
    
    
    //METODOS DE MEZCLAR ######################################################
  
    
        /**
     * Mezcla los nombres 4 veces y los manda a la pantalla principal
     *
     * @param nombre1 Primer nombre a usar en la mezcla
     * @param nombre2 Segundo nombre a usar en la mezcla
     */
    public static String mezclar(String nombre1, String nombre2) {
        //validacion
        if (!validarNombresMezcla(nombre1) || !validarNombresMezcla(nombre2)) {
            
            return null;
        }
        //Genera un resultado con 4 nombres mezclados

        String resultado
                = mezclarNombres(nombre1, nombre2) + ", "
                + mezclarNombres(nombre1, nombre2) + ", "
                + mezclarNombres(nombre1, nombre2) + ", "
                + mezclarNombres(nombre1, nombre2);

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
    private static String mezclarNombres(String nombre1, String nombre2) {
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
    private static boolean validarNombresMezcla(String nombre) {
        if (nombre == null || nombre.length() < 4) 
            return false;
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    //METODOS DE APP MINISTERIO ######################################################
  

    /**
     * Devuelve el listado de encuestas
     * @return 
     */
    public static ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }
    
        /**
     * Agrega una encuesta a la lista
     * @param encuesta 
     */
    public static void addEncuesta(Encuesta encuesta){
        encuestas.add(encuesta);
    }
    
    
    
        //METODOS DE REGISTRO DEPORTIVO ######################################################
    
     /**
     * Agrega un hijo a la matricula
     * @param hijo Hijo a agregar
     */
    public static void addHijo(Hijo hijo){
        hijos.add(hijo);
    }
    
    /**
     * Devuelve la lista de hijos de la matricula
     * @return La lista de hijos
     */
    public static List<Hijo> getListaHijos() {
        return hijos;
    }
    
    /**
     * Comprueba que unos datos de login son correctos
     * @param dLogin Los datos del login
     * @return True si son correctos, False si no lo son
     */
    public static boolean intentarLoginRegistroDeportivo(DatosLogin dLogin){
        boolean usuarioOk=Logica.datosLogin.getUsuario().equals(dLogin.getUsuario());
        boolean passwordOk=Logica.datosLogin.getPassword().equals(dLogin.getPassword());
        return  (usuarioOk && passwordOk);            
    }

    
    
    
    
    
    
    
    
    
    //METODOS LOGICA MENU PRINCIPAL#################################################
    
    /**
     * Devuelve si el nombre de usuario es valido comprobando que no sea vacio
     * ni compuesto solo por espacios
     * @param nombre el nombre a comprobar
     * @param apellidos el apellido a comprobar
     * @return True si no es nulo y tiene algun caracter no vacio
     */
    public static boolean nombreUsuarioValidoParaTitulo(String nombre, String apellidos) {
        return (nombre!=null && nombre.strip().length() >0) && 
                (apellidos!=null && apellidos.strip().length() >0);
    }

    /**
     * Acciones a realizar al volver al menu principal
     */
    public static void volverAlMenuPrincipal() {
        ventanaPrincipal.setVisible(true);
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
}
