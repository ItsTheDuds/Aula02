import java.util.Scanner;

public class contagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inscreva the PHRASE!!!!: ");
        String frase = sc.nextLine();
        int cont = 1;

        while (cont <= 1000) {
            System.out.println(frase + " + contagem atual: " + cont + " + 1");
            cont++;

        }
        sc.close();
        System.out.println("Dudinha Games");
    }
}
