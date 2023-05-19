public abstract class Piece {
    protected String symbol;
    protected boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract boolean isValidMove(int sourceX, int sourceY, int destX, int destY, Square[][] board);
}
