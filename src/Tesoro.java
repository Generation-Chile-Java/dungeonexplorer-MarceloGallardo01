// Clase que representa un tesoro
public class Tesoro implements GameObject {
    private String tesoro;

    // Constructor
    public Tesoro(String tesoro) {
        this.tesoro = tesoro;
    }

    @Override
    public void interact(Player player) {
        System.out.println("Recogiste un tesoro: " + tesoro);
    }

    @Override
    public String toString() {
        return tesoro;
    }
}
