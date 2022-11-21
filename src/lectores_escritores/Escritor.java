package lectores_escritores;

public class Escritor implements  Runnable{

    int id;
    Documento doc;

    public Escritor(int id, Documento doc) {
        this.id = id;;
        this.doc = doc;
    }

    @Override
    public void run() {
        while(true){
            try {
                doc.openE(id);
                doc.closeE(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
