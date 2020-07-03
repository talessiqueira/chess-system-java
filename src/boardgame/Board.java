package boardgame;

public class Board {
	
	// Um tabuleiro possui linhas e colunas e contém peças sobre ele
	private int rows;
	private int columns;
	private Piece pieces[][];
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece (int row, int column) { // Retorna a posição da peça
		return pieces [row][column];
	}
	
	public Piece piece (Position position) {
		return pieces [position.getRow()][position.getColumn()];
	}
	
	
	
}
