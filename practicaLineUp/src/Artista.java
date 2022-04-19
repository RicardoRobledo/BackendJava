/**
 * This class define an artist
 *
 * @author: Ricardo
 */

public class Artista extends Persona{

    private String rol;

    /**
     * This constructor give the role of the artist
     *
     * @param nombre Define the name of the artist
     * @param rol Define the role of the artist
     */
    public Artista(String nombre, String rol){
        super(nombre);
        this.rol = rol;
    }

}
