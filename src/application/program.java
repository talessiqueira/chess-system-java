package application;

import chess.ChessMatch;

public class program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		//Position pos = new Position(3, 5);
		//System.out.println(pos);

	}

}
