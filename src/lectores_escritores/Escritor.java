package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class Escritor implements  Runnable{

    int id;
    GestorLectoresEscritores g;

    public Escritor(int id, GestorLectoresEscritores gestor) {
        this.id = id;
        g = gestor;
    }

    @Override
    public void run() {
        while(true){
            try {
                g.openE(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
