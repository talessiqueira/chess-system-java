package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		// A partida de xadrez é quem deve saber que o xadrez é de 8 x 8
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); // Para interpretar como uma peça de xadrez e não uma peça comum
			}
		}
		return mat;		
	}
	
}
