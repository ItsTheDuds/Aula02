import java.util.Scanner;

public class calculadeira {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadeira ===");
        System.out.println();
        
        int cont = 1;

        System.out.println("Quantas vezes o calculo vai acontecer?");
        int n = sc.nextInt();
        while (cont <= n) {

        System.out.print("Digite o primeiro número inteiro da conta: ");
        int num1 = sc.nextInt();

        System.out.print("Digite um segundo numero inteiro da conta: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println();

        System.out.printf("Soma: %d%n", soma);
        // System.out.println("num1 + num2 = " + (num1 + num2));

        int sub = num1 - num2;
        System.out.printf("Subtração: %d%n", sub);

        int mult = num1 * num2;
        System.out.printf("Multiplicação: %d%n", mult);

        System.out.println();

        cont++;
        }

        sc.close();
    }
}
