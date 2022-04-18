/**
 * This class define the base entity Miles
 *
 * @author: Ricardo
 * */


public class Miles extends Spiderman implements Ataque{

    private String nombre = "Miles";

    /**
     * Constructor for the genre of the character
     *
     * @param genero
     * @param: genero Tell us the genre of the character
     */
    public Miles(char genero) {
        super(genero);
    }

    /**
     * Method that tell us the main attack of the character
     */
    @Override
    public String ataquePrincipal() {
        return "Ataque principal: Lanzar red gigantesca de telarania";
    }

    @Override
    public String toString() {
        return "Miles{" +
                "nombre='" + nombre + '\'' +
                "genero='" + this.getGenero() + '\'' +
                '}';
    }
}
