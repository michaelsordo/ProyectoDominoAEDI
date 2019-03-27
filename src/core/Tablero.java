/**
* Representa la mesa de juego, donde los jugadores colocan las fichas en cada turno.
* Estructura: Se utilizará una doble cola (Deque)
* Funcionalidad: insertar la ficha en su lugar correcto automáticamente, visualizar, etc
*/

package core;

import java.util.ArrayList;

public class Tablero {
  private ArrayList<Ficha> fichas;

  public Tablero(ArrayList<Ficha> fichas) {
    this.fichas = fichas;
  }

  public ArrayList<Ficha> getFichas() {
    return fichas;
  }

  public void setFichas(ArrayList<Ficha> fichas) {
    this.fichas = fichas;
  }
}
