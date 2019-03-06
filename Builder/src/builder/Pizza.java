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
public class Pizza {

    public Pizza(float flo_grHarina, float flo_mlAgua, float flo_grSal, float flo_mlAceite, String str_tipoAceite, float flo_grTomate, float flo_grQueso, String str_tipoQueso) {
        this.flo_grHarina = flo_grHarina;
        this.flo_mlAgua = flo_mlAgua;
        this.flo_grSal = flo_grSal;
        this.flo_mlAceite = flo_mlAceite;
        this.str_tipoAceite = str_tipoAceite;
        this.flo_grTomate = flo_grTomate;
        this.flo_grQueso = flo_grQueso;
        this.str_tipoQueso = str_tipoQueso;
        
    }



 

    private float flo_grHarina;
    private float flo_mlAgua;
    private float flo_grSal;
    private float flo_mlAceite;
    private String str_tipoAceite;
    private float flo_grTomate;
    private float flo_grQueso;
    private String str_tipoQueso;
    private float flo_grPinha;
}
