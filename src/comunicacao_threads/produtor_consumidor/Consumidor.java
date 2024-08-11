package comunicacao_threads.produtor_consumidor;

import java.util.Random;

public class Consumidor extends Thread{

    private Buffer buffer;

    public Consumidor(Buffer buffer){
       this.buffer = buffer;
    }

    @Override
    public void run(){
        try{
            while(true){
                buffer.consumeItem();
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException exception){

        }


    }

}