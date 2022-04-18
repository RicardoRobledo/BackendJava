/**
 * This class is for our tests
 *
 * @author: Ricardo
 */

public class Prueba {

    public static void main(String[] args) {

        Screen screen = new Screen();
        Dialog dialog = new Dialog();
        String str;

        screen.out("Bienvenidos a la mision Backend Java");
        screen.setVisible(true);

        str = dialog.readString("¿Quieres aprender a hacer esto?");

        if(str.charAt(0)=='S'||str.charAt(0)=='s'){
            screen.out("Hola");
        }else{

        }

    }

}
