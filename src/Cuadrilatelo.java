import java.util.concurrent.Semaphore;

import java.util.concurrent.Semaphore;

public class Cuadrilatelo {

    private static final int MAX_AVAILABLE = 2;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);


    public void comenzarLucha(Luchador lucha) throws InterruptedException {
        available.acquire();

    }

    public void descalificadoLucha(Luchador luchador) {
        available.release();
    }





}
