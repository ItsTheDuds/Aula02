import java.util.Scanner;

public class cds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("=== Loja de CDs ===");
        System.out.println();
        while (true) {
            System.out.print("Qual cor de CD você deseja: ");
            String corCD = sc.nextLine();

            if (corCD.equalsIgnoreCase("Azul")) {
                System.out.println("CD azul custa 10,00R$");
                break;
            } else if (corCD.equalsIgnoreCase("Vermelho")) {
                System.out.println("CD vermelho custa 27,60R$");
                break;
            } else if (corCD.equalsIgnoreCase("Amarelo")) {
                System.out.println("CD amarilo custa 48,30R$");
                break;
            } else {
                System.out.println("Cor inválida, só vendemos CDs na cor: Vermelho, azul e amarelo.");
            } continue;
        } sc.close();
    }

}
