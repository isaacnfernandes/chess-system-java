package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Classe respons�vel pela cria��o do tabuleiro
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
	//retorna a matriz Piece na row e column em quest�o
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	//Sobrecarga do m�todo piece que retorna a pe�a pela position
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
