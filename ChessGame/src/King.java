public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
        symbol = isWhite ? "K" : "k";
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destX, int destY, Square[][] board) {
        int dx = Math.abs(destX - sourceX);
        int dy = Math.abs(destY - sourceY);
        return dx <= 1 && dy <= 1;
    }
}