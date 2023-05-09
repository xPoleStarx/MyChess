public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
        symbol = isWhite ? "P" : "p";
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destX, int destY) {
        int dx = Math.abs(destX - sourceX);
        int dy = destY - sourceY;

        // Check if the move is valid based on the pawn's color
        if (isWhite) {
            if (dx == 0 && dy == -1) {
                return true; // Regular move
            } else if (dx == 0 && dy == -2 && sourceY == 1) {
                return true; // Initial double move
            } else if (dx == 1 && dy == -1) {
                return true; // Capture move
            }
        } else {
            if (dx == 0 && dy == 1) {
                return true; // Regular move
            } else if (dx == 0 && dy == 2 && sourceY == 6) {
                return true; // Initial double move
            } else if (dx == 1 && dy == 1) {
                return true; // Capture move
            }
        }

        return false; // Invalid move
    }
}
