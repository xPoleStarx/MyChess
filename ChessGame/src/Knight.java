public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
        symbol = isWhite ? "N" : "n";
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destX, int destY) {
        int dx = Math.abs(destX - sourceX);
        int dy = Math.abs(destY - sourceY);
        return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
    }
}
