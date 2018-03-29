/**
 * @author Mazzucchetti Patrick
 */
package main;

import comparator.*;
import core.*;
import exception.*;
import prog.utili.Orario;

public class Main {

	public static void main(String[] args) throws OraNonValidaException, PunteggioNonValidoException, IdDuplicatoException {

		GestoreVideogiochi gv = new GestoreVideogiochi();

		SfidaNormale sn = new SfidaNormale("descrizione", new Orario(07, 30), "partecipante1", "partecipante2", true,
				"luogoSfida");
		
		SfidaPacifica sp = new SfidaPacifica("descrizione", new Orario(12,30), "partecipante1", "partecipante2", false);
		
		SfidaCompetizione sc = new SfidaCompetizione("descrizione", new Orario(14,30), "partecipante1", "partecipante2", true, 5);
		
		gv.inserisci(sc);
		gv.inserisci(sn);
		gv.inserisci(sp);
		
		ComparatorByTime cbt = new ComparatorByTime();
		
		gv.Stampa(cbt);

	}
}
