import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Idades ===");

        System.out.print("Insiria sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            if (idade >= 60) {
                System.out.println("Você é idoso!");
            } else {
                System.out.println("Você é maior de idade!");
            }
        } else {
            System.out.println("Você é menor de idade!");
        }
        ;

        sc.close();
    }

}
