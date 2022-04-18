import java.awt.*;

/**
 * This class is for our tests
 *
 * @author: Ricardo
 */

public class Prueba {

    public static void main(String[] args) {

        Screen screen = new Screen();
        screen.setSize(800, 500);
        screen.setExtendedState(screen.getExtendedState() | Screen.MAXIMIZED_BOTH);
        Dialog dialog = new Dialog();
        String str;

        screen.out("El remordimiento del musico\n", "Roboto", 40, Color.BLUE);
        screen.setVisible(true);

        screen.showImage("1.jpg");

    }

}
