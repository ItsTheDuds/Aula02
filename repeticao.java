import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Insira sua idade: ");
            int idade = sc.nextInt();
            if (idade == 0) {
                System.out.println("Idade inválida, programa se encerrando...");
                break;
            } else if (idade < 0) {
                System.out.println("Idade inválida, insira novamente");
            } else if (idade >= 18) {
                if (idade >= 60) {
                    System.out.println("Você é maior de idade porém idoso.");
                } else {
                    System.out.println("Você é maior de idade.");
                }
            } else {
                System.out.println("Você é menor de idade.");
            }
        }
        sc.close();
    }
}