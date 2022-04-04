import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;  // Note: Do not change this line.

    public static void theStudentsGame() {
        // TODO: Add your code here.
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        scanner = new Scanner(new File(path));
        System.out.print("Dear president, please enter the board’s size.");//change
        //cosinus//
        int board_length = scanner.nextInt();
        int board_height = scanner.nextInt();
        int board[][] = new int[board_height][board_length];
        int numberOfGames = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numberOfGames; i++) {
            System.out.println("Game number " + i + " starts.");
            theStudentsGame();
            System.out.println("Game number " + i + " ended.");
            System.out.println("-----------------------------------------------");
        }
        System.out.println("All games are ended.");
    }

    private
}


