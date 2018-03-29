/**
 * @author Mazzucchetti Patrick
 */

package core;

import exception.OraNonValidaException;
import prog.utili.Orario;

public abstract class Sfida {

	private static int numSfide = 0;
	private String id;
	private String descrizione;
	protected Orario ora;
	private String partecipante1;
	private String partecipante2;
	protected boolean campionato;

	/**
	 * @param descrizione
	 * @param ora
	 * @param partecipante1
	 * @param partecipante2
	 * @param campionato
	 */
	public Sfida(String id, String descrizione, Orario ora, String partecipante1, String partecipante2,
			boolean campionato) throws OraNonValidaException {

		this.id = id;
		this.descrizione = descrizione;
		if (ora.getOre() < 7 || ora.getOre() > 24)
			throw new OraNonValidaException("Ora inserita non valida", ora);
		this.ora = ora;
		this.partecipante1 = partecipante1;
		this.partecipante2 = partecipante2;
		this.campionato = campionato;
		numSfide++;
	}

	/**
	 * 
	 * @param c
	 * @param descrizione
	 * @param ora
	 * @param partecipante1
	 * @param partecipante2
	 * @param campionato
	 * @throws OraNonValidaException
	 */
	public Sfida(char c, String descrizione, Orario ora, String partecipante1, String partecipante2, boolean campionato)
			throws OraNonValidaException {
		this(c + "" + Integer.toString(numSfide), descrizione, ora, partecipante1, partecipante2, campionato);
	}

	public String getId() {
		return id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Orario getOra() {
		return ora;
	}

	public String getPartecipante1() {
		return partecipante1;
	}

	public String getPartecipante2() {
		return partecipante2;
	}

	public boolean isCampionato() {
		return campionato;
	}

	public abstract int getPunteggio();

	@Override
	public String toString() {
		return "Sfida [id " + id + " descrizione=" + descrizione + ", ora=" + ora + ", partecipante1=" + partecipante1
				+ ", partecipante2=" + partecipante2 + ", campionato=" + campionato + "]";
	}
}
