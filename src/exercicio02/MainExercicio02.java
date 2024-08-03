package exercicio02;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class MainExercicio02 {
    public static void main(String[] args) {

        Exercicio2 thread01 = new Exercicio2(1);
        Exercicio2 thread02 = new Exercicio2(2);

        thread01.start();
        thread02.start();

        try {
            thread01.join();
            thread02.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        if (thread01.getTimeFinalizacao().isBefore(thread02.getTimeFinalizacao())) {
            System.out.println("Thread 1 finalizou primeiro");
        } else if (thread01.getTimeFinalizacao().isEqual(thread02.getTimeFinalizacao())) {
            System.out.println("As threads finalizaram ao mesmo tempo");
        } else {
            System.out.println("Thread 2 finalizou primeiro");
        }

        Date dateThread1 = convertToDate(thread01.getTimeFinalizacao());
        Date dateThread2 = convertToDate(thread02.getTimeFinalizacao());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("Thread 1 terminou em: " + sdf.format(dateThread1));
        System.out.println("Thread 2 terminou em: " + sdf.format(dateThread2));
    }

    public static Date convertToDate(LocalDateTime localDateTime) {
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }
}
