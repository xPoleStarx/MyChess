Chess Game ♟️

📝 ChessGame is a command-line chess program written in Java that allows you to play a simplified version of chess. The program includes various classes to represent the chessboard, pieces, and game logic.
🎮 How to Play

    🏃 Run the program in your command-line interface.
    📋 The initial chessboard will be displayed, showing the positions of the pieces.
    🔄 The program will indicate whose turn it is (White or Black).
    🎯 Enter the location of the piece you want to move, following the real-life chessboard coordinates (e.g., A1, E5).
    🏁 Enter the new location where you want to move the piece.
    ♟️ The program will validate the move and update the chessboard accordingly.
    🔄 The turn will switch to the other player, and the process repeats.
    ⚠️ If an invalid move is entered, an error message will be displayed, and you can retry the move.

♜ Features

    ♟️ End game control: The game will end when no pieces remain for one color.
    ♛ Promote: Pawns will be automatically promoted to Queens when they reach the last row.
    ♞ Basic movement rules for all pieces: The game allows legal moves for each piece type (excluding complex rules like checkmate, en passant, and absolute pin).

🖥️ Board Representation

The chessboard is represented in the command-line interface as a grid of squares. Each square can contain a piece, represented by specific symbols:

    ♙ P for White Pawn
    ♜ R for White Rook
    ♞ N for White Knight
    ♝ B for White Bishop
    ♛ Q for White Queen
    ♚ K for White King

For Black pieces, the symbols are represented in lowercase.

Example Execution
🔴 It's White's turn.
🔄 Enter the location of the piece: e2
🔄 Enter the new location of the piece: e4

   A    B    C    D    E    F    G    H
   ______________________________________
8| ♜ | ♞ | ♝ | ♛ | ♚ | ♝ | ♞ | ♜  |
   ______________________________________
7| ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟  |
   ______________________________________
6|    |    |    |    |    |    |    |    |
   ______________________________________
5|    |    |    |    | ♙ |    |    |    |
   ______________________________________
4|    |    |    |    | ♟ |    |    |    |
   ______________________________________
3|    |    |    |    |    |    |    |    |
   ______________________________________
2| ♙ | ♙ | ♙ | ♙ |    | ♙ | ♙ | ♙ |
   ______________________________________
1| ♖ | ♘ | ♗ | ♕ | ♔ | ♗ | ♘ | ♖ |
   ______________________________________
    A    B    C    D    E    F    G    H
    
    In this example, White moves their pawn from e2 to e4.

⚠️ Please note that the provided example execution is simplified, and you are responsible for
implementing the missing classes and game logic based on the provided requirements.
