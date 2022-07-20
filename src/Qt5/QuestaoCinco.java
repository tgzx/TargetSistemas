package Qt5;

import java.util.Scanner;

// Autor: Canditado Tiago Moreira

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a palavra: ");
        String res = scanner.next();
        revestres(res);
    }

    public static void revestres(String res){
        char[] caracteres = res.toCharArray();
        char troca;
        int inicioString = 0;
        int finalString = caracteres.length-1;
        while (inicioString < finalString){
            troca = caracteres[inicioString];
            caracteres[inicioString] = caracteres[finalString];
            caracteres[finalString] = troca;
            inicioString++;
            finalString--;
        }
        String res2 = new String(caracteres);
        System.out.println(res2);
    }
}