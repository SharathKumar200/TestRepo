package com.Serialization;

import java.io.Serializable;

public class Emp implements Serializable{

	int eid;
	transient String ename;

	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

}
