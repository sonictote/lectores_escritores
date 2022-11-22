package lectoresEscritores_carlos;

public class GestorBD {
    private int numLectores = 0;
    private boolean hayEscritores = false;

    /*
    LECTOR
     */
    public synchronized void empiezaLeer(int id) throws InterruptedException {
        while (hayEscritores) {
            wait();//Mientras hallan escritores escribiendo, esperan los lectores.
        }
        //AUTORIZADO
        numLectores++;
        System.out.println("Lector_" + id + " esta leyendo...");
        //Leyendo...
    }

    public synchronized void terminaLeer(int id) {
        numLectores--;
        System.out.println("Lector_" + id + " ha terminado de leer");
        if (numLectores == 0) notifyAll();//Si no hay ningún lector usando el recurso, se libera.
    }

    /*
    ESCRITOR
     */
    public synchronized void empiezaEscribir(int id) throws InterruptedException {
        while (hayEscritores || numLectores > 0) {
            wait();//Mientras hallan escritores o lectores en recurso, el escritor espera.
        }
        //AUTORIZADO
        hayEscritores = true;
        System.out.println("Escritor_" + id + " esta escribiendo...");
        //Escribiendo...
    }

    public synchronized void terminaEscribir(int id) {
        hayEscritores = false;
        System.out.println("Escritor_" + id + " ha terminado de escribir");
        notifyAll();//Se libera el recurso cuando el escritor termina de escribir.
    }
}
