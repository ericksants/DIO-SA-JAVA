import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada quantidade de ativos
        int quantidadeAtivos = scanner.nextInt();
        // Entrada dos tipos de ativos
        ArrayList ativos = new ArrayList(quantidadeAtivos);

        scanner.nextLine();
        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {

            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);

        }

        scanner.close();

        // Remove posicao vazia do array
        // ativos.remove(0);

        // Ordenar os ativos em ordem alfabética.
        Collections.sort(ativos);

        // Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        // System.out.println(ativos);
        for (Object str : ativos) {
            System.out.println(str);
        }
    }
}
