package comparator;

import java.util.Comparator;

import core.Sfida;

public class ComparatorByScore implements Comparator<Sfida>{

	@Override
	public int compare(Sfida o1, Sfida o2) {
		return o1.getPunteggio() - o2.getPunteggio();
	}

	
	
}
