import java.util.Scanner;

public class temperaturasVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempMaior = Double.MIN_VALUE;
        double tempMenor = Double.MAX_VALUE;
        int indiceMaior = 0;
        int indiceMenor = 0;
        double resultado = 0;
        double soma = 0;

        double tempMensal[] = new double[12];
        String mes[] = {"Janeiro","Fevereiro","Março",
                        "Abril", "Maio", "Junho",
                        "Julho", "Agosto", "Setembro",
                        "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < mes.length; i++) {

            System.out.println("Qual a temperatuda média do mês de " + mes[i]);
            tempMensal[i] = sc.nextDouble();
            sc.nextLine();

            if (tempMensal[i] > tempMaior) {
                tempMaior = tempMensal[i];
                indiceMaior = i;
            }

            if(tempMensal[i] < tempMenor) {
                tempMenor = tempMensal[i];
                indiceMenor = i;
            }
            
            soma += tempMensal[i];
            resultado = soma/12;

        }

        System.out.printf("A média de temperatura entre os mêses é: %.1f°C\n", resultado);
        System.out.printf("A temperatura máxima registrada entre os mêses é: %s com %.1f°C\n", mes[indiceMaior], tempMaior);
        System.out.printf("A temperatura mínima registrada entre os mêses é: %s com %.1f°C\n", mes[indiceMenor], tempMenor);
        

        sc.close();
    }
    
}
