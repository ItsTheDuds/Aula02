import java.util.Scanner;

public class idade_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Verificador de Idades ---");
        System.out.println();

        System.out.println("Quantas vezes você quer verificar: ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Insira a idade da pessoa: ");
            int idade = sc.nextInt();

            if (idade >= 60) {
                System.out.println("Você é maior de idade, porém idoso.");
            } else if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else if (idade < 0) {
                System.out.println("Valor inválido.");
            } else {
                System.out.println("Você é menor de idade.");
            }
        }

        sc.close();
    }
}
