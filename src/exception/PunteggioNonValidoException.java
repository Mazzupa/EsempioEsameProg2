package exception;

public class PunteggioNonValidoException extends Exception {

	private static final long serialVersionUID = 1L;
	private int punteggio;

	public PunteggioNonValidoException(String msg, int _punteggio) {
		super(msg);
		punteggio = _punteggio;
	}

	public int getPunteggio() {
		return punteggio;
	}

}
