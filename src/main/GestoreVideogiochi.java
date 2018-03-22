package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import core.Sfida;
import exception.IdDuplicatoException;

public class GestoreVideogiochi {

	ArrayList<Sfida> sfide = new ArrayList<>();

	public void caricaDaFile(String path) throws FileNotFoundException {
		File f = new File(path);
		Scanner sc = new Scanner(f);
		// TODO
		sc.close();
	}

	public void inserisci(Sfida s) throws IdDuplicatoException {
		for (Sfida i : sfide)
			if (i.getId().equals(s.getId()))
				throw new IdDuplicatoException("Id già esistente", s.getId());
		sfide.add(s);
	}

	public void stampa(boolean perOra) {

		Sfida.setOrdinamento(perOra);

		Collections.sort(sfide);

		System.out.println(sfide.toString());
	}

}
