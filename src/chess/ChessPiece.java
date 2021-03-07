package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	//Esta classe é uma subClasse da classe Piece
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
