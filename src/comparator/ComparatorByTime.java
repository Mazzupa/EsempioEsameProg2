package comparator;

import java.util.Comparator;

import core.Sfida;

public class ComparatorByTime implements Comparator<Sfida> {

	@Override
	public int compare(Sfida o1, Sfida o2) {
		return o1.getOra().compareTo(o2.getOra());
	}

}
