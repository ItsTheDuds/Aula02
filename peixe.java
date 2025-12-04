import java.util.Scanner;

public class peixe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("=== Calculando Peso e Multa de Peixe ===");
        System.out.println();

        while (true) {

            System.out.println("Qual valor do peixe pescado?");
            int p = sc.nextInt();
            if (p == 0) {
                System.out.println("Arrivederci... código encerrando.");
                break;
            } else if (p > 50) {
                int e = p - 50;
                int m = e * 4;
                System.out.printf("O valor da multa é: %d R$%n",m);
            } else {
                System.out.println("O valor do excesso é zero, consequentemente da multa é zero");
            }
        }
        sc.close();
    }
}