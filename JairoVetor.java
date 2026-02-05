import java.util.Scanner;

public class JairoVetor {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala de aula: ");
        int qtdAlunos = Integer.parseInt(sc.nextLine());
        System.out.println();

        String nomes[] = new String[qtdAlunos];
        int idades[] = new int[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("Qual nome do aluno da posição %d: ", (i+1));
            nomes[i] = sc.nextLine();

            System.out.printf("Qual idade do aluno da posição %d: ", (i+1));
            idades[i] = sc.nextInt();
            sc.nextLine();

            System.out.println();
        }

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("NOME DO ALUNO: " + nomes[i] + " - " + idades[i] + " ANOS");
        }

        sc.close();
    }
}