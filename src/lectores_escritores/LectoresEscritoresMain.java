package lectores_escritores;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class LectoresEscritoresMain {
    public static void main(String[] args) {
        AtomicInteger crearIdLector = new AtomicInteger(0);
        AtomicInteger crearIdEscritor = new AtomicInteger(0);
        Thread[] arrThread = new Thread[10];

        for (int i = 0; i < arrThread.length; i++) {
            if (i <= 4){
                new Thread(new Lector(crearIdLector.getAndIncrement()));
            }else{
                new Thread(new Escritor(crearIdEscritor.getAndIncrement()));
            }
        }

    }

}
