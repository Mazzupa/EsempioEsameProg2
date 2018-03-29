package core;

import exception.OraNonValidaException;
import prog.utili.Orario;

public class SfidaPacifica extends Sfida {

	/**
	 * 
	 * @param id
	 * @param descrizione
	 * @param ora
	 * @param partecipante1
	 * @param partecipante2
	 * @param campionato
	 * @throws OraNonValidaException
	 */
	public SfidaPacifica(String id, String descrizione, Orario ora, String partecipante1, String partecipante2,
			boolean campionato) throws OraNonValidaException {

		super(id, descrizione, ora, partecipante1, partecipante2, campionato);
	}

	/**
	 * 
	 * @param descrizione
	 * @param ora
	 * @param partecipante1
	 * @param partecipante2
	 * @param campionato
	 * @throws OraNonValidaException
	 */
	public SfidaPacifica(String descrizione, Orario ora, String partecipante1, String partecipante2, boolean campionato)
			throws OraNonValidaException {
		super('P', descrizione, ora, partecipante1, partecipante2, campionato);
	}

	@Override
	public int getPunteggio() {
		return this.campionato ? 100 : 10;
	}

}
