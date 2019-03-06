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
public class EjemploSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Sing x = Sing.getInstance();
    Sing y = Sing.getInstance();
    
        System.out.println("x datoA ="+ x.getDatoA());
        System.out.println("x datoB ="+ x.getDatoB()); 
        System.out.println("y datoA ="+ y.getDatoA());
        System.out.println("y datoB ="+ y.getDatoB());
        System.out.println("__________________modifico datos");
        x.setDatoA("xdatoA");
        x.setDatoB(7985155);
        System.out.println("x datoA ="+ x.getDatoA());
        System.out.println("x datoB ="+ x.getDatoB()); 
        System.out.println("y datoA ="+ y.getDatoA());
        System.out.println("y datoB ="+ y.getDatoB());
        
    }
    
}
