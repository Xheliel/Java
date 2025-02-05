import java.util.Scanner;

public class AtividadeII {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            double n1=sc.nextDouble();
            System.out.println("Digite outro valor: ");
            double n2=sc.nextDouble();

            double soma = n1+n2;
            double media = soma/2;

            System.out.printf("Exibindo resultados: \n" + "1º Valor: " + n1 + "\n2º Valor: " + n2 + "\nMédia:" + media);

        sc.close();
    }
    
}
