import java.util.Scanner;

public class AtividadeI {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            double n1=sc.nextDouble();
            System.out.println("Digite outro valor: ");
            double n2=sc.nextDouble();

            double soma = n1+n2;
            double subtracao = n1-n2;
            double divisao = n1/n2;
            double multiplicacao = n1*n2;

            System.out.printf("Exibindo resultados: \n" + "Soma: " + soma + "\nSubtração: " + subtracao + "\nDivisão:" + divisao + "\nMultiplicação: " + multiplicacao );

        sc.close();
    }
    
}
