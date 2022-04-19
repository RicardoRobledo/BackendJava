import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

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

        ArrayList<Artista> integrantesBanda2 = new ArrayList<Artista>();
        integrantesBanda2.add(leon);
        integrantesBanda2.add(siddhartha);
        integrantesBanda2.add(sergioA);
        integrantesBanda2.add(rodrigo);
        integrantesBanda2.add(jesus);
        integrantesBanda2.add(angel);
        integrantesBanda2.add(alberto);

        Banda banda2 = new Banda(integrantesBanda2, "Zoe");

        // -----------------Caifanes-----------------

        Artista saul = new Artista("Saul", "Vocalista");
        Artista alejandro = new Artista("Alejandro", "Guitarra lider");
        Artista sabo = new Artista("Sabo", "Guitarra acustica");
        Artista alfonso = new Artista("Alfonso", "Baterista");
        Artista diego = new Artista("Diego", "Saxofon");
        Artista yann = new Artista("Yann", "Pianista");
        Artista juanC = new Artista("Juan", "Baterista");
        Artista santiago = new Artista("Santiago", "Guitarra");

        ArrayList<Artista> integrantesBanda3 = new ArrayList<Artista>();
        integrantesBanda3.add(saul);
        integrantesBanda3.add(alejandro);
        integrantesBanda3.add(sabo);
        integrantesBanda3.add(alfonso);
        integrantesBanda3.add(diego);
        integrantesBanda3.add(yann);
        integrantesBanda3.add(juanC);
        integrantesBanda3.add(santiago);

        Banda banda3 = new Banda(integrantesBanda3, "Caifanes");

        // --------------------Layout---------------------

        Layout layout = new Layout();

        // --------------------Panfleto---------------------

        Panfleto panfleto = new Panfleto(layout.darFormato(banda),
                layout.darFormato(banda2),
                layout.darFormato(banda3));

        // --------------------Impresora---------------------

        Impresora impresora = new Impresora(new Screen());
        impresora.setPanfleto(panfleto);

        ExecutorService executorService = Executors.newCachedThreadPool();

        try{

            prepararArea(executorService, impresora, (byte)1);
            prepararArea(executorService, impresora, (byte)2);
            prepararArea(executorService, impresora, (byte)3);


        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void prepararArea(ExecutorService executorService, Impresora impresora, byte opcion) throws InterruptedException {

        impresora.setOrden(opcion);
        executorService.execute(impresora);
        sleep(1000);

    }

}
