package core;

import exception.IdNonValidoException;
import exception.OraNonValidaException;
import prog.utili.Orario;

public class SfidaCompetizione extends Sfida {

	private int punteggio;

	/**
	 * @param id
	 * @param descrizione
	 * @param ora
	 * @param partecipante1
	 * @param partecipante2
	 * @param campionato
	 * @param punteggio
	 * @throws OraNonValidaException
	 * @throws IdNonValidoException
	 */
	public SfidaCompetizione(String id, String descrizione, Orario ora, String partecipante1, String partecipante2,
			boolean campionato, int punteggio) throws IdNonValidoException, OraNonValidaException {
		super(id, descrizione, ora, partecipante1, partecipante2, campionato);
		this.punteggio = punteggio;
	}

	public SfidaCompetizione(String descrizione, Orario ora, String partecipante1, String partecipante2,
			boolean campionato, int punteggio) throws IdNonValidoException, OraNonValidaException {
		super('C', descrizione, ora, partecipante1, partecipante2, campionato);
		this.punteggio = punteggio;
	}

	@Override
	public String toString() {
		return super.toString() + "SfidaCompetizione [punteggio=" + punteggio + "]";
	}

	@Override
	public int getPunteggio() {
		return 1000 + punteggio * 500;
	}

}
