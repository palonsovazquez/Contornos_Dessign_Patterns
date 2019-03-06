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
public class Empleados {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String cargo;
    private int dia;
    private int mes;
    private int ano;
    private int altura;
    private int pie;
    private int diametro;
    private int sueldo;
    private int formacion;

    public Empleados(String nombre, String apellido1, String apellido2, String dni, String cargo, int dia, int mes, int ano, int altura, int pie, int diametro, int sueldo, int formacion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.cargo = cargo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.pie = pie;
        this.diametro = diametro;
        this.sueldo = sueldo;
        this.formacion = formacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPie() {
        return pie;
    }

    public void setPie(int pie) {
        this.pie = pie;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getFormacion() {
        return formacion;
    }

    public void setFormacion(int formacion) {
        this.formacion = formacion;
    }
    
    
    
    
}
