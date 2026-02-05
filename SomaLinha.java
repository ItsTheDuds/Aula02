import java.util.Scanner;
public class SomaLinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        // Preencher a matriz
        System.out.println("Digite os 16 valores da matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Escolher a linha
        System.out.print("Qual linha deseja somar? (0 a 3): ");
        int linha = sc.nextInt();

        if(linha < 0 || linha > 3) {
            System.out.println("Erro, linha inexistente. Digite um valor de 0 a 3!");
        } else {
            for (int j = 0; j < 4; j++) {
                soma += matriz[linha][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    System.out.println("O resultado da soma das linhas é: " + soma);

        

        // Seu código aqui para calcular a soma

        // if (linha == 0) {
        //     int somaLinha = matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[0][3];
        //     System.out.println(somaLinha);
        // } else if (linha == 1) {
        //     int somaLinha = matriz[1][0] + matriz[1][1] + matriz[1][2] + matriz[1][3];
        //     System.out.println(somaLinha);
        // } else if (linha == 2) {
        //     int somaLinha = matriz[2][0] + matriz[2][1] + matriz[2][2] + matriz[2][3];
        //     System.out.println(somaLinha);
        // } else if (linha == 3) {
        //     int somaLinha = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3];
        //     System.out.println(somaLinha);
        // }

        sc.close();
    }
}