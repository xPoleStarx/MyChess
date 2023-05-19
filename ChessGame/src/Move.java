public class Move {
    private Square sourceSquare;
    private Square destSquare;

    public Move(Square sourceSquare, Square destSquare) {
        this.sourceSquare = sourceSquare;
        this.destSquare = destSquare;
    }

    public Square getSourceSquare() {
        return sourceSquare;
    }

    public Square getDestSquare() {
        return destSquare;
    }
}
