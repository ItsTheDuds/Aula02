import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao1 = 1;
        float n1 = 0;
        float n2 = 0;
        while (opcao1 != 0) {
            // try {
            System.out.println("===== MENU =====");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Multiplicar dois números");
            System.out.println("4 - Dividir dois números");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao1 = sc.nextInt();

            while (true) {
                try {
                    System.out.print("Insira o primeiro número: ");
                    n1 = sc.nextFloat();
                    break;

                } catch (Exception e) {
                    System.out.println("Valor inválido! Digite um novo número.");
                    sc.next();
                }
            }
            while (true) {
                try {
                    System.out.print("Insira o segundo número: ");
                    n2 = sc.nextFloat();
                    break;
                } catch (Exception e) {
                    System.out.println("Valor inválido! Digite um novo número.");
                    sc.next();
                }
            }

            switch (opcao1) {
                case 1:
                    float soma = n1 + n2;
                    System.out.printf("A soma de %.2f e %.2f é %.2f", n1, n2, soma);
                    System.out.println();
                    break;
                case 2:
                    float sub = n1 - n2;
                    System.out.printf("A subtração de %.2f e %.2f é %.2f", n1, n2, sub);
                    System.out.println();
                    break;
                case 3:
                    float mult = n1 * n2;
                    System.out.printf("A multiplicação de %.2f e %.2f é %.2f", n1, n2,
                            mult);
                            System.out.println();
                    break;
                case 4:
                    float div = n1 / n2;
                    System.out.printf("A soma de %.2f e %.2f é %.2f", n1, n2, div);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    opcao1 = 0;
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        }
        sc.close();
    }
}