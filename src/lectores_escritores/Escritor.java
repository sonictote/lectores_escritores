package lectores_escritores;

import java.util.concurrent.atomic.AtomicInteger;

public class Escritor {

    AtomicInteger id;

    public Escritor() {
        this.id = new AtomicInteger(0);
    }

    public void escribir() {

    }
}
