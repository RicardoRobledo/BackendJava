import java.awt.*;

/**
 * This class define the entity to print in our page
 *
 * @author: Ricardo
 */

public class Impresora extends Thread implements ControladorMarco{

    Screen screen;

    public Impresora(){
        screen = new Screen();
        screen.setExtendedState(screen.getExtendedState() | Screen.MAXIMIZED_BOTH);
        screen.out("El remordimiento del musico\n", "Roboto", 40, Color.BLUE);
        screen.setVisible(true);
    }

    /**
     * This method draw the frame in the page
     *
     * @param marco
     */
    @java.lang.Override
    public void dibujar(Marco marco) {

        screen.showImage(marco.getImage());
        screen.out(marco.getText());

    }

    /**
     * This method execute the drawing of the page
     */
    @Override
    public void run() {

    }

}
