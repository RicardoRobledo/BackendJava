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
    public void ataquePrincipal() {
        System.out.println("Ataque principal: Patear muy fuerte");
    }
}
