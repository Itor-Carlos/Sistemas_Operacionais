package exercicio05;

public class MainSingleThread {
    public static void main(String[] args) {

        long tempoInicio = System.currentTimeMillis();

        int maximoDivisores = 0;
        int quantidadeMaximaDivisores = 0;

        for (int i = 1; i <= 20000; i++) {
            int divisorCount = contadorDeDivisores(i);
            if (divisorCount > maximoDivisores) {
                maximoDivisores = divisorCount;
                quantidadeMaximaDivisores = i;
            }
        }

        long tempoFinal = System.currentTimeMillis();
        long duracao = tempoFinal - tempoInicio;

        System.out.println("Tempo utilizado em um programa single-thread: " + duracao + "\n");
        System.out.println("Quantidade de divisores: " + quantidadeMaximaDivisores + "\n");
    }

    private static int contadorDeDivisores(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador;
    }
}
