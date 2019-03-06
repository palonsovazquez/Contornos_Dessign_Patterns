/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasparaadapter;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Listasparaadapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ClassList miLista = new ClassList();
//        
//        miLista.putElement("Uno");
//        miLista.putElement("Dos");
//        miLista.putElement("Tres");
//        MostrarClassList.mostrar(miLista);

ClassHash miHash = new ClassHash();
miHash.putValue(10,"Uno");
miHash.putValue(11,"Dos");
miHash.putValue(12,"Tres");

Hash2List m2l = new Hash2List(miHash);
MostrarClassList.mostrar(m2l);
        
    }
    
}
