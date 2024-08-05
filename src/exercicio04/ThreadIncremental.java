package exercicio04;

public class ThreadIncremental extends Thread{

    @Override
    public void run(){
        for(int i = 0; i<10000;i++){
            Incremento.incrementar();
        }
    }

}
