package boardgame;

public class BoardException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	//Construtor da classe que recebe/repassa a msg para a super classe RunTimeException
	public BoardException(String msg) {
		super(msg);
	}

}
