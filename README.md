# TargetSistemas
## Processo Seletivo

###(Fiz o código só por desencargo de consciência) Questão 1:
```java
// Autor: Canditado Tiago Moreira

public class QuestaoUm {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;
        while (k < indice){
            k++;
            soma+=k;
        }
        System.out.println(soma);
    }
}
```
###Questão 2 (Sequência de Fibonacci):
```java
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
```
###Questão 5 (String Reverso):
```java
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
```
