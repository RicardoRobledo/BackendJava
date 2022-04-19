/**
 * This class define a person
 *
 * @author: Ricardo
 */

public class Persona {

    private String nombre;

    /**
     * This constructor give us the name of the person
     *
     * @param nombre
     */
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
