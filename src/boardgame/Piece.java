package boardgame;

public class Piece {
	// Uma peça contém posição e está em um  tabuleiro
	
	protected Position position; // Não quer que ela seja visível na camada de xadrez
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // Somente classes do mesmo pacote e subclasses acessam o tabuleiro de uma peça
		return board;
	} 
	
	
	
	
}
