import java.util.Scanner;

public class aprovacaoTURMA {
    public static String verificarSituacao(double media, double frequencia) {

        if (media > 7.0 && frequencia > 75) {
            return "Aprovado";
        } else if (media >= 5.0 && media < 7.0 && frequencia >= 75) {
            return "Recuperação";
        } else if (media < 5.0 || frequencia < 75) {
            return "Reprovado";
        } else {
            return "Situação em andamento.";
        }
    }

    public static String obterMencaoHonrosa(double media, double frequencia) {
        String resultado = (media >= 9 && frequencia >= 1) ? "SIM" : "NÃO";
        return resultado;
    }

    public static String classificarDesempenho(double media) {
        String ExcelenteOuNao = (media >= 9) ? "Excelente" : (media >= 7) ? "Bom" : (media >= 5) ? "Regular" : "Insuficiente";
        return ExcelenteOuNao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] frequencia = new double[5];
        double[] media = new double[5];
        String[] nome = new String[5];

        for (int i = 0; i < media.length; i++) {
            System.out.print("Qual nome do aluno: ");
            nome[i] = sc.nextLine();
            System.out.print("Qual a frequência do aluno: ");
            frequencia[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Qual a média do aluno: ");
            media[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("=== SISTEMA DE APROVAÇÃO DA TURMA ===");

        for (int i = 0; i < 5; i++) {
            System.out.print("Aluno " + (i+1) + ": " + nome[i]);
            System.out.println();
            System.out.print("Média: " + media[i]);
            System.out.println();
            System.out.print("Desempenho: " + classificarDesempenho(media[i]));
            System.out.println("");
            System.out.print("Situação: " + verificarSituacao(media[i], frequencia[i]));
            System.out.println();
            System.out.print("Menção honrosa: " + obterMencaoHonrosa(media[i], frequencia[i]));
            System.out.println();
            System.out.println();
        }

        // double nota1, nota2, nota3, media, freq;
        // System.out.println("Digite a nota de matematica do aluno");
        // nota1 = sc.nextDouble();
        // System.out.println("Digite a nota de português do aluno");
        // nota2 = sc.nextDouble();
        // System.out.println("Digite a nota de história do aluno");
        // nota3 = sc.nextDouble();
        // System.out.println("Digite a frequência do aluno em porcentagem");
        // freq = sc.nextDouble();
        // media = (nota1 + nota2 + nota3) / 3;
        // System.out.println(verificarSituacao(media, freq));
        // media = (nota1 + nota2 + nota3) / 3;
        // if (media > 7.0 && freq > 75) {
        // System.out.println("Aprovado");
        // } else if (media >= 5.0 && media < 7.0 && freq >= 75) {
        // System.out.println("Recuperção");
        // } else if (media < 5.0 || freq < 75) {
        // System.out.println("Reprovado");
        // }

        sc.close();
    }
}