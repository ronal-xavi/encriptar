package com.ronal.encriptar.basico;

public class BasicEncryption {


    public static void main(String[] args) {

        String mensaje = "hola mundo";

        char[] array = mensaje.toCharArray(); // toCharArray = permite convertir el string en un array de caracteres

        /* == ENCRIPTANDO  == */
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] + (char)5);
        }
        String encriptado = String.valueOf(array);
        System.out.println(encriptado);

        /* == DES-ENCRIPTANDO  == */
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] - (char)5);
        }
        String desEncriptado = String.valueOf(array);
        System.out.println(desEncriptado);



    }

}
