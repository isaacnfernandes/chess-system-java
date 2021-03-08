package chess;

public class ChessException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	//Construtor da classe que recebe/repassa a msg para a super classe RunTimeException
	public  ChessException(String msg) {
		super(msg);
	}
}
