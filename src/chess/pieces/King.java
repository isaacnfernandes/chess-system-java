package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	//Classe repons�vel por criar a pe�a King
	public King(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	//Metodo para imprimir a pe�a Rook no tabuleiro
	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; 
		return mat;
	}

}
