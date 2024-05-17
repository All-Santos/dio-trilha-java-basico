import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner contaTerminal = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.println(" Nome : ");
        String nome = contaTerminal.next();

        System.out.println(" Sobrenome : ");
        String sobrenome = contaTerminal.next();

        System.out.println(" Número da conta: ");
        int numeroConta = contaTerminal.nextInt();

        System.out.println(" Número da agência: ");
        String numeroAgencia = contaTerminal.next();

        System.out.println(" Saldo em conta: ");
        double saldo = contaTerminal.nextDouble();

        System.out.println("Olá "+nome+" "+sobrenome);
        System.out.println("Bem vindo ao banco Santander");
        System.out.println("Sua agência é a "+ numeroAgencia);
        System.out.println("E o número da sua conta é "+ numeroConta);
        System.out.println("O seu saldo disponível é "+ saldo);

        contaTerminal.close();
    
    }
}
