/**
 * Representa el juego del dominó, con sus reglas. 
 * Se recomienda una implementación modular.
 */


package IU;

import static IU.ES.pideCadena;
import static IU.ES.pideNumero;

import core.Jugador;

/**
 *
 * @author AEDI
 */
public class Domino {
  private static int numeroJugadores;
  private static Jugador[] jugadores;

  public static void inicioPartida() {
    numeroJugadores = 0;
    do {
      numeroJugadores = pideNumero("Introduzca el número de jugadores, por favor: ");
      if (numeroJugadores <= 1) {
        System.out.println("Para jugar una partida debe de haber más de un jugador.");
      }
    } while (numeroJugadores <= 1);
    for (int i = 0; i < numeroJugadores; i++) {
      jugadores[i] = new Jugador(pideCadena("Introduzca el nombre de un jugador, por favor: "));
    }
    System.out.println(jugadores);
  }

}
