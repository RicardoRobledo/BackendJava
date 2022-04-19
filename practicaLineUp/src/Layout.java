import java.util.ArrayList;

/**
 * This class describe the Layout of each part of the announcement
 *
 * @author: Ricardo
 * */

public class Layout implements Formateador{

    /**
     * This method give us the format to show in out announcement
     *
     * @param banda This is a object of band type
     * @return String
     */
    @Override
    public String darFormato(Banda banda) {
        String formatoSalida = "";
        ArrayList<Artista> integrantes = banda.getIntegrantesBanda();

        formatoSalida+=banda.;

        for (Artista artista: integrantes) {
            formatoSalida+=artista.getNombre()+"\n"+artista.getRol()+"\n";
        }

        return formatoSalida;
    }
}
