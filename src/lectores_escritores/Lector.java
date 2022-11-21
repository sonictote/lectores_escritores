package lectores_escritores;

public class Lector implements Runnable {

    int id;
    Documento doc;

    public Lector(int id,Documento doc) {
        this.id = id;
        this.doc = doc;
    }

    @Override
    public void run() {
        while (true) {
            try {
                doc.openL(id);
                doc.closeL(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
