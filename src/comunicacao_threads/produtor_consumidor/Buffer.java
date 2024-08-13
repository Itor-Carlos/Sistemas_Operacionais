package comunicacao_threads.produtor_consumidor;

public class Buffer {
    private int[] elements;
    private int tamanho;
    private int quantidadeItens = 0;

    public Buffer(int quantidadeElements){
        this.elements = new int[quantidadeElements];
        this.tamanho = quantidadeElements;
    }

    public synchronized void produzItem(int item) throws InterruptedException {
        while (quantidadeItens == tamanho) {
            wait();
        }
        elements[quantidadeItens] = item;
        quantidadeItens++;
        System.out.println(quantidadeItens);
        notify();
    }

    public synchronized void consumeItem() throws InterruptedException {
        while (quantidadeItens == 0) {
            wait();
        }
        System.out.printf("Item removido: %d\n", elements[quantidadeItens]);
        quantidadeItens--;
        notify();
    }

    public void exibeItens(){
        for(int i = 0; i<quantidadeItens;i++){
            System.out.printf("item %d - %d\n", i,elements[i]);
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public int getQuantidadeItens(){
        return this.quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens){
        this.quantidadeItens = quantidadeItens;
    }
}
