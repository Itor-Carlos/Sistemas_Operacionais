package exercicio02;

import java.time.LocalDateTime;

public class Exercicio2 extends Thread {
    private Integer numeroThread;
    private LocalDateTime timeFinalizacao;

    public Exercicio2(Integer numeroThread) {
        this.numeroThread = numeroThread;
    }

    public LocalDateTime getTimeFinalizacao() {
        return this.timeFinalizacao;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Olá, sou a Thread número %d!\n", this.numeroThread);
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        timeFinalizacao = LocalDateTime.now();
        System.out.println("Thread " + this.numeroThread + " finalizou em: " + timeFinalizacao);
    }
}


