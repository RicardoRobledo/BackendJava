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
    public void ataquePrincipal() {
        System.out.println("Ataque principal: Golpear muy fuerte");
    }

    @Override
    public String toString() {
        return "Andrew{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
