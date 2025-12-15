package Clase;

import lombok.Data;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private Double peso;
    private int altura;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, int edad, Double peso, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = 67;
        this.peso = 67.00;
        this.altura = 189;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

@Override
    public String toString() {
        return this.dni+this.nombre+this.apellido;
    }

 public void mostradatos(){
        System.out.println(apellido);
 }
}

