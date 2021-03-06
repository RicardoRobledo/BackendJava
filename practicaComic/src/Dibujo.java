import java.awt.*;

/**
 * This class define the entity to print in our page
 *
 * @author: Ricardo
 */

public class Dibujo extends Thread implements ControladorMarco{

    Screen screen;
    Marco marco;

    public Dibujo(Screen screen){
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Marco getMarco() {
        return marco;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    /**
     * This method draw the frame in the page
     */
    @java.lang.Override
    public void dibujar() {

        screen.showImage(marco.getImage());
        screen.out("\n");
        screen.out(marco.getText());
        screen.out("\n");
        screen.out("\n");

    }

    /**
     * This method execute the drawing of the page
     */
    @Override
    public void run() {
        dibujar();
        try {
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
