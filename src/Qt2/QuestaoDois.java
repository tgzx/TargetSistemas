package Qt2;

import java.util.Scanner;

// Autor: Canditado Tiago Moreira

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int res = scanner.nextInt();
        fibonacci(res);
    }

    public static void fibonacci(int res){
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        while (res > num3){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        if (res == 0 || res == num3){
            System.out.println("O valor '" + res + "' faz parte da sequencia de Fibonacci!");
        } else {
            System.out.println("O valor digitado NAO faz parte da sequencia de Fibonacci..");
        }
    }
}