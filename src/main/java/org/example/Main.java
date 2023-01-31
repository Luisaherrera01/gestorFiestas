package org.example;

public class Main {
    public static void main(String[] args) {
        Invitado objetoClaseInvitado=new Invitado();
        Invitado objeto2= new Invitado(33,true, "Juan", 10000);

        //obtener el valor de los atributos

        System.out.println(objetoClaseInvitado.nombre);
        System.out.println(objeto2.nombre);

    }




}