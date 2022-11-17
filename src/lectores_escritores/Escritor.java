package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class Escritor implements  Runnable{

    AtomicInteger id;

    public Escritor(AtomicInteger id) {
        this.id = id;
    }

    public void escribir() {

    }

    @Override
    public void run() {

    }
}
