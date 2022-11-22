package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class LectoresEscritoresMain {
    public static void main(String[] args) {

        Documento gestor = new Documento();
        Documento doc = new Documento();
        Thread[] arrThread = new Thread[6];

        for (int i = 0; i < arrThread.length; i++) {
            if (i <= 1) {
                arrThread[i] = new Thread(new Lector(doc));
            } else {
                arrThread[i] = new Thread(new Escritor(doc));
            }
            arrThread[i].start();
        }
    }
}
