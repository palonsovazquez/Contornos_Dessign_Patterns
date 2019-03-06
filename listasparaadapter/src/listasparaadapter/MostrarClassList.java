/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasparaadapter;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class MostrarClassList {
    public static void mostrar(ClassList lista){
    String texto =" index\tvalue\n";
    for(int i = 0; i< lista.getNumElem();i++){
    texto = texto.concat("    "+ i +"\t"+lista.getElement(i)+"\n");
        
    }
    
        JOptionPane.showMessageDialog(null,new JTextArea( texto));
    
    }
    
    
}
