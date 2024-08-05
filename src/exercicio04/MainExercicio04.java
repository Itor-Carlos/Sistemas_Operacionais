package exercicio04;

public class MainExercicio04 {
    public static void main(String[] args) {
        int numThreads = 16;

        ThreadIncremental[] threads = new ThreadIncremental[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new ThreadIncremental();
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Valor final: " + Incremento.getValor());
    }
}