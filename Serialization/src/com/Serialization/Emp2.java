package com.Serialization;

import java.io.Serializable;

public class Emp2 implements Serializable {

	int eid;
	transient String ename;

	public Emp2(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

}
