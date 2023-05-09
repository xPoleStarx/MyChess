public class Chessboard {
    private Square[][] board;
    private boolean whiteTurn;
    private boolean gameEnd;

    public Chessboard() {
        board = new Square[8][8];
        whiteTurn = true;
        gameEnd = false;

        initializeBoard();
    }

    private void initializeBoard() {
        // Initialize squares
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = new Square(row, col);
            }
        }

        // Initialize pieces
        board[0][0].setPiece(new Rook(false));
        board[0][1].setPiece(new Knight(false));
        board[0][2].setPiece(new Bishop(false));
        board[0][3].setPiece(new Queen(false));
        board[0][4].setPiece(new King(false));
        board[0][5].setPiece(new Bishop(false));
        board[0][6].setPiece(new Knight(false));
        board[0][7].setPiece(new Rook(false));
        for (int col = 0; col < 8; col++) {
            board[1][col].setPiece(new Pawn(false));
        }

        board[7][0].setPiece(new Rook(true));
        board[7][1].setPiece(new Knight(true));
        board[7][2].setPiece(new Bishop(true));
        board[7][3].setPiece(new Queen(true));
        board[7][4].setPiece(new King(true));
        board[7][5].setPiece(new Bishop(true));
        board[7][6].setPiece(new Knight(true));
        board[7][7].setPiece(new Rook(true));
        for (int col = 0; col < 8; col++) {
            board[6][col].setPiece(new Pawn(true));
        }
    }

    public boolean movePiece(String source, String destination) {
        int sourceX = source.charAt(0) - 'a';
        int sourceY = Character.getNumericValue(source.charAt(1)) - 1;
        int destX = destination.charAt(0) - 'a';
        int destY = Character.getNumericValue(destination.charAt(1)) - 1;

        Square sourceSquare = board[sourceY][sourceX];
        Square destSquare = board[destY][destX];

        // Check if the source square has a piece and it is the correct color's turn
        if (sourceSquare.hasPiece() && sourceSquare.getPiece().isWhite() == whiteTurn) {
            Piece piece = sourceSquare.getPiece();

            // Check if the move is valid for the selected piece
            if (piece.isValidMove(sourceX, sourceY, destX, destY)) {
                // Check if the destination square is empty or has an opponent's piece
                if (!destSquare.hasPiece() || destSquare.getPiece().isWhite() != whiteTurn) {
                    destSquare.setPiece(piece);
                    sourceSquare.setPiece(null);
                    whiteTurn = !whiteTurn; // Switch turn
                    checkGameEnd(); // Check if game is over

                    return true;
                }
            }
        }

        return false; // Invalid move
    }

    private void checkGameEnd() {
        // Check if one color has no pieces left
        boolean whitePiecesRemaining = false;
        boolean blackPiecesRemaining = false;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Square square = board[row][col];
                if (square.hasPiece()) {
                    if (square.getPiece().isWhite()) {
                        whitePiecesRemaining = true;
                    } else {
                        blackPiecesRemaining = true;
                    }
                }
            }
        }

        gameEnd = !(whitePiecesRemaining && blackPiecesRemaining);
    }

    public boolean isWhiteTurn() {
        return whiteTurn;
    }

    public boolean isGameEnd() {
        return gameEnd;
    }

    public void drawBoard() {
        System.out.println("   A   B   C   D   E   F   G   H");
        System.out.println("  ______________________________");

        for (int row = 7; row >= 0; row--) {
            System.out.print(row + 1 + "|");
            for (int col = 0; col < 8; col++) {
                Square square = board[row][col];
                if (square.hasPiece()) {
                    System.out.print(" " + square.getPiece().getSymbol() + " |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println();
            System.out.println("  ______________________________");
        }
    }
}
