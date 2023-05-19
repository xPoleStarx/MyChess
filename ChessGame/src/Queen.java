public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
        symbol = isWhite ? "Q" : "q";
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destX, int destY, Square[][] board) {
        int dx = Math.abs(destX - sourceX);
        int dy = Math.abs(destY - sourceY);
        return dx == 0 || dy == 0 || dx == dy;
    }
}