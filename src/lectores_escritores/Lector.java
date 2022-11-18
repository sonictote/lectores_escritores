package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class Lector implements Runnable {

    int id;
    GestorLectoresEscritores g;

    public Lector(int id, GestorLectoresEscritores gestor) {
        this.id = id;
        g = gestor;
    }

    @Override
    public void run() {
        while (true) {
            try {
                g.openL(id);
                g.closeL(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
