/**
 * This class describe the announcement
 *
 * @author: Ricardo
 * */

public class Panfleto{

    private String[] contenido;
    private String[] imagenes;

    public Panfleto(String []contenido, String []imagenes){
        this.contenido=contenido;
        this.imagenes=imagenes;
    }

    public String[] getContenido() {
        return contenido;
    }

    public void setContenido(String[] contenido) {
        this.contenido = contenido;
    }

    public String[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(String[] imagenes) {
        this.imagenes = imagenes;
    }
}
