package exercicio05;

public class ThreadContadora extends Thread{
    private int inicio;
    private int fim;

    public ThreadContadora(int inicio, int fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run(){
        int maximoDivisores = 0;
        int quantidadeMaximoDivisores = 0;

        for(int i = this.inicio; i<this.fim;i++){
            int quantidadeDivisores = contadorDivisores(i);
            if(quantidadeDivisores > maximoDivisores){
                maximoDivisores = quantidadeDivisores;
                quantidadeMaximoDivisores = i;
            }
        }
    }

    private int contadorDivisores(int number) {
        int contador = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                contador++;
            }
        }
        return contador;
    }

}
