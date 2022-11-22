package lectoresEscritores_carlos;

import java.util.concurrent.ThreadLocalRandom;

public class Lectores extends Thread {
    private final GestorBD gestor;//Recurso
    private final int id;

    public Lectores(GestorBD gestor, int id) {
        this.gestor = gestor;
        this.id = id;
    }

    public void run() {
        int aleatorio = ThreadLocalRandom.current().nextInt(200, 300);

        while (true) {
            try {
                gestor.empiezaLeer(id);
                Thread.sleep(aleatorio);
                //Leyendo...

                gestor.terminaLeer(id);
                Thread.sleep(aleatorio);
                //En cola
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
