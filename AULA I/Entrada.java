import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Olá, qual é o seu nome? ");
            String nome=sc.next();
            System.out.println("E seu sobrenome? ");
            String sobrenome=sc.next();
            System.out.println("Seu nome completo é " + nome + " " + sobrenome + " ?");

        sc.close();


    }
}
