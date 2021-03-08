package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	//Classe responsável pela posição Xadrez
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

	//Retorna uma nova posição no Xadrez convertendo da Matriz
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	//Retorna uma nova posição na Matriz convertendo do Xadrez
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	//Imprimindo a posição
	@Override
	public String toString() {
		//Esse string vazio força o compilador a entender a concatenação de Strings
		return "" + column + row;
	}
}
