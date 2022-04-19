/**
 * This class describe the printer that will draw the announcement
 *
 * @author: Ricardo
 * */

public class Impresora extends Thread implements controladorImpresora{

    private Screen screen;
    private Panfleto panfleto;

    public Impresora(Screen screen){
        this.screen = screen;
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

    }

    @Override
    public void run(){
        dibujar();
    }
}
