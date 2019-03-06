/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasparaadapter;

import java.util.ArrayList;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class ClassList implements InterfaceList{
private static ArrayList lista = new ArrayList();
    
    @Override
    public void putElement(Object objeto) {
        lista.add(objeto);
    }

    @Override
    public Object getElement(int posicion) {
       return lista.get(posicion);
    }
    
    public int getNumElem(){
        return lista.size();
    }
}
