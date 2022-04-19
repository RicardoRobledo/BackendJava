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
        screen.out("Concierto 'Amantes del rock!!!!'\n\n", "Roboto", 40, Color.BLUE);
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

        String layoutADibujar;

        if(orden==1){
            layoutADibujar = panfleto.getContenido()[0];
        }else if(orden==2){
            layoutADibujar = panfleto.getContenido()[1];
        }else{
            layoutADibujar = panfleto.getContenido()[2];
        }

        layoutADibujar+="\n\n";
        screen.out(layoutADibujar);

    }

    @Override
    public void run(){
        dibujar();
    }
}
