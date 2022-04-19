/**
 * This class describe the printer that will draw the announcement
 *
 * @author: Ricardo
 * */

public class Impresora extends Thread implements controladorImpresora{

    private Panfleto panfleto;

    public Panfleto getPanfleto() {
        return panfleto;
    }

    public void setPanfleto(Panfleto panfleto) {
        this.panfleto = panfleto;
    }

    /**
     * This methow will draw our announcement
     *
     * @author: Ricardo
     */
    @Override
    public void dibujar() {

    }

    @Override
    public void run(){
        
    }
}
