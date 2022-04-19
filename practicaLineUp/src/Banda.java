import java.util.ArrayList;

/**
 * This class describe a band
 *
 * @author: Ricardo
 */

public class Banda {
    
    private String nombreBanda;
    private String imagen;
    private ArrayList<Artista> integrantesBanda;

    /**
     * This constructor give us the members of the band
     *
     * @param integrantesBanda Contains the members of the band
     * @param nombreBanda Contains the name of the band
     */
    public Banda(ArrayList<Artista> integrantesBanda, String nombreBanda, String imagen){
        this.nombreBanda = nombreBanda;
        this.imagen = imagen;
        this.integrantesBanda = integrantesBanda;
    }

    public ArrayList<Artista> getIntegrantesBanda() {
        return integrantesBanda;
    }

    public void setIntegrantesBanda(ArrayList<Artista> integrantesBanda) {
        this.integrantesBanda = integrantesBanda;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Banda{" +
                "nombreBanda='" + nombreBanda + '\'' +
                ", integrantesBanda=" + integrantesBanda +
                '}';
    }
}
