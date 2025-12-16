import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Positivo ou Negativo ===");

        System.out.print("Insira um número: ");
        float n = sc.nextFloat();

        System.out.println();

        switch (Float.compare(n, 0)) {
            case 1:
                if (n > 0) {
                    System.out.printf("Seu número %.2f é positivo. \n", n);
                }
                break;
            case 2:
                if (n < 0) {
                    System.out.printf("Seu número %.2f é negativo. \n", n);
                }
                break;
            case 3:
                if(n == 0) {
                    System.out.printf("Seu número %.2f é zero. \n", n);
                }
                break;
        }

    sc.close();
    }
}
