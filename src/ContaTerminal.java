import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta!");
            int number = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência!");
            String agency = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
            String clientName = scanner.next();

        System.out.println("Por favor, digite o sobrenome!");
            String lastName = scanner.next();

        System.out.print("Por favor, digite o seu saldo!");
            float balance = scanner.nextFloat();

        System.out.println("Olá " + clientName + " " + lastName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");
    }
}










