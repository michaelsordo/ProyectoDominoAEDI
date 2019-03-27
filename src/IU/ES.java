package IU;

import java.util.Scanner;

/**
 *
 * @author Rosalia
 */
public class ES {
  private static Scanner leer = new Scanner(System.in);

  public static String pideCadena(String mensaje) {
    System.out.print(mensaje);
    return leer.nextLine();

  }

  public static int pideNumero(String mensaje) {
    System.out.print(mensaje);
    return Integer.parseInt(leer.nextLine());

  }
}
