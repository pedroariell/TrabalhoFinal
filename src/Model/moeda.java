package Model;



import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class moeda {
    private Date data;
    private String tipo;
    private double compra, venda;

    public moeda(Date data, String tipo, double compra, double venda) {
        this.data = data;
        this.tipo = tipo;
        this.compra = compra;
        this.venda = venda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
    public String getDataString(){
        if(data != null){
            SimpleDateFormat  formatoData = new SimpleDateFormat("dd/MM/yyyy");
            return formatoData.format(data);
        }else{
            return null;
        }
    }
    
}
