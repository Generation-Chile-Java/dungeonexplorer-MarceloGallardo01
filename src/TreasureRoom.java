// Clase que representa una sala con un tesoro
public class TreasureRoom implements Room {
    private GameObject tesoro;

    // Constructor
    public TreasureRoom(GameObject tesoro) {
        this.tesoro = tesoro;
    }

    @Override
    public void enter(Player player) {
        System.out.println("Entraste en una sala con un tesoro.");
        player.pickUp(tesoro);
    }
}