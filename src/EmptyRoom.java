// Clase que representa una sala vacía
public class EmptyRoom implements Room {
    @Override
    public void enter(Player player) {
        System.out.println("Entraste en la sala solita, acompaña a la sala en su soledad");
    }
}