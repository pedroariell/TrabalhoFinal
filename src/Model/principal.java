package Model;



import java.io.IOException;
import java.text.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class principal {
     public static void main(String[] args) throws IOException, ParseException {
        arquivo a = new arquivo();
        a.importar("CotacoesMoedas.csv");
    }
}
