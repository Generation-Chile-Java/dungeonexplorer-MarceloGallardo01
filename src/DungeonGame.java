import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialización del jugador
        System.out.println("Introduce tu nombre: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName, 100);

        // Inicialización de las salas
        Room[] dungeon = new Room[] {
                new EmptyRoom(),
                new TreasureRoom(new Tesoro("Espada Antigua")),
                new EnemyRoom(20),
                new EmptyRoom(),
                new TreasureRoom(new Tesoro("Escudo Mágico")),
                new EnemyRoom(30)
        };

        // Juego principal
        for (Room room : dungeon) {
            if (player.getHealth() <= 0) {
                System.out.println("Has perdido todos tus puntos de vida. ¡Juego terminado!");
                break;
            }

            // El jugador entra en una sala
            room.enter(player);
            player.showStatus();

            // Preguntar al jugador si quiere continuar
            System.out.println("¿Quieres continuar explorando? (sí/no): ");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("no")) {
                System.out.println("Has decidido abandonar la mazmorra.");
                break;
            }
        }

        if (player.getHealth() > 0) {
            System.out.println("Has explorado todas las salas. ¡Felicidades!");
        }

        scanner.close();
    }
}
