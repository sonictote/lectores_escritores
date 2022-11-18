package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class LectoresEscritoresMain {
    public static void main(String[] args) {
        AtomicInteger crearIdLector = new AtomicInteger(0);
        AtomicInteger crearIdEscritor = new AtomicInteger(0);
        GestorLectoresEscritores gestor = new GestorLectoresEscritores();
        Thread[] arrThread = new Thread[10];

        for (int i = 0; i < arrThread.length; i++) {
            if (i <= 4) {
                arrThread[i] = new Thread(new Lector(crearIdLector.getAndIncrement(), gestor));
            } else {
                arrThread[i] = new Thread(new Escritor(crearIdEscritor.getAndIncrement(), gestor));
            }
            arrThread[i].start();
        }
    }
}
