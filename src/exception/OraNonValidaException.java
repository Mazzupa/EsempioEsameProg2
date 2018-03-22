package exception;

import prog.utili.Orario;

public class OraNonValidaException extends Exception {

	private static final long serialVersionUID = 1L;
	Orario ora;

	public OraNonValidaException(String msg, Orario _ora) {
		super(msg);
		ora = _ora;
	}

	public Orario getOra() {
		return ora;
	}
}
