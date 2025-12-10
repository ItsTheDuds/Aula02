import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Contagem Progressiva e Regressiva ===");
        System.out.println();
    

        System.out.print("Insira um número para ser uma contagem progressiva: ");
        int n = sc.nextInt();
        System.out.print("Insira um número para ser uma contagem regressiva: ");
        int j = sc.nextInt();
        System.out.println();
        for (int i = -1; i < n; i++) {
            System.out.println("Contagem progressiva: " + (i + 1));
        }
        System.out.println();
        for (int y = j; y >= 0; y--) {
            System.out.println("Contagem regressiva: " + y);
        }

        sc.close();
    }

}
