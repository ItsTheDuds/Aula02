import java.util.Scanner;

public class calc_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            System.out.println("===== MENU =====");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Multiplicar dois números");
            System.out.println("4 - Dividir dois números");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Insira o primeiro número: ");
                    float n = sc.nextFloat();
                    System.out.print("Insira o segundo número: ");
                    float y = sc.nextFloat();
                    float soma = n + y;
                    System.out.printf("Resultado da sua soma é: %.2f\n", soma);
                    // Somar
                    break;

                case 2:
                    System.out.print("Insira o primeiro número: ");
                    float b = sc.nextFloat();
                    System.out.print("Insira o segundo número: ");
                    float a = sc.nextFloat();
                    float sub = b - a;
                    System.out.printf("Resultado da sua soma é: %.2f\n", sub);
                    // Subtrair
                    break;

                case 3:
                    System.out.print("Insira o primeiro número: ");
                    float q = sc.nextFloat();
                    System.out.print("Insira o segundo número: ");
                    float w = sc.nextFloat();
                    float mult = q * w;
                    System.out.printf("Resultado da sua soma é: %.2f\n", mult);
                    // Multiplicar
                    break;

                case 4:
                    System.out.print("Insira o primeiro número: ");
                    float j = sc.nextFloat();
                    System.out.print("Insira o segundo número: ");
                    float caio = sc.nextFloat();
                    float div = j / caio;
                    System.out.printf("Resultado da sua soma é: %.2f\n", div);
                    // Dividir
                    break;

                case 0:
                    System.out.println("Programa encerrado");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}