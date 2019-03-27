/**
 * Representa a un jugador de la partida, identificado por el nombre, las fichas de la mano, 
 * puntos en la partida y puntos acumulados 
 * Funcionalidad: recibe 7 fichas, de entre las fichas posibles a colocar selecciona una,
 * roba ficha del montón, consultar/modificar puntos, etc
 */

package core;

import java.util.ArrayList;

/**
 *
 * @author AEDI
 */
public class Jugador {
  private String nombre;
  private ArrayList<Ficha> fichas;
  private int puntosPartida;
  private int puntosAcumulados;

  public Jugador(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString(){
    return "Jugador[nombre=" + nombre + "]";
  }
}
