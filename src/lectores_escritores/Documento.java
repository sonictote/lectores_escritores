package lectores_escritores;

public class Documento {
    private int numLectores = 0;
    private boolean hayEscritor = false;

    public  void  openL(int idLectores) throws InterruptedException {
        while (hayEscritor) {
            wait();
        }
        numLectores++;
        System.out.println("Lectores =" + numLectores);
        System.out.println("Lector " + idLectores + " esta leyendo el documento");

    }

    public  void closeL(int idLectores) {
        System.out.println("Lector " + idLectores + " deja de leer el documento");
        numLectores--;
        if (numLectores == 0) {
            notifyAll();
        }
    }

    public synchronized void openE(int idEscritores) throws InterruptedException {
        while (hayEscritor || numLectores > 0) {
            wait();
            System.out.println("hay escritor");
        }
        hayEscritor = true;

        System.out.println("Escritor " + idEscritores + " esta escribiendo el documento");
    }

    public synchronized void closeE(int idEscritores) {
        hayEscritor = false;
        System.out.println("Lector " + idEscritores + " deja de leer el documento");
        notifyAll();

    }
}
