// Clase que representa una sala con un enemigo
public class EnemyRoom implements Room {
    private int enemyDamage;

    // Constructor
    public EnemyRoom(int damage) {
        this.enemyDamage = damage;
    }

    @Override
    public void enter(Player player) {
        System.out.println("Entraste en una sala con un enemigo. ¡Te atacan!");
        player.takeDamage(enemyDamage);
    }
}