import java.util.Scanner;
public class for_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número N: ");
        int N = sc.nextInt();
        int soma = 0; //soma é 0
        // N = N + 1; //número do usuário 
        for (int i = 1; i <= N; i++) {
            soma = i + soma;
            System.out.println("Soma: " + i + " + " + ((soma - i)) + " = " + soma);
        }
        System.out.println("Resultado da soma é: " + soma);
        sc.close();
    }
}
