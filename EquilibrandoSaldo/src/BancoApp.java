import java.util.Scanner;
import java.text.DecimalFormat;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite seu investimento:");
        double valorInicial = scanner.nextDouble();

        System.out.println("Insira a taxa de juros:");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Insira o periodo:");
        int periodo = scanner.nextInt();

        // TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os
        // juros.
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        // double juros = montante - valorInicial;

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}
