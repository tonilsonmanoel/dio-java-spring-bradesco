import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{


    
    public static void main(String[] args) {
        
        int numero;
        String agencia ;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite a Agência!");
        agencia = scanner.next();

        System.out.print("Por favor, seu Nome!");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu deposito inicial!");
        saldo = scanner.nextDouble();

        scanner.close();


        System.out.printf("Olá "+ nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia +", conta " + numero+ " e seu saldo "+ saldo +" já está disponível para saque.");


    }



}