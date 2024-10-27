import java.util.ArrayList;
import java.util.List;

// Clase que encapsula el estado y comportamiento del jugador
public class Player {
    private String name;
    private int health;
    private List<GameObject> inventory;

    // Constructor
    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    // Método para recoger objetos
    public void pickUp(GameObject item) {
        inventory.add(item);
        System.out.println("Recogiste un " + item.getClass().getSimpleName());
    }

    // Método para recibir daño
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " recibió " + damage + " puntos de daño. Salud restante: " + health);
    }

    // Método para mostrar el estado actual del jugador
    public void showStatus() {
        System.out.println("Jugador: " + name + ", Salud: " + health);
        System.out.println("Inventario: " + inventory.size() + " objetos.");
    }

    // Getter para la salud
    public int getHealth() {
        return health;
    }
}
