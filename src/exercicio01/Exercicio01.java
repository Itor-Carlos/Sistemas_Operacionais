package exercicio01;

import java.util.Arrays;

public class Exercicio01 extends Thread{
    private int array[];
    private String nome;

    public Exercicio01(int[] array, String nome){
        this.array = array;
        this.nome = nome;
    }

    @Override
    public void run(){
        for (int numberArray : this.array) {
            System.out.printf("Thread %s - %d\n", this.nome, numberArray);
        }
        System.out.println("\nVetor Ordenado\n");
        Arrays.sort(this.array);
        for (int numberArrayOrder : this.array) {
            System.out.printf("Thread %s - %d\n", this.nome, numberArrayOrder);
        }
    }
}
