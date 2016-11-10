/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.TAbleModel;

import Model.moeda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aluno
 */
public class tablemodel extends AbstractTableModel {
     private List<moeda> Moeda;
    
    public List<moeda> getLista(){
        return Moeda;
    }
    
    public tablemodel(){
        Moeda = new ArrayList<moeda>();
    }
    
    public tablemodel(List<moeda> lista){
        this();
        Moeda.addAll(lista);
    }
    
    @Override
    public int getRowCount(){
        return Moeda.size();
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0 : return "Data ";
            case 1 : return "Moeda";
            case 2 : return "Compra";
            case 3 : return "Venda";
            
            default : return "NoName";
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        moeda md = Moeda.get(rowIndex);
        
        switch (columnIndex){
            case 0 : return md.getData();
            case 1 : return md.getTipo();
            case 2 : return md.getCompra();
            case 3 : return md.getVenda();
            
            default : return "";
        }
    }
    
    
    
}
