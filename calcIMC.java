import java.util.Scanner;

public class calcIMC {
    public static double calcularIMC(double peso, double altura) {
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public static String classificarIMC(double IMC) {
        if (IMC < 18.5) {
            return "Abaixo do peso";
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            return "Peso normal";
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void exibirResultado(String nome, double IMC, String classificacao) {
        System.out.println("=== Resultado do IMC");
        System.out.println("Nome: " + "[" + nome + "]");
        System.out.printf("IMC: [%.2f]\n", IMC);
        System.out.println("Classificação: " + "[" + classificacao + "]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double IMC = calcularIMC(peso, altura);

        String classificacao = classificarIMC(IMC);

        exibirResultado(nome, IMC, classificacao);
        

        sc.close();
    }

}
