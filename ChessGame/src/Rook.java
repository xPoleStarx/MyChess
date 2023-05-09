public class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
        symbol = isWhite ? "R" : "r";
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destX, int destY) {
        return sourceX == destX || sourceY == destY;
    }
}
