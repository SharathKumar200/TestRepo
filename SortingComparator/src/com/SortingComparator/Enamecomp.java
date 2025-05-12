package com.SortingComparator;

import java.util.Comparator;

public class Enamecomp implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {

		return o1.ename.compareTo(o2.ename);
	}

}
