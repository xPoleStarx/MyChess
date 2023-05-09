import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        Scanner scanner = new Scanner(System.in);

        while (!chessboard.isGameEnd()) {
            chessboard.drawBoard();
            System.out.println("It is " + (chessboard.isWhiteTurn() ? "White" : "Black") + "'s turn.");
            System.out.print("Enter the location of the piece: ");
            String source = scanner.nextLine();
            System.out.print("Enter the new location of the piece: ");
            String destination = scanner.nextLine();

            boolean moveSuccessful = chessboard.movePiece(source, destination);
            if (!moveSuccessful) {
                System.out.println("Invalid move. Please try again.");
            }
        }

        chessboard.drawBoard();
        System.out.println("Game over.");
    }
}
