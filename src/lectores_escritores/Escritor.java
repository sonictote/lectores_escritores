package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class Escritor implements  Runnable{

    int id;

    public Escritor(int id) {
        this.id = id;
    }

    public void escribir() {

    }

    @Override
    public void run() {

    }
}
