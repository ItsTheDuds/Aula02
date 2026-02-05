import java.util.Scanner;
public class calcularINSS {
    public static double calcularINSS(double salarioBruto) {
        if(salarioBruto <= 1320) {
            return (salarioBruto / 100) * 7.5;
        } else if (salarioBruto <= 2571.29) {
            return (salarioBruto / 100) * 9;
        } else if (salarioBruto <= 3856.94) {
            return (salarioBruto / 100) * 12;
        } else {
            return (salarioBruto / 100) * 14;
        }
    }

    public static double calcularIR (double salarioBruto, double descontoINSS) {
        double salarioPosINSS = salarioBruto - descontoINSS;
        double imposto = 0;
        if (salarioPosINSS > 4664.68) {
            imposto += (salarioPosINSS - 4664.68) / 100 * 27.5;
        }
        if (salarioPosINSS > 3751.05) { 
            imposto += (salarioPosINSS - 3751.05) / 100 * 22.5;        
        }
        if (salarioPosINSS > 2826.65) {
            imposto += (salarioPosINSS - 2826.65) / 100 * 15;
        }
        if (salarioPosINSS > 2112) {
            imposto += (salarioPosINSS - 2112) / 100 * 0;
        }
        return imposto;
    }

    public static double calcularValeTransporte (double salarioBruto, boolean usaValeTransporte) {
        if (usaValeTransporte == true) {
            return salarioBruto / 100 * 6;
        } else {
            return 0;
        }
    }

    public static double calcularHorasExtras (double valorHora, int quantidadeHorasExtras) {
        return quantidadeHorasExtras * valorHora * 1.5;
    }

    public static double calcularSalarioLiquido (double salarioBruto, double totalDescontos, double totalAdicionais) {
        double salarioLiquido = salarioBruto - totalDescontos + totalAdicionais;
        return salarioLiquido;
    }

    public static void exibirContracheque (String nome, double salarioBruto, double horasExtras, double descontoINSS, double descontoIR, double descontoVT, double salarioLiquido) {
        System.out.println("===============================================");
        System.out.println("       CONTRA CHEQUE - [MÊS/ANO]");
        System.out.println("===============================================");

        System.out.println();

        System.out.println("Funcionário:" + " [ " + nome + " ] ");

        System.out.println("PROVENTOS:");
        System.out.printf("   Salário Bruto:             R$ [%.2f]\n", salarioBruto);
        System.out.printf("   Horas Extras:              R$ [%.2f]\n", horasExtras);
        System.out.printf("   Total Proventos:           R$ [%.2f]\n", (salarioBruto + horasExtras));

        System.out.println();

        System.out.println("DESCONTOS:");

        System.out.printf("   INSS:                      R$ [%.2f]\n", descontoINSS);
        System.out.printf("   Imposto de Renda:          R$ [%.2f]\n", descontoIR);
        System.out.printf("   Vale Transporte:           R$ [%.2f]\n", descontoVT);
        System.out.printf("   Total Descontos:           R$ [%.2f]\n", (descontoINSS + descontoIR + descontoVT));

        System.out.println();

        System.out.println("===============================================");
        System.out.printf("   SALÁRIO LÍQUIDO:           R$ [%.2f]\n", salarioLiquido);
        System.out.println("===============================================");


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean usaValeTransporte = false;

        System.out.print("Qual nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Qual sálario bruto do funcionário: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Qual valor da hora de trabalho: ");
        double valorHora = sc.nextDouble();

        System.out.print("Quantas horas extras foram feitas no mês: ");
        int quantidadeHorasExtras = sc.nextInt();
        sc.nextLine();

        System.out.print("Usa Vale Transporte: (S/N): ");
        String respostaUsuario = sc.nextLine();

        if (respostaUsuario.equalsIgnoreCase("S")) {
            usaValeTransporte = true;
            calcularValeTransporte(salarioBruto, usaValeTransporte);
        } else if (respostaUsuario.equalsIgnoreCase("N")) {
            usaValeTransporte = false;
        }

        double descontoINSS = calcularINSS(salarioBruto);
        double descontoVT = calcularValeTransporte(salarioBruto, usaValeTransporte);
        double descontoIR = calcularIR(salarioBruto, descontoINSS);
        double horasExtras = calcularHorasExtras(valorHora, quantidadeHorasExtras);
        double totalAdicionais = horasExtras;
        double totalDescontos = descontoINSS + descontoIR + descontoVT;
        double salarioLiquido = calcularSalarioLiquido(salarioBruto, totalDescontos, totalAdicionais);


        exibirContracheque(nome, salarioBruto, horasExtras, descontoINSS, descontoIR, descontoVT, salarioLiquido);

        sc.close();
    }
}