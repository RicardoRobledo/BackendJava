/**
 * This class define the base entity Gwen
 *
 * @author: Ricardo
 * */

public class Gwen extends Spiderman implements Ataque{

    private String nombre = "Gwen";

    /**
     * Constructor for the genre of the character
     *
     * @param genero
     * @param: genero Tell us the genre of the character
     */
    public Gwen(char genero) {
        super(genero);
    }

    /**
     * Method that tell us the main attack of the character
     */
    @Override
    public String ataquePrincipal() {
        return "Ataque principal: Patear muy fuerte";
    }

    @Override
    public String toString() {
        return "Gwen{" +
                "nombre='" + nombre + '\'' +
                "genero='" + this.getGenero() + '\'' +
                "ataque principal='" + ataquePrincipal() + ", " +
                '}';
    }
}
