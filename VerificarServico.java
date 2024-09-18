import java.util.Scanner;

public class VerificarServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o nome do serviço a ser verificado
        System.out.println("Digite o nome do serviço a ser verificado (movel, fixa, banda larga, tv):");
        String servico = scanner.nextLine().toLowerCase();

        // Leia o nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente e os serviços contratados (separados por vírgulas):");
        String[] clienteEServicos = scanner.nextLine().split(",");

        // Verifique se o serviço está contratado pelo cliente
        boolean servicoContratado = false;
        for (int i = 1; i < clienteEServicos.length; i++) {
            if (clienteEServicos[i].trim().toLowerCase().equals(servico)) {
                servicoContratado = true;
                break;
            }
        }

        // Imprima o resultado
        if (servicoContratado) {
            System.out.println("O cliente " + clienteEServicos[0] + " tem esse serviço contratado.");
        } else {
            System.out.println("O cliente " + clienteEServicos[0] + " não tem esse serviço contratado.");
        }

        scanner.close();
    }
}