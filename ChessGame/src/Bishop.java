public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
        symbol = isWhite ? "B" : "b";
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destX, int destY, Square[][] board) {
        int dx = Math.abs(destX - sourceX);
        int dy = Math.abs(destY - sourceY);
        return dx == dy;
    }
}