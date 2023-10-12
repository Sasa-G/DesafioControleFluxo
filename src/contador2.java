import java.util.InputMismatchException;
import java.util.Scanner;
public class contador2 {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try (Scanner terminal = new Scanner(System.in)) {
            try {
            System.out.println("Digite o primeiro número inteiro.");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo número inteiro.");
            int parametroDois = terminal.nextInt();
            System.out.println("");
            int totalIteracoes = contar(parametroUm, parametroDois);
            System.out.println("Total de iterações do FOR: " + (totalIteracoes - 1));
        } catch (InputMismatchException e) {
            System.out.println("Só é aceito como argumento entradas numéricas.");
        }
        }
    }
    private static int contar(int parametroUm, int parametroDois) throws contador2.ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            int contagem = parametroDois - parametroUm;
            for (int x = parametroUm + 1; x < parametroDois; x++) {
                System.out.println("Imprimindo o número " + x);
            }
            return contagem;
        } else {
            throw new ParametrosInvalidosException();
        }
    }
    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior do que o primeiro!");
        }
    }
}