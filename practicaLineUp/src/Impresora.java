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
        screen.out("Concierto 'Amantes del rock!!!!'\n\n", "Roboto", 40, Color.green);
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

        String layoutADibujar, imagen, fecha;

        if(orden==1){
            layoutADibujar = panfleto.getContenido()[0];
            imagen = panfleto.getImagenes()[0];
            fecha = "Martes 10 de diciembre\n";
        }else if(orden==2){
            layoutADibujar = panfleto.getContenido()[1];
            imagen = panfleto.getImagenes()[1];
            fecha = "Miercoles 11 de diciembre\n";
        }else{
            layoutADibujar = panfleto.getContenido()[2];
            imagen = panfleto.getImagenes()[2];
            fecha = "Jueves 12 de diciembre\n";
        }

        layoutADibujar+="\n";
        screen.out(fecha,"Roboto", 20, Color.BLACK);
        screen.out(layoutADibujar, "Roboto", 20, Color.blue);
        screen.showImage(imagen);
        screen.out("\n\n");

    }

    @Override
    public void run(){
        dibujar();
    }
}
