package chess;

import boardgame.BoardException;

public class ChessException extends BoardException{
	private static final long serialVersionUID = 1L;
	
	//Construtor da classe que recebe/repassa a msg para a super classe RunTimeException
	public  ChessException(String msg) {
		super(msg);
	}
}
