import java.util.Scanner;

public class AtividadeIII {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            double n1=sc.nextDouble();
            System.out.println("Digite outro valor: ");
            double n2=sc.nextDouble();
            System.out.println("Digite o 3º valor: ");
            double n3=sc.nextDouble();

            double soma = n1+n2+n3;
            double media = soma/3;

            System.out.printf("Exibindo resultados: \n" + "1º Valor: " + n1 + "\n2º Valor: " + n2 + "\n3º Valor: " + n3 + "\nMédia:" + media);

        sc.close();
    }
    
}
