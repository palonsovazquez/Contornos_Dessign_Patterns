/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcod;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class PeticionesGraficas extends Peticiones {

    public PeticionesGraficas() {
    }

    @Override
    public Double pedirNumeroDouble(String message) {
        Double res = null;
        res = comprobarNumDouble(JOptionPane.showInputDialog(null, message));
        return res;
    }

    @Override
    public Short pedirNumeroShort(String message) {
        Short res = null;
        res = comprobarNumShort(JOptionPane.showInputDialog(null, message));

        return res;
    }

    @Override
    public Integer pedirNumeroInteger(String message) {
        Integer res = null;
        res = comprobarNumInteger(JOptionPane.showInputDialog(null,   message));
        return res;
    }

    private Double comprobarNumDouble(String number) {
        Double x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Double.parseDouble(number);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    private  Short comprobarNumShort(String numero) {
        Short x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Short.parseShort(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    private  Integer comprobarNumInteger(String numero) {
        Integer x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }
}
