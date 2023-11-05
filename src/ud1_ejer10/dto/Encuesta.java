/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1_ejer10.dto;

import java.util.ArrayList;

/**
 * DTO para almacenar los datos de una encuesta 
 *
 * @author Jose Javier BO
 */
public class Encuesta {

    //ATRIBUTOS
    private String profesion;
    private int nHermanos;
    private String edad;
    private String sexo;
    private ArrayList<String> deportes;
    private int compras;
    private int tv;
    private int cine;

    /**
     * Constructor
     *
     * @param profesion
     * @param nHermanos
     * @param edad
     * @param sexo
     * @param deportes ArrayList<String> listando los deportes practicados
     * @param compras
     * @param tv
     * @param cine
     */
    public Encuesta(String profesion, int nHermanos, String edad, String sexo, ArrayList<String> deportes, int compras, int tv, int cine) {
        this.profesion = profesion;
        this.nHermanos = nHermanos;
        this.edad = edad;
        this.sexo = sexo;
        this.deportes = deportes;
        this.compras = compras;
        this.tv = tv;
        this.cine = cine;
    }

    // GETTERS Y SETTERS
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getnHermanos() {
        return nHermanos;
    }

    public void setnHermanos(int nHermanos) {
        this.nHermanos = nHermanos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<String> getDeportes() {
        return deportes;
    }

    public void setDeportes(ArrayList<String> deportes) {
        this.deportes = deportes;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public int getTv() {
        return tv;
    }

    public void setTv(int tv) {
        this.tv = tv;
    }

    public int getCine() {
        return cine;
    }

    public void setCine(int cine) {
        this.cine = cine;
    }

    /**
     * Convierte los datos de la encuesta en un String[] con el siguiente orde:
     * 0 profesion 1 nHermanos 2 edad 3 sexo 4 deportes (separado por coma) 5
     * compras 6 tv 7 cine
     *
     * @return El String[] conteniendo los datos
     */
    public String[] toArrayString() {
        String[] salida = new String[8];
        salida[0] = this.profesion;
        salida[1] = "" + this.nHermanos;
        salida[2] = this.edad;
        salida[3] = this.sexo;
        if (deportes != null && deportes.size() > 0) {
            salida[4] = String.join(",", deportes);
        } else {
            salida[4] = "Ninguno";
        }
        salida[5] = "" + this.compras;
        salida[6] = "" + this.tv;
        salida[7] = "" + this.cine;

        return salida;
    }

}
