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
public class PizzaBuilder {
    
    private float flo_grHarina;
    private float flo_mlAgua;
    private float flo_grSal = 0;
    private float flo_mlAceite = 0;
    private String str_tipoAceite = "";
    private float flo_grTomate = 0;
    private float flo_grQueso = 0;
    private String str_tipoQueso = "";

    public PizzaBuilder(float flo_grHarina, float flo_mlAgua) {
        this.flo_grHarina = flo_grHarina;
        this.flo_mlAgua = flo_mlAgua;
    }





public Pizza CreatePizza(){

return new Pizza(flo_grHarina,flo_mlAgua,flo_grSal,flo_mlAceite,str_tipoAceite,flo_grTomate,flo_grQueso,str_tipoQueso);


}

    

    

    public PizzaBuilder setFlo_grSal(float flo_grSal) {
        this.flo_grSal = flo_grSal;
    return this;}

    public PizzaBuilder setFlo_mlAceite(float flo_mlAceite) {
        this.flo_mlAceite = flo_mlAceite;
    return this;}

    public PizzaBuilder setStr_tipoAceite(String str_tipoAceite) {
        this.str_tipoAceite = str_tipoAceite;
    return this;}

    public PizzaBuilder setFlo_grTomate(float flo_grTomate) {
        this.flo_grTomate = flo_grTomate;
    return this;}

    public PizzaBuilder setFlo_grQueso(float flo_grQueso) {
        this.flo_grQueso = flo_grQueso;
   return this;}

    public PizzaBuilder setStr_tipoQueso(String str_tipoQueso) {
        this.str_tipoQueso = str_tipoQueso;
   return this; }






}
