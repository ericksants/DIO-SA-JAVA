import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // selecaoCadidatos();
        // imprimirSelecionados();
        String[] candidatos = { "ERICK", "SANTOS", "MARIA", "JOSE", "PEDRO" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Sucesso de contato com " + candidato + " na " + tentativasRealizadas + " Tentativa");
        else
            System.out.println("Falha de contato com " + candidato + " numero maximo de tentativas "
                    + tentativasRealizadas + " realizadas ");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "ERICK", "SANTOS", "MARIA", "JOSE", "PEDRO" };

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("Candidato nº: " + indice + " é " + candidatos[indice]);
        }

        /*
         * forma sem indice
         * for (String candidato : candidatos) {
         * System.out.println("Candidato " + candidato);
         * }
         */

    }

    static void selecaoCadidatos() {

        String[] candidatos = { "ERICK", "SANTOS", "MARIA", "JOSE", "PEDRO", "LUCAS", "MATEUS", "ANA", "JESSICA",
                "LARISSA" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando os demais resultados");
        }
    }
}
