package lectores_escritores;

public class Escritor implements  Runnable{

    static int contId = -1;
    int id;
    Documento doc;

    public Escritor(Documento doc) {
        this.id = contId + 1 ;
        this.doc = doc;
        contId++;
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
