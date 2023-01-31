package org.example;

public class Invitado {

    // ATRIBUTOS
    int edad;
    boolean sexo;
    String nombre;
    //Integer numeroEntradas;
    double valorEntrada;
    //float valorCover; //32 bits hay que poner f al inicio de cada dato


    // METODOS

    // Metodos especiales

    public Invitado() {
    }

    public Invitado(int edad, boolean sexo, String nombre, double valorEntrada) {
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
        this.valorEntrada = valorEntrada;
    }
    // Metodos ordinarios
}
