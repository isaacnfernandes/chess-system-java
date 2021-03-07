package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//Classe responsável pela criação da peça, inicialmente nula
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
