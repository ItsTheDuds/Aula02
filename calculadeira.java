import java.util.Scanner;
public class calculadeira {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.println("=== Calculadeira ===");
        System.out.println();

        System.out.print("Digite o primeiro número inteiro da conta: ");
        int num1 = sc.nextInt();

        System.out.print("Digite um segundo numero inteiro da conta: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.printf("Soma: %d%n", soma);
        // System.out.println("num1 + num2 = " + (num1 + num2));

        int sub = num1 - num2;
        System.out.printf("Subtração: %d%n", sub);

        int mult = num1 * num2;
        System.out.printf("Multiplicação: %d%n", mult);






        sc.close();
    }
}
