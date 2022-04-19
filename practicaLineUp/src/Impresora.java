import java.awt.*;

/**
 * This class describe the printer that will draw the announcement
 *
 * @author: Ricardo
 * */

public class Impresora extends Thread implements ControladorImpresora {

    private Screen screen;
    private Panfleto panfleto;
    private byte orden=0;

    public Impresora(Screen screen){
        this.screen = screen;
        screen.setExtendedState(screen.getExtendedState() | Screen.MAXIMIZED_BOTH);
        screen.out("Concierto 'Amantes del rock!!!!'", "Roboto", 40, Color.BLUE);
        screen.setVisible(true);
    }

    public void setOrden(byte orden) {
        this.orden = orden;
    }

    public Panfleto getPanfleto() {
        return panfleto;
    }

    public void setPanfleto(Panfleto panfleto) {
        this.panfleto = panfleto;
    }

    /**
     * This method will draw our announcement
     *
     * @author: Ricardo
     */
    @Override
    public void dibujar() {
        screen.out("Hola");
    }

    @Override
    public void run(){
        dibujar();
    }
}
