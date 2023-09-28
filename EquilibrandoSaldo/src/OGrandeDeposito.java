import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class OGrandeDeposito {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        double valor = scanner.nextDouble();

        if (valor > 0) {
            // TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide
            // Exemplos).
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + df.format(valor));
        } else if (valor == 0) {
            // TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Encerrando o programa...");
        } else {
            // TODO: Imprimir a mensagem de encerrar o programa.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}
