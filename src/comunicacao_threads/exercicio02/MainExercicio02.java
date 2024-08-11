package comunicacao_threads.exercicio02;

import java.util.Random;

public class MainExercicio02 {
    public static void main(String[] args) {
        ArrayListThreadSafe arrayListThreadSafe = new ArrayListThreadSafe();

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i<10;i++){
                Random random = new Random();
                arrayListThreadSafe.addItem(random.nextInt(50));
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i<10;i++){
                Random random = new Random();
                arrayListThreadSafe.addItem(random.nextInt(50));
            }
        });

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        arrayListThreadSafe.getAllItems();

    }
}
