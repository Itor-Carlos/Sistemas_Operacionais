package comunicacao_threads.produtor_consumidor;

public class MainConsultorProdutor {
    public static void main(String[] args) {

        Buffer buffer = new Buffer(10);
        Consumidor consumidor = new Consumidor(buffer);
        Produtor produtor = new Produtor(buffer);

        produtor.start();
        consumidor.start();
    }
}