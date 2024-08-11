package comunicacao_threads.produtor_consumidor;

import java.util.Random;

public class Produtor extends Thread{

    private Buffer buffer;

    public Produtor(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        try{
            while(true){
                Random random = new Random();
                buffer.produzItem(random.nextInt(50));
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException exception){

        }
    }

}