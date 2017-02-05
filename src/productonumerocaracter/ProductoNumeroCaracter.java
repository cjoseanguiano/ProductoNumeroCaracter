/*
10. Leer una secuencia de números y mostrar su producto, el proceso finalizará 
cuando el usuario pulse a la tecla F.
 */
package productonumerocaracter;

import static javafx.scene.input.KeyCode.F;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class ProductoNumeroCaracter {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int num_uno;
        int resultado = 1;
        char efe = 'F';
        try {
            do {
                num_uno = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));

                if (num_uno == efe) {
                    throw new NumberFormatException("Se ha detectado el caracter 'F'");
                }

                resultado = resultado * num_uno;
                System.out.println("Valor :" + resultado);

            } while (num_uno != efe);

        } catch (NumberFormatException e) {
            System.out.println("Error " + e);
        }
    }
}
