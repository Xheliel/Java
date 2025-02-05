import java.util.Scanner;

public class AtividadeIV {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite uma palavra: ");
            String primeira_palavra=sc.next();
            System.out.println("Digite outra palavra: ");
            String segunda_palavra=sc.next();

            System.out.printf("Exibindo resultados: \n" + "As duas palavras concatenadas: " + primeira_palavra + " " + segunda_palavra);

        sc.close();
    }
    
}
