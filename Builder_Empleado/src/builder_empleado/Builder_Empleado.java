/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_empleado;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Builder_Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados emple = new EmpleadosBuilder("Pepito", "Grillo", "89445562625l").
                setAltura(190)
                .setCargo("jefe")
                .setFormacion(5)
                .setSueldo(20000)
                .createEmpleados();
       // otra forma de usarlo 
       
       EmpleadosBuilder eb = new EmpleadosBuilder("Jaimito","Perez", "468678655f");
       eb.setAltura(150);
       eb.setFormacion(3);
       eb.setSueldo(1000000);
       emple = eb.createEmpleados();
        
    }
    
}
