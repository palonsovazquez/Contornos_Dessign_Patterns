/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosingleton;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Sing {
    private static Sing sing;// = new Sing();
    
    private  String datoA = "datoA";
    private  int datoB = 3232;

    private Sing() {
    }

    
    
    public String getDatoA() {
        return datoA;
    }

    public void setDatoA(String datoA) {
        this.datoA = datoA;
    }

    public int getDatoB() {
        return datoB;
    }

    public void setDatoB(int datoB) {
        this.datoB = datoB;
    }
    
    
    public static  Sing getInstance(){
        if(sing==null){
        sing = new Sing();
        
        }
    
    
    return sing;}
    
}
