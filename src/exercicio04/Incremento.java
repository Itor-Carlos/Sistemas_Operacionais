package exercicio04;

public class Incremento {
    private static int valor = 0;
    public Incremento(){};

    public static void incrementar(){
        valor++;
    }

    public static int getValor(){
        return valor;
    }
}
