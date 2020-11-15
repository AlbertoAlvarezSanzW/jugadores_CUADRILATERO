


public class Main {

    public static void main(String[] args) {
        Cuadrilatelo c = new Cuadrilatelo();
        for (int i = 0; i < 10; i++){
            Luchador t = new Luchador(c);
            t.setName("numero: " +i);
            t.start();
        }
    }

}
