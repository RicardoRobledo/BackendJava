/**
 * This class define the base entity Andrew
 *
 * @author: Ricardo
 * */


public class Andrew extends Spiderman implements Ataque{

    private String nombre = "Gwen";

    /**
     * Constructor for the genre of the character
     *
     * @param genero
     * @param: genero Tell us the genre of the character
     */
    public Andrew(char genero) {
        super(genero);
    }

    /**
     * Method that tell us the main attack of the character
     */
    @Override
    public String ataquePrincipal() {
        return "Golpear muy fuerte";
    }

    @Override
    public String toString() {
        return "Andrew{" +
                "nombre='" + nombre + "', " +
                "genero='" + this.getGenero() + "', " +
                "ataque principal='" + ataquePrincipal() + "', " +
                '}';
    }
}
