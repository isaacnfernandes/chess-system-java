package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	//Classe respons�vel pela posi��o Xadrez
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition: Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	//Retorna uma nova posi��o no Xadrez convertendo da Matriz
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	//Retorna uma nova posi��o na Matriz convertendo do Xadrez
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	//Imprimindo a posi��o
	@Override
	public String toString() {
		//Esse string vazio for�a o compilador a entender a concatena��o de Strings
		return "" + column + row;
	}
}
