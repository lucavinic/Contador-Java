import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            int resultado = calcularParametro(parametroUm, parametroDois);
            System.out.println("Total de: " + resultado + " ocorrência(s) para o intereação.");

            for(int contagem = 1; contagem <= resultado; contagem++){
                System.out.println("Essa é a interação número: " + contagem);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static int calcularParametro(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        return parametroDois - parametroUm;
    }

}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
