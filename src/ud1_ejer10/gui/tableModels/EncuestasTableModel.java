/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package ud1_ejer10.gui.tableModels;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import ud1_ejer10.dto.Encuesta;

/**
 *
 * @author Jose Javier Bailon Ortiz
 */
public class EncuestasTableModel extends AbstractTableModel {

    //ATRIBUTOS:
    private List<Encuesta> listaEncuestas;//lista actual de encuestas
    private String[] columnas = new String[]{"Profesion", "Nº Hermanos", "Edad", "Sexo", "Deportes practicados", "Compras", "TV", "Cine"};

    //METODOS:
    //Constructor
    public EncuestasTableModel(List<Encuesta> listaEncuestas) {
        this.listaEncuestas = listaEncuestas;
    }

    @Override
    public int getRowCount() {
        return this.listaEncuestas.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = listaEncuestas.get(rowIndex).getProfesion();
                break;
            case 1:
                value = listaEncuestas.get(rowIndex).getnHermanos();
                break;
            case 2:
                value = listaEncuestas.get(rowIndex).getEdad();
                break;
            case 3:
                value = listaEncuestas.get(rowIndex).getSexo();
                break;
            case 4:
                ArrayList<String> deportes = listaEncuestas.get(rowIndex).getDeportes();
                if (deportes != null && deportes.size() > 0) {
                    value = String.join(",", deportes);
                } else {
                    value = "Ninguno";
                }
                break;
            case 5:
                value = listaEncuestas.get(rowIndex).getCompras();
                break;
            case 6:
                value = listaEncuestas.get(rowIndex).getTv();
                break;
            case 7:
                value = listaEncuestas.get(rowIndex).getCine();
                break;
            default:
                value = null;
                throw new AssertionError();
        }
        return value;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    
}//end EncuestasTableModel
