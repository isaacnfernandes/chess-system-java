package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{
	
	//Classe respons�vel por criar a pe�a Rook
	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	//Metodo para imprimir a pe�a Rook no tabuleiro
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; 
		return mat;
	}
}
