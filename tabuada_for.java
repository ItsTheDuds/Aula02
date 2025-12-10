import java.util.Scanner;
public class tabuada_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Tabuada * 10 ===");
        System.out.println();
        
        System.out.print("Insira um número n: ");
        
        int n = sc.nextInt();

        for(int i = 0; i <= 10; i++) {
            int mult = n * i;
            System.out.printf("%d * %d = %d\n",n,i,mult);
        }


        sc.close();
    }
}
