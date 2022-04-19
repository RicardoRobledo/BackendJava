import java.util.ArrayList;

/**
 * This class is made up for our tests
 *
 * @author: Ricardo
 */


public class Prueba {

    public static void main(String[] args) {

        // -----------------Mana-----------------

        Artista fer = new Artista("Fer", "Vocalista");
        Artista alex = new Artista("Alex", "Baterista");
        Artista juan = new Artista("Juan", "Bajista");
        Artista sergio = new Artista("Fer", "Guitarrista");

        ArrayList<Artista> integrantesBanda = new ArrayList<Artista>();
        integrantesBanda.add(fer);
        integrantesBanda.add(alex);
        integrantesBanda.add(juan);
        integrantesBanda.add(sergio);

        Banda banda = new Banda(integrantesBanda, "Mana");

        // -----------------Zoe-----------------

        Artista leon = new Artista("Leon", "Vocalista");
        Artista siddhartha = new Artista("Siddhartha", "Baterista");
        Artista sergioA = new Artista("Sergio", "Guitarra lider");
        Artista rodrigo = new Artista("Rodrigo", "Baterista");
        Artista jesus = new Artista("Jesus", "Teclista");
        Artista angel = new Artista("Angel", "Bajo");
        Artista alberto = new Artista("Alberto", "Baterista");

        integrantesBanda.clear();
        integrantesBanda.add(leon);
        integrantesBanda.add(siddhartha);
        integrantesBanda.add(sergioA);
        integrantesBanda.add(rodrigo);
        integrantesBanda.add(jesus);
        integrantesBanda.add(angel);
        integrantesBanda.add(alberto);

        Banda banda2 = new Banda(integrantesBanda, "Zoe");

        // -----------------Caifanes-----------------

        Artista saul = new Artista("Saul", "Vocalista");
        Artista alejandro = new Artista("Alejandro", "Guitarra lider");
        Artista sabo = new Artista("Sabo", "Guitarra acustica");
        Artista alfonso = new Artista("Alfonso", "Baterista");
        Artista diego = new Artista("Diego", "Saxofon");
        Artista yann = new Artista("Yann", "Pianista");
        Artista juanC = new Artista("Juan", "Baterista");
        Artista santiago = new Artista("Santiago", "Guitarra");

        integrantesBanda.clear();
        integrantesBanda.add(saul);
        integrantesBanda.add(alejandro);
        integrantesBanda.add(sabo);
        integrantesBanda.add(alfonso);
        integrantesBanda.add(diego);
        integrantesBanda.add(yann);
        integrantesBanda.add(juanC);
        integrantesBanda.add(santiago);

        Banda banda3 = new Banda(integrantesBanda, "Caifanes");

        // --------------------Layout---------------------

        Layout layout = new Layout();
        layout.darFormato(banda);
        layout.darFormato(banda2);
        layout.darFormato(banda3);


    }

}
