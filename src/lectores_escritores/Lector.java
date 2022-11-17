package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class Lector implements Runnable {

    AtomicInteger id;

    public Lector (AtomicInteger id){
        this.id = id;
    }

    public void leer () {

    }

    @Override
    public void run() {

    }
}
