package core;

import exception.IdNonValidoException;
import exception.OraNonValidaException;
import prog.utili.Orario;

public abstract class Sfida implements Comparable<Sfida> {

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
			boolean campionato) throws IdNonValidoException, OraNonValidaException {

		if (Integer.parseInt(id) >= 0)
			throw new IdNonValidoException("Id inserito non valido");
		this.id = id;
		this.descrizione = descrizione;
		if (ora.getOre() < 7 || ora.getOre() > 24)
			throw new OraNonValidaException("Ora inserita non valida");
		this.ora = ora;
		this.partecipante1 = partecipante1;
		this.partecipante2 = partecipante2;
		this.campionato = campionato;
		numSfide++;
	}

	public Sfida(char c, String descrizione, Orario ora, String partecipante1, String partecipante2, boolean campionato)
			throws IdNonValidoException, OraNonValidaException {
		this(c + "" + Integer.toString(numSfide), descrizione, ora, partecipante1, partecipante2, campionato);
	}

	public abstract int getPunteggio();

	@Override
	public String toString() {
		return "Sfida [id + " + id + " descrizione=" + descrizione + ", ora=" + ora + ", partecipante1=" + partecipante1
				+ ", partecipante2=" + partecipante2 + ", campionato=" + campionato + "]";
	}

	@Override
	public int compareTo(Sfida s) {
		return this.ora.compareTo(s.ora);
	}

}
