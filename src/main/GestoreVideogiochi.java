/**
 * @author Mazzucchetti Patrick
 */

package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import core.Sfida;
import exception.IdDuplicatoException;

public class GestoreVideogiochi {

	private ArrayList<Sfida> sfide = new ArrayList<>();

	/**
	 * 
	 * @param path
	 * @throws FileNotFoundException
	 */
	public void caricaDaFile(String path) throws FileNotFoundException {
		File f = new File(path);
		Scanner sc = new Scanner(f);
		// TODO
		sc.close();
	}

	/**
	 * 
	 * @param s
	 * @throws IdDuplicatoException
	 */
	public void inserisci(Sfida s) throws IdDuplicatoException {
		for (Sfida i : sfide)
			if (i.getId().equals(s.getId()))
				throw new IdDuplicatoException("Id già esistente", s.getId());
		sfide.add(s);
	}

	public void Stampa(Comparator<Sfida> comparator) {

		Collections.sort(sfide, comparator);

		for (Sfida i : sfide)
			System.out.println(i.getPunteggio());
	}

	public void Stampa() {
		for (Sfida i : sfide)
			System.out.println(i.toString());
	}
}
