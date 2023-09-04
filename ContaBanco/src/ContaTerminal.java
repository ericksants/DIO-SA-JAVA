import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Agência com o digito:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu Nome e Sobrenome:");
        String nome = scanner.next();
        String sobreNome = scanner.next();

        System.out.println("Digite o valor do depósito:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobreNome
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
