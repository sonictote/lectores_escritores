package lectoresEscritores_carlos;

import java.util.concurrent.ThreadLocalRandom;

public class Escritores extends Thread {
    private final GestorBD gestor;//Recurso
    private final int id;

    public Escritores(GestorBD gestor, int id) {
        this.gestor = gestor;
        this.id = id;
    }

    public void run() {
        int aleatorio = ThreadLocalRandom.current().nextInt(200, 300);

        while (true) {
            try {
                gestor.empiezaEscribir(id);
                Thread.sleep(aleatorio);
                //Escribiendo...

                gestor.terminaEscribir(id);
                Thread.sleep(aleatorio);
                //En cola
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
