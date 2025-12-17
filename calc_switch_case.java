import java.util.Scanner;
import java.util.InputMismatchException;

public class calc_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // boolean continuar = true;
        int opcao = 1;

        while (opcao != 0) {
            try {
                System.out.println("===== MENU =====");
                System.out.println("1 - Somar dois números");
                System.out.println("2 - Subtrair dois números");
                System.out.println("3 - Multiplicar dois números");
                System.out.println("4 - Dividir dois números");
                System.out.println("0 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();

                float y = 0;
                float n = 0;
                switch (opcao) {
                    case 1:
                        while (true) {
                            try {
                                System.out.print("Insira o primeiro número: ");
                                n = sc.nextFloat();
                                break;
                            } catch (Exception e) {
                                sc.next();
                            }
                        }
                        while (true) {
                            try {
                                System.out.print("Insira o segundo número: ");
                                y = sc.nextFloat();
                                break;
                            } catch (Exception e) {
                                sc.next();
                            }
                        }

                        float soma = n + y;
                        System.out.printf("Resultado da sua soma é: %.2f\n", soma);
                        // Somar
                        break;

                    case 2:
                        while (true) {
                            try {
                                System.out.print("Insira o primeiro número: ");
                                n = sc.nextFloat();
                                break;
                            } catch (Exception e) {
                                sc.next();
                            }
                        }
                        while (true) {
                            try {
                                System.out.print("Insira o segundo número: ");
                                y = sc.nextFloat();
                                break;
                            } catch (Exception e) {
                                sc.next();
                            }
                        }
                        float sub = n - y;
                        System.out.printf("Resultado da sua subtração é: %.2f\n", sub);
                        // Subtrair
                        break;

                    case 3:
                        while (true) {
                            try {
                                System.out.print("Insira o primeiro número: ");
                                n = sc.nextFloat();
                                break;
                            } catch (Exception e) {
                                sc.next();
                            }
                        }
                        while (true) {
                            try {
                                System.out.print("Insira o segundo número: ");
                                y = sc.nextFloat();
                                break;
                            } catch (Exception e) {
                                sc.next();
                            }
                        }
                            float mult = n * y;
                            System.out.printf("Resultado da sua multiplicação é: %.2f\n", mult);
                            // Multiplicar
                            break;
                        
                    case 4:
                        while (true) {
                            try {
                                System.out.print("Insira o primeiro número: ");
                                n = sc.nextFloat();
                                break;
                            } catch (Exception e) {
                                sc.next();
                            }
                        }
                        while (true) {
                            try {
                                System.out.print("Insira o segundo número: ");
                                y = sc.nextFloat();
                                break;
                            } catch (Exception e) {
                            sc.next();
                            }
                        }
                        float div = n / y;
                        System.out.printf("Resultado da sua divisão é: %.2f\n", div);
                        // Dividir
                        break;

                    case 0:
                        System.out.println("Programa encerrado");
                        // continuar = false;
                        break;

                    default:
                        System.out.println("Opção inválida");
                }
            } catch (Exception e) {
                System.out.println("Valor inserido inválido! Use os valores do menu.");
                sc.next();
            }
        }
        sc.close();
    }
}