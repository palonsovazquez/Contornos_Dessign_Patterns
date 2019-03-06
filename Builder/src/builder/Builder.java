/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Pizza MiBuilder ;
         new PizzaBuilder(500, 450).setFlo_grQueso(60).setFlo_grSal(10).setFlo_grTomate(100).setStr_tipoAceite("oliva").CreatePizza();
                
                

    }
    
}
