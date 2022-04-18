import java.awt.*;

/**
 * This class is for our tests
 *
 * @author: Ricardo
 */

public class Prueba extends Thread{

    public static void main(String[] args) throws InterruptedException {

        Screen screen = new Screen();
        screen.setExtendedState(screen.getExtendedState() | Screen.MAXIMIZED_BOTH);
        screen.out("El remordimiento del guitarrista\n", "Roboto", 40, Color.BLUE);
        screen.setVisible(true);

        Dibujo dibujos[] = {new Dibujo(screen), new Dibujo(screen), new Dibujo(screen),new Dibujo(screen),
                new Dibujo(screen), new Dibujo(screen), new Dibujo(screen), new Dibujo(screen)};
        Marco marcos[] = {new Marco("Esta es la historia de un hombre que de la cual con sus canciones y manos era " +
                "un buen musico, pero sin embargo, jamas podia alcanzar a la mujer que lo influenciaba a que sus " +
                "canciones fueran tan bellas", "1.jpg"),

                new Marco("Un hombre estaba aprendiendo a tocar la guitarra aunque nunca tuvo un toque demasiado " +
                        "bueno para que sus canciones fueran interesantes le gustaba mucho tocar su instrumento, sin " +
                        "embargo no era motivacion suficiente para seguir tocando su instrumento, sentia que debia de " +
                        "dejar de tocar\n", "2.jpg"),

                new Marco("El hombre un dia se enamoro de una chica muy bella. La chica solo se cruzo con el hombre " +
                        "una vez y aunque hablaron poco y le sonrio de manera suave, el guitarrista se enamoraro de la " +
                        "gran belleza de la mujer\n", "3.jpg"),

                new Marco("Por la tarde de ese mismo dia el guitarrista puso su mente en aquella chica y decidio tomar " +
                        "su instrumento una vez mas y tocar nuevamente, entre mas tocaba y mas pensaba en la chica su " +
                        "guitarra sonaba mejor, las notas parecian encajar en cada acorde que tocaba y entre mas tocaba " +
                        "mas se enamoraba de la chica\n", "4.jpg"),

                new Marco("El guitarrista toco durante todo el dia hasta que su mano izquierda dejo de responderle " +
                        "y de presionar las cuerdas, en ese momento el guitarrista no dejaba de pensar en la mujer\n", "5.jpg"),

                new Marco("Pasaban los dias y el guitarrista no se acercaba a hablarle de manera adecuada, no podia " +
                        "comer y lo invadia la tristeza\n", "6.jpg"),

                new Marco("Asi que decidio descargar todo su amor en algo que pudiera gustarle y poder sentirse mas " +
                        "cercano a ella. El guitarrista decidio escribirle una cancion aunque este ultimo no sabia nada " +
                        "de composicion musical\n", "7.jpg"),

                new Marco("Cuando por fin logro escribirle una cancion de amor, este ultimo no se atrevio a acercarse " +
                        "a la mujer que amaba, decidio esperar al dia en que se volviera una persona mejor y pudiera " +
                        "presentarse de la manera adecuada, pues sentia que aun le faltaba madurar, asi espero el " +
                        "guitarrista hasta el dia en que pudiera tocar la cancion que escribio para la mujer que amaba...\n", "8.jpg")};

        int cont=0;
        for (Dibujo d: dibujos) {
            d.setMarco(marcos[cont]);
            d.start();
            cont++;
            sleep(15000);
        }

    }

}
