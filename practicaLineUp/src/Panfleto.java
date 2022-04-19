/**
 * This class describe the announcement
 *
 * @author: Ricardo
 * */

public class Panfleto{

    private String[] contenido;

    public Panfleto(String...contenido){
        this.contenido=contenido;
    }

    public String[] getContenido() {
        return contenido;
    }

    public void setContenido(String[] contenido) {
        this.contenido = contenido;
    }
}
