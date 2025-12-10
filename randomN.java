import java.util.Scanner;

public class randomN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = (int) (Math.random() * 100);
        int nTentativas = 1;

        while (nTentativas != 1000) {
            System.out.println("Digite um número de 0 a 100: ");
            int n = sc.nextInt();

            if (n > r) {
                System.out.println("O número secreto é menor que o número digitado");
            } else if (n == r) {
                System.out.println();
            } else {
                System.out.println("O número secreto é maior que o número digitado");
            }

            if (n == r) {
                System.out.println("Você acertou o número secreto!");
                break;
            } else {
                System.out.println("Você ainda não acertou, o número secreto mudou (multiplicou x2)!");
                r = r * 2;

            }
            nTentativas++;
        }
        sc.close();
    }
}