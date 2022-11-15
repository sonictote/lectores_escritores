package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class Lector implements Runnable {

    AtomicInteger id;

    public Lector (){
        this.id = new AtomicInteger(0);
    }

    public void leer () {

    }

    @Override
    public void run() {

    }
}
