package exercicio01;

import java.util.Scanner;

public class MainExercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int quantidadeInteiros = teclado.nextInt();

        int[] arrayA = new int[quantidadeInteiros];

        for(int i = 0; i<quantidadeInteiros;i++){
            arrayA[i] = teclado.nextInt();
        }

        Exercicio01 threadA = new Exercicio01(arrayA, "array A");
        threadA.start();
    }
}
