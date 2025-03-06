import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PlayerQueue queue = new PlayerQueue(20);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int gameCount = 0;
        int playerId = 1;

        while (gameCount < 10) {
            int newPlayers = random.nextInt(7) + 1; // 1 to 7 new players per turn
            System.out.println("New turn! Adding " + newPlayers + " players to the queue.");

            for (int i = 0; i < newPlayers; i++) {
                queue.enqueue(new Player(playerId, "Player" + playerId, random.nextInt(100) + 1));
                playerId++;
            }

            queue.printQueue();
            System.out.println();

            if (queue.size() >= 5) {
                System.out.println("Starting a new game with 5 players!");
                for (int i = 0; i < 5; i++) {
                    System.out.println(" - " + queue.dequeue());
                }
                gameCount++;
                System.out.println("Games played: " + gameCount + "/10");
            }

            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        }

        System.out.println("10 games completed. Program terminating.");
        scanner.close();
    }
}
