import java.util.Scanner;
public class Do_while_regressivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor máximo da contagem: ");
        int N = sc.nextInt(); // leia o valor maximo da contagem inserido pelo usuario
        int i = N;
        do { // faça uma ação
            System.out.println(i); // essa ação vai ser print I
            i--; // decrementando i
        } while (i >= 0); // enquanto i for maior ou igual a zero
        sc.close();
    }
}