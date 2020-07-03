package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		// A partida de xadrez � quem deve saber que o xadrez � de 8 x 8
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); // Para interpretar como uma pe�a de xadrez e n�o uma pe�a comum
			}
		}
		return mat;		
	}
	
}
