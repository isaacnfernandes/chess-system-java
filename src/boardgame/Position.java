package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	//Esta classe representa uma posição no tabuleiro
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	//Override do método toString para imprimir linha + coluna
	@Override
	public String toString() {
		return row + ", " + column;
	}

}
