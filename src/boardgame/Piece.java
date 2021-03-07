package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//Classe respons�vel pela cria��o da pe�a, inicialmente nula
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
