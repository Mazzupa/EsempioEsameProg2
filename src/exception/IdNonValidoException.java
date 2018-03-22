package exception;

public class IdNonValidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;

	public IdNonValidoException(String msg) {
		super(msg);
	}

	public String getId() {
		return id;
	}
}
