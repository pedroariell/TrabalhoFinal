package Model;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class arquivo {
    public List<moeda> importar(String nomearquivo) throws IOException, ParseException{
        
        List<moeda> lista=new ArrayList<moeda>();
        
        BufferedReader br = new BufferedReader(new FileReader(nomearquivo));
            String line = "";
        while ((line = br.readLine()) != null) {
            String[] row = line.split(";");
            String data = row[0];
            String tipo = row[3];
            String compra = row[4];
            String venda = row[5];
            compra = compra.replace(",", ".");
            venda = venda.replace(",", ".");
            SimpleDateFormat formatter =  new SimpleDateFormat("ddMMyyyy");
            Date date = formatter.parse(data);
            
            lista.add(new moeda(date,tipo, Double.parseDouble(compra), Double.parseDouble(venda)));
             

          
        }
        
        return lista;

    }
   
}    
