/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasparaadapter;

import java.util.Iterator;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Hash2List extends ClassList{

    public Hash2List(ClassHash hashAConvertir) {
        Iterator iterator = hashAConvertir.getMapa().keySet().iterator();
        do{
        this.putElement(hashAConvertir.getValue((int)iterator.next()));
        
        }while(iterator.hasNext());
        
        
    }
    
    
}
