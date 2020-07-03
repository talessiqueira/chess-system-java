package boardgame;

public class Piece {
	
	protected Position position; // N�o quer que ela seja vis�vel na camada de xadrez
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // Somente classes do mesmo pacote e subclasses acessam o tabuleiro de uma pe�a
		return board;
	} 
	
	
	
	
}
