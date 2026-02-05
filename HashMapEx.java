import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> produtos = new HashMap<>();

        System.out.println("=== X === ESTOQUE DE PRODUTOS === X ===");
        System.out.print("Quantos produtos existem em seu estoque: ");
        int tamanho = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= tamanho; i++) {
            System.out.print("Nome do produto: ");
            String itemNome = sc.nextLine();
            System.out.print("Qual valor do produto: ");
            double itemValor = sc.nextDouble();
            sc.nextLine();
            produtos.put(itemNome, itemValor);
        }

        System.out.println();

        for (String i : produtos.keySet()) {
            System.out.println(i + " -> R$ " + produtos.get(i));
        }
        while (true) {
            System.out.println();
            System.out.print("Digite o nome do produto que deseja exibir (Digite SAIR para parar): ");
            String exibirProduto = sc.nextLine();

            if (exibirProduto.equalsIgnoreCase("Sair")) {
                break;
            }
            if (produtos.containsKey(exibirProduto)) {
                System.out.println("Valor: R$" + produtos.get(exibirProduto));
            }
        }

        sc.close();
    }
}
