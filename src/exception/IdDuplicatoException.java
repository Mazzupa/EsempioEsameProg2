package exception;

public class IdDuplicatoException extends Exception {

	private static final long serialVersionUID = 1L;
	private String id;

	/**
	 * 
	 * @param msg
	 * @param _id
	 */
	public IdDuplicatoException(String msg, String _id) {
		super(msg);
		id = _id;
	}

	public String getIdDupplicato() {
		return id;
	}

}
