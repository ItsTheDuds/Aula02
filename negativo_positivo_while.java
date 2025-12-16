import java.util.Scanner;

public class negativo_positivo_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Negativo ou Positivo ===");
        System.out.println();

        String answer = "";

        while (true) {
            System.out.print("Insira um número N: ");
            float n = sc.nextFloat();
            sc.nextLine();

            System.out.println();

            if (n > 0) {
                System.out.printf("Seu número %.2f é positivo \n", n);
            } else if (n < 0) {
                System.out.printf("Seu número %.2f é negativo. \n", n);
            } else {
                System.out.printf("Seu número %.2f é zero. \n", n);
            }

            System.out.println();

            System.out.print("Continuar? Sim ou não?: ");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("Não")) {
                System.out.println();
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println();
                break;
            } else if (answer.equalsIgnoreCase("Sim")) {
                System.out.println();
                continue;
            } else {
                break;
            }
        } 


        sc.close();
    }
}