import java.util.Scanner;
public class do_while_tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número n: ");
        int n = sc.nextInt();
        System.out.println();
        int i = 0;

        do{
            int mult = n * i;
            System.out.printf("%d * %d = %d\n",n ,i ,mult);
            i++;
        } while (i <=10);

        sc.close();
    }
}
