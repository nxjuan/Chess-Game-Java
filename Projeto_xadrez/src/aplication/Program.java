package aplication;

import chess.ChessMatch;
import boardGame.Piece;
import boardGame.Position;

public class Program {

	public static void main(String[] args) {		
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
			
	}
}
