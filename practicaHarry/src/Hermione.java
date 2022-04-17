package src;

public class Hermione {

    private String casa;
    private String nombre;
    private char genero;
    private String boggart;
    private String patronus;

    public Hermione() {
        this.casa = "Gryffindor";
        this.nombre = "Hermione";
        this.genero = 'F';
        this.boggart = "Mcgonagall diciendole que reprobo todo";
        this.patronus = "Nutria";
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    @Override
    public String toString() {
        return "Hermione{" +
                "casa='" + casa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", boggart='" + boggart + '\'' +
                ", patronus='" + patronus + '\'' +
                '}';
    }

}
