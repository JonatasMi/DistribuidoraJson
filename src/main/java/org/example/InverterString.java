package org.example;

public class InverterString {

    public static void main(String[]args) {
        String frase= "Jonatas Ferreira dos Santos";
        String fraseInvertida = "";

        String palavras[] = frase.split(" ");

        for(int i = palavras.length - 1; i >= 0; i--){
            fraseInvertida = fraseInvertida.concat(palavras[i]+" ");
        }

        fraseInvertida = fraseInvertida.substring(0, fraseInvertida.length()-1);

        System.out.println(frase);
        System.out.printf("invertida: ");
        System.out.println(fraseInvertida);
    }
}
