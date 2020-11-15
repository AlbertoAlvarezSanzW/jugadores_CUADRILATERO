import java.util.Random;

public class Luchador extends Thread {

    Cuadrilatelo cuadrilatero;
    public Luchador(Cuadrilatelo cuadrilatero) {
        this.cuadrilatero = cuadrilatero;
    }
    @Override
    public void run() {
        try {
            cuadrilatero.comenzarLucha(this);
            int duracion = new Random().nextInt(6000) + 1000;
            System.out.println("Luchador " + getName() + " entre al CUADRILATERO " + duracion);
            sleep(duracion);
            System.out.println("¡¡¡¡¡¡ME PEGAN!!!!!!! ¡fuck! " + getName() + " ¡ me han tocado y hundido !");
            cuadrilatero.descalificadoLucha(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
