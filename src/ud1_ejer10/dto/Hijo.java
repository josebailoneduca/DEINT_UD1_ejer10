/*
 * LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1_ejer10.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DTO para almacenar los datos de un hijo
 * @author Jose Javier BO
 */
public class Hijo {

    String nombre;
    String apellidos;
    String deporte;
    String nivel;
    Date fechaNacimiento;

    /**
     * Constructor
     * @param nombre
     * @param apellidos
     * @param deporte
     * @param nivel
     * @param fechaNacimiento 
     */
    public Hijo(String nombre, String apellidos, String deporte, String nivel, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.deporte = deporte;
        this.nivel = nivel;
        this.fechaNacimiento = fechaNacimiento;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    /**
     * Convierte los datos del DTO a un array de strings
     * @return  El array de Strings
     */
    public String[] toArrayString() {
              //{"Nombre","Apellidos", "Fecha Nac.", "Deporte", "Nivel"};
               String[] salida=new String[5];
               salida[0]=this.nombre;
               salida[1]=this.apellidos;
               SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
               salida[2]=sdf.format(fechaNacimiento);
               salida[3]=this.deporte;
               salida[4]=this.nivel;
               return salida;
               
    }
    
    
    
}// fin clase Hijo
