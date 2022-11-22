package lectores_escritores;

public class Lector implements Runnable {

    static int contId = -1;
    int id;
    Documento doc;

    public Lector(Documento doc) {
        this.id = contId + 1;
        this.doc = doc;
        contId++;
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
