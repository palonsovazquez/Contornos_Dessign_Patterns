/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_empleado;


public class EmpleadosBuilder {

    private String nombre;
    private String apellido1;
    private String apellido2 = "" ;
    private String dni;
    private String cargo = "base";
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;
    private int altura = 0;
    private int pie = 0;
    private int diametro = 0;
    private int sueldo = 0;
    private int formacion = 0;

    public EmpleadosBuilder(String nombre, String apellido1, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    private EmpleadosBuilder() {
    }

    public EmpleadosBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpleadosBuilder setApellido1(String apellido1) {
        this.apellido1 = apellido1;
        return this;
    }

    public EmpleadosBuilder setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public EmpleadosBuilder setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public EmpleadosBuilder setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public EmpleadosBuilder setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public EmpleadosBuilder setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public EmpleadosBuilder setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public EmpleadosBuilder setAltura(int altura) {
        this.altura = altura;
        return this;
    }

    public EmpleadosBuilder setPie(int pie) {
        this.pie = pie;
        return this;
    }

    public EmpleadosBuilder setDiametro(int diametro) {
        this.diametro = diametro;
        return this;
    }

    public EmpleadosBuilder setSueldo(int sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public EmpleadosBuilder setFormacion(int formacion) {
        this.formacion = formacion;
        return this;
    }

    public Empleados createEmpleados() {
        return new Empleados(nombre, apellido1, apellido2, dni, cargo, dia, mes, ano, altura, pie, diametro, sueldo, formacion);
    }
    
}
