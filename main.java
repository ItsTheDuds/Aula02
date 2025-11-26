import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro Simles ===");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua cidade: ");
        sc.nextLine();
        String cidade = sc.nextLine();

        System.out.print("Digite seu salário: ");
        float salario = sc.nextFloat();

        System.out.println("=== Dados Informados ===");
        System.out.print("Nome: ");
        System.out.println(nome);
        System.out.print("Idade: ");
        System.out.println(idade);
        System.out.print("Cidade: ");
        System.out.println(cidade);
        System.out.printf("Salário: %.2fR$ %n", salario);
        System.out.println("Cadastro concluído!");


        sc.close();

    }
}