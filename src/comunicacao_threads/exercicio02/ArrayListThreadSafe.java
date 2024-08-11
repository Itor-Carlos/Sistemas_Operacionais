package comunicacao_threads.exercicio02;

import java.util.*;

public class ArrayListThreadSafe {
    private final ArrayList<Integer> lista = new ArrayList<>();

    public synchronized void addItem(int item){
        lista.add(item);
    }

    public synchronized void removeItem(int item) {
        lista.remove(item);
    }

    public synchronized int getSize(){
        return this.lista.size();
    }

    public synchronized void getAllItems(){
        for(Integer num : lista){
            System.out.println(num);
        }
    }
}
