package lectoresEscritores_carlos;

public class Lanzador {
    public static void main(String[] args) {

        GestorBD gestor = new GestorBD();//Recurso compartido

        Escritores[] listE = new Escritores[5];
        Lectores[] listL = new Lectores[5];

        for (int i = 0; i < listE.length; i++) {//ESCRITORES
            listE[i] = new Escritores(gestor, i);
        }
        for (int i = 0; i < listL.length; i++) {//LECTORES
            listL[i] = new Lectores(gestor, i);
        }

        //START
        for (Escritores escritores : listE) {
            escritores.start();
        }
        for (Lectores lectores : listL) {
            lectores.start();
        }
    }
}
