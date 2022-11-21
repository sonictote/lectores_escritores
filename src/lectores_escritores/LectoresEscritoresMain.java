package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class LectoresEscritoresMain {
    public static void main(String[] args) {
        AtomicInteger crearIdLector = new AtomicInteger(0);
        AtomicInteger crearIdEscritor = new AtomicInteger(0);
        Documento gestor = new Documento();
        Documento doc = new Documento();
        Thread[] arrThread = new Thread[10];

        for (int i = 0; i < arrThread.length; i++) {
            if (i <= 4) {
                arrThread[i] = new Thread(new Lector(crearIdLector.getAndIncrement(), doc));
            } else {
                arrThread[i] = new Thread(new Escritor(crearIdEscritor.getAndIncrement(),doc));
            }
            arrThread[i].start();
        }
    }
}
