/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package ud1_ejer10.gui.tableModels;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import ud1_ejer10.dto.Hijo;

/**
 * Tablemodel para los hijos del registro deportivo
 * @author Jose Javier Bailon Ortiz
 */
public class HijosTableModel extends AbstractTableModel {

    //ATRIBUTOS:
    private List<Hijo> listaHijos;//lista actual de encuestas
    private String[] columnas = new String[]{"Nombre", "Apellidos", "Fecha Nac.", "Deporte", "Nivel"};

    //METODOS:
    //Constructor
    public HijosTableModel(List<Hijo> listaHijos) {
        this.listaHijos = listaHijos;
    }

    @Override
    public int getRowCount() {
        return this.listaHijos.size();
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
                value = listaHijos.get(rowIndex).getNombre();
                break;
            case 1:
                value = listaHijos.get(rowIndex).getApellidos();
                break;
            case 2:
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                value = sdf.format(listaHijos.get(rowIndex).getFechaNacimiento());
                break;
            case 3:
                value = listaHijos.get(rowIndex).getDeporte();
                break;
            case 4:
                value = listaHijos.get(rowIndex).getNivel();
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
