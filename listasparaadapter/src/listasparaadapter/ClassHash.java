/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasparaadapter;

import java.util.HashMap;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class ClassHash implements InterfaceHash{
    public static HashMap mapa = new HashMap();

    public static HashMap getMapa() {
        return mapa;
    }
    

    @Override
    public void putValue(int clave, Object dato) {
       mapa.put(clave, dato);
    }

    @Override
    public Object getValue(int clave) {
        
        return mapa.get(clave);
    }
    
    
    
}
