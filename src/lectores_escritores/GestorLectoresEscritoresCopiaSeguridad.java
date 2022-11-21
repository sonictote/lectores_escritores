package lectores_escritores;

public class GestorLectoresEscritoresCopiaSeguridad {
    private int numLectores = 0;
    private boolean hayEscritor = false;

    public synchronized void openL(int idLectores) throws InterruptedException {
        while (hayEscritor) {
            wait();
        }
        numLectores++;
        System.out.println("Lector " + idLectores + " esta leyendo el fihero");
    }

    public synchronized void closeL(int idLectores) {
        System.out.println("Lector " + idLectores + " deja de leer el fiechero");
        numLectores--;
        if (numLectores == 0) {
            notify();
        }
    }

    public synchronized void openE(int idEscritores) throws InterruptedException {
        while (hayEscritor || numLectores > 0) {
            wait();
        }
        hayEscritor = true;
        System.out.println("Escritor " + idEscritores + " esta escribiendo el fichero");
    }

    public synchronized void closeE(int idEscritores) {
        System.out.println("Lector " + idEscritores + " deja de leer el fichero");
        notifyAll();

    }
}
