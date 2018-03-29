package core;

import exception.OraNonValidaException;
import prog.utili.Orario;

public class SfidaNormale extends Sfida {

	private String luogoSfida;

	/**
	 * @param id
	 * @param descrizione
	 * @param ora
	 * @param partecipante1
	 * @param partecipante2
	 * @param campionato
	 * @param luogoSfida
	 * @throws OraNonValidaException
	 */
	public SfidaNormale(String id, String descrizione, Orario ora, String partecipante1, String partecipante2,
			boolean campionato, String luogoSfida) throws OraNonValidaException {
		super(id, descrizione, ora, partecipante1, partecipante2, campionato);
		this.luogoSfida = luogoSfida;
	}

	/**
	 * 
	 * @param descrizione
	 * @param ora
	 * @param partecipante1
	 * @param partecipante2
	 * @param campionato
	 * @param luogoSfida
	 * @throws OraNonValidaException
	 */
	public SfidaNormale(String descrizione, Orario ora, String partecipante1, String partecipante2, boolean campionato,
			String luogoSfida) throws OraNonValidaException {
		super('N', descrizione, ora, partecipante1, partecipante2, campionato);
		this.luogoSfida = luogoSfida;
	}

	@Override
	public String toString() {
		return super.toString() + "SfidaNormale [luogoSfida=" + luogoSfida + "]";
	}

	@Override
	public int getPunteggio() {
		return ora.getOre() < 12 ? 200 : 300;
	}

}
