import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o número da conta");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        agencia = scanner.nextLine();

        System.out.println("Digite o seu nome");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu saldo");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,",nomeCliente);
        System.out.printf(" sua agência é %s, conta %d e seu saldo %.2f", agencia, numero, saldo);
        System.out.printf(" já está disponível para saque.");
    }
}
