import java.util.Scanner;

public class CalculoII {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            int n1=sc.nextInt();
            System.out.println("Digite outro valor: ");
            int n2=sc.nextInt();
            int soma = n1+n2;
            System.out.println(soma);

        sc.close();
    }
    
}
