public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
        symbol = isWhite ? "P" : "p";
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destX, int destY, Square[][] board) {
        int dx = Math.abs(destX - sourceX);
        int dy = destY - sourceY;

        // Check if the move is valid based on the pawn's color
        if (isWhite) {
            if (dx == 0 && dy == -1) {
                return true; // Regular move
            } else if (dx == 0 && dy == -2 && sourceY == 6) {
                return true; // Double move from the initial position
            } else if (dx == 1 && dy == -1 && board[destY][destX].hasPiece() && !board[destY][destX].getPiece().isWhite()) {
                return true; // Capture diagonally
            }
        } else {
            if (dx == 0 && dy == 1) {
                return true; // Regular move
            } else if (dx == 0 && dy == 2 && sourceY == 1) {
                return true; // Double move from the initial position
            } else if (dx == 1 && dy == 1 && board[destY][destX].hasPiece() && board[destY][destX].getPiece().isWhite()) {
                return true; // Capture diagonally
            }
        }

        return false;
    }
}